/*******************************************************************************
 * The contents of this file are subject to the Common Public Attribution License 
 * Version 1.0 (the "License"); you may not use this file except in compliance with 
 * the License. You may obtain a copy of the License at 
 * http://www.projectlibre.com/license . The License is based on the Mozilla Public 
 * License Version 1.1 but Sections 14 and 15 have been added to cover use of 
 * software over a computer network and provide for limited attribution for the 
 * Original Developer. In addition, Exhibit A has been modified to be consistent 
 * with Exhibit B. 
 *
 * Software distributed under the License is distributed on an "AS IS" basis, 
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for the 
 * specific language governing rights and limitations under the License. The 
 * Original Code is ProjectLibre. The Original Developer is the Initial Developer 
 * and is ProjectLibre Inc. All portions of the code written by ProjectLibre are 
 * Copyright (c) 2012-2019. All Rights Reserved. All portions of the code written by 
 * ProjectLibre are Copyright (c) 2012-2019. All Rights Reserved. Contributor 
 * ProjectLibre, Inc.
 *
 * Alternatively, the contents of this file may be used under the terms of the 
 * ProjectLibre End-User License Agreement (the ProjectLibre License) in which case 
 * the provisions of the ProjectLibre License are applicable instead of those above. 
 * If you wish to allow use of your version of this file only under the terms of the 
 * ProjectLibre License and not to allow others to use your version of this file 
 * under the CPAL, indicate your decision by deleting the provisions above and 
 * replace them with the notice and other provisions required by the ProjectLibre 
 * License. If you do not delete the provisions above, a recipient may use your 
 * version of this file under either the CPAL or the ProjectLibre Licenses. 
 *
 *
 * [NOTE: The text of this Exhibit A may differ slightly from the text of the notices 
 * in the Source Code files of the Original Code. You should use the text of this 
 * Exhibit A rather than the text found in the Original Code Source Code for Your 
 * Modifications.] 
 *
 * EXHIBIT B. Attribution Information for ProjectLibre required
 *
 * Attribution Copyright Notice: Copyright (c) 2012-2019, ProjectLibre, Inc.
 * Attribution Phrase (not exceeding 10 words): 
 * ProjectLibre, open source project management software.
 * Attribution URL: http://www.projectlibre.com
 * Graphic Image as provided in the Covered Code as file: projectlibre-logo.png with 
 * alternatives listed on http://www.projectlibre.com/logo 
 *
 * Display of Attribution Information is required in Larger Works which are defined 
 * in the CPAL as a work which combines Covered Code or portions thereof with code 
 * not governed by the terms of the CPAL. However, in addition to the other notice 
 * obligations, all copies of the Covered Code in Executable and Source Code form 
 * distributed must, as a form of attribution of the original author, include on 
 * each user interface screen the "ProjectLibre" logo visible to all users. 
 * The ProjectLibre logo should be located horizontally aligned with the menu bar 
 * and left justified on the top left of the screen adjacent to the File menu. The 
 * logo must be at least 144 x 31 pixels. When users click on the "ProjectLibre" 
 * logo it must direct them back to http://www.projectlibre.com. 
 *******************************************************************************/
package org.projectlibre.export;


