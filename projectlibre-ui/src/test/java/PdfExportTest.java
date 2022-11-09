import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
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
import org.apache.poi.util.IOUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PdfExportTest {

    @BeforeAll
    public static void clear() throws IOException {
        Files.deleteIfExists(Paths.get("src/test/resources/russianPdfExport/out.pdf"));
    }

    @Test
    public void testLoadFont() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("fonts/FreeSans.ttf");
        byte[] bytes = IOUtils.toByteArray(inputStream);
        BaseFont bf1 = BaseFont.createFont("FreeSans.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, true, bytes, null);
        Assert.assertNotNull(bf1);
    }

    @Test
    public void savePdf() throws Exception {
        //GIVEN
        GraphPageable document = loadDocument();

        //WHEN
        exportToFile(document);

        //THEN
        Files.exists(Paths.get("src/test/resources/russianPdfExport/out.pdf"));
    }

    private void exportToFile(GraphPageable pageable) throws DocumentException, PrinterException, IOException {

        final File file = new File("src/test/resources/russianPdfExport/out.pdf");

        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
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

                InputStream inputStream = getClass().getClassLoader().getResourceAsStream("fonts/FreeSans.ttf");
                byte[] bytes = IOUtils.toByteArray(inputStream);
                BaseFont bf = BaseFont.createFont("arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, true, bytes, null);
                FontMapper fontMapper = new FontMapper() {
                    @Override
                    public BaseFont awtToPdf(Font font) {
                        return bf;
                    }

                    @Override
                    public Font pdfToAwt(BaseFont font, int size) {
                        throw new RuntimeException("Not supported");
                    }
                };
                PdfGraphics2D g = new PdfGraphics2D(writer.getDirectContent(), (float) width, (float) height, fontMapper, false, false, 0);

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
