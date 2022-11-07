import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.*;
import com.projectlibre1.exchange.LocalFileImporter;
import com.projectlibre1.graphic.configuration.SpreadSheetFieldArray;
import com.projectlibre1.offline_graphics.GanttSVGRenderer;
import com.projectlibre1.offline_graphics.SVGRenderer;
import com.projectlibre1.pm.graphic.model.cache.NodeModelCache;
import com.projectlibre1.pm.graphic.model.cache.NodeModelCacheFactory;
import com.projectlibre1.pm.graphic.model.cache.ReferenceNodeModelCache;
import com.projectlibre1.pm.graphic.views.GanttView;
import com.projectlibre1.pm.graphic.views.synchro.Synchronizer;
import com.projectlibre1.pm.task.Project;
import com.projectlibre1.print.ExtendedPageFormat;
import com.projectlibre1.print.GraphPageable;
import com.projectlibre1.print.ViewPrintable;
import com.projectlibre1.session.LoadOptions;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfExportTest {

    @Test
    public void savePdf() throws Exception {
        GraphPageable document = loadDocument();
        exportToFile(document);
    }

    private void exportToFile(GraphPageable pageable) throws DocumentException, PrinterException, IOException {

        final File file = new File("src/test/resources/russianPdfExport/out.pdf");

        Document document = new Document();;
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));;
        pageable.update();
        int pageCount = pageable.getNumberOfPages();
        if (pageCount > 0) {
            ViewPrintable printable = pageable.getSafePrintable();
            ExtendedPageFormat pageFormat = pageable.getSafePageFormat();
            double width = pageFormat.getWidth();
            double height = pageFormat.getHeight();

            for (int p = 0; p < pageCount; p++) {
                document.setPageSize(new Rectangle((float) width, (float) height));
                if (p == 0)
                    document.open();
                else document.newPage();

                PdfContentByte cb = writer.getDirectContent();
                final String FONT = "src/test/resources/russianPdfExport/arial.ttf";
                BaseFont bf = BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
                Font awtFont = new Font("arial", Font.PLAIN, 22);
                FontMapper fontMapper = new FontMapper() {
                    @Override
                    public BaseFont awtToPdf(Font font) {
                        return bf;
                    }

                    @Override
                    public Font pdfToAwt(BaseFont font, int size) {
                        return awtFont;
                    }
                };
                PdfGraphics2D g = new PdfGraphics2D(cb, (float) width, (float) height, fontMapper, false, false, 0);
                g.setFont(awtFont);

                printable.print(g, p);
                g.dispose();
            }
            document.close();
        }
    }

    private GraphPageable loadDocument() throws Exception {
        LoadOptions opt = new LoadOptions();
        String fileNae = "src/test/resources/russianPdfExport/test.pod";
        LocalFileImporter localFileImporter = new LocalFileImporter();
        localFileImporter.setFileName(fileNae);
        localFileImporter.importFile();
        Project project = localFileImporter.getProject();

        ReferenceNodeModelCache taskCache = NodeModelCacheFactory.createTaskNodeModelCache(project, project.getTaskModel());
        project.setTaskCache(taskCache);
        GanttView ganttView = new GanttView(project, new Synchronizer());
        SpreadSheetFieldArray spreadSheetFieldArray = project.getFieldArray();
        SVGRenderer renderer;
        renderer = new GanttSVGRenderer();
        NodeModelCache cache = NodeModelCacheFactory.getInstance().createFilteredCache((ReferenceNodeModelCache) project.getTaskCache(), "OfflineGantt", null);
        ((GanttSVGRenderer) renderer).init(project, cache, spreadSheetFieldArray, null, 2, true);
        renderer.getParams().setSupportLeftAndRightParts(true);
        GraphPageable document = new GraphPageable(renderer, true, true, true);
        return document;
    }


}