import com.lowagie.text.Document;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.FontMapper;
import com.lowagie.text.pdf.PdfGraphics2D;
import com.lowagie.text.pdf.PdfWriter;
import com.projectlibre1.job.Job;
import com.projectlibre1.job.JobQueue;
import com.projectlibre1.job.JobRunnable;
import com.projectlibre1.print.ExtendedPageFormat;
import com.projectlibre1.print.GraphPageable;
import com.projectlibre1.print.ViewPrintable;
import com.projectlibre1.session.SessionFactory;
import org.apache.poi.util.IOUtils;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class ImageExport {
	public static void export(final GraphPageable pageable,Component parentComponent) throws IOException{
		final File file=chooseFile(pageable.getRenderer().getProject().getName(),parentComponent);
		final JobQueue jobQueue=SessionFactory.getInstance().getJobQueue();
		Job job=new Job(jobQueue,"Image Export","Exporting Image...",true,parentComponent);
		job.addRunnable(new JobRunnable("Image Export",1.0f){
			public Object run() throws Exception{
				boolean pdf=true;
				if (file.getName().endsWith(".png"))
					pdf=false;
				Document document = null;
				PdfWriter writer = null;
				if (pdf){
					document = new Document();
					writer = PdfWriter.getInstance(document, new FileOutputStream(file));
				}else{

				}
				pageable.update();
				int pageCount = pageable.getNumberOfPages();


				if (pageCount>0){
					ViewPrintable printable=pageable.getSafePrintable();
					ExtendedPageFormat pageFormat=pageable.getSafePageFormat();
					double width=pageFormat.getWidth();
					double height=pageFormat.getHeight();
					float startIncrement=0.1f;
					float endIncrement=0.0f;
					float progressIncrement = (1.0f-startIncrement-endIncrement)/pageCount;
					for (int p=0;p< pageCount;p++) {
						setProgress(startIncrement+p*progressIncrement);
						if (pdf){
							document.setPageSize(new Rectangle((float)width,(float)height));
							if (p==0)
								document.open();
							else document.newPage();
							Graphics2D g = new PdfGraphics2D(writer.getDirectContent(), (float) width, (float) height, createFontMapper(), false, false, 0);
							printable.print(g, p);
							g.dispose();
						}else{
							BufferedImage bi = new BufferedImage((int)width, (int)height,BufferedImage.TYPE_INT_ARGB);

							Graphics2D g2 = (Graphics2D)bi.createGraphics();
							g2.setBackground(Color.WHITE);
							printable.print(g2, p);
				            g2.dispose();
				            ImageIO.write(bi, "png", new FileOutputStream(file));
				            break;
						}
					}
					if (pdf)
						document.close();
				}
				setProgress(1.0f);
				return null;
			}

			private FontMapper createFontMapper() throws IOException {
				InputStream inputStream = getClass().getClassLoader().getResourceAsStream("fonts/FreeSans.ttf");
				byte[] bytes = IOUtils.toByteArray(inputStream);
				BaseFont bf = BaseFont.createFont("FreeSans.ttf",  BaseFont.IDENTITY_H, BaseFont.EMBEDDED, true, bytes, null);
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
				return fontMapper;
			}

		});
		jobQueue.schedule(job);
	}

    private static JFileChooser chooser=null;
    private static FileFilter pdfFilter=null;
    private static FileFilter pngFilter=null;
    private static File chooseFile(String projectName, Component parentComponent) {
    	if (chooser == null){
    		pdfFilter=new FileFilter(){
    		    public boolean accept(File f){
    		    	return f.isDirectory()||f.getName().toLowerCase().endsWith(".pdf");
    		    }
    		    public String getDescription(){
    		    	return "PDF (*.pdf)";
    		    }
    		};
    		pngFilter=new FileFilter(){
    		    public boolean accept(File f){
    		    	return f.isDirectory()||f.getName().toLowerCase().endsWith(".png");
    		    }
    		    public String getDescription(){
    		    	return "PNG (*.png)";
    		    }
    		};
    		chooser = new JFileChooser();
    		chooser.putClientProperty("FileChooser.useShellFolder", Boolean.FALSE);
    		chooser.setDialogType(JFileChooser.SAVE_DIALOG);
    		chooser.addChoosableFileFilter(pdfFilter);
    		chooser.addChoosableFileFilter(pngFilter);
    	}
		if (projectName.length()==0)
			projectName="project";
		chooser.setSelectedFile(new File(projectName+".pdf"));
		chooser.setFileFilter(pdfFilter);
		if (chooser.showDialog(parentComponent, null) == JFileChooser.APPROVE_OPTION){
			File file=chooser.getSelectedFile();
			if (!file.getName().endsWith(".pdf")&&!file.getName().endsWith(".png")) file=new File(file.getName()+".pdf"); //add pdf extension if missing
			return file;
		} else return null;
    }

}
