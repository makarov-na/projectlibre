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
package org.projectlibre.core.configuration;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jakarta.xml.bind.*;
import org.projectlibre.core.dictionary.Dictionary;
import org.projectlibre.core.dictionary.DictionaryCategory;
import org.projectlibre.core.dictionary.HasStringId;

import com.projectlibre.core.fields.FieldManager;

/**
 * @author Laurent Chretienneau
 *
 */
public class Configuration {
	protected static Configuration instance;
	protected List<ConfigurationFile> configurations=new ArrayList<ConfigurationFile>();
	protected Dictionary dictionary=new Dictionary();
	
	public static synchronized Configuration getInstance(){
		if (instance==null)
			instance=new Configuration();
		return instance;
	}

	public Dictionary getDictionary() {
		return dictionary;
	}
	
	public synchronized void register(String file,Class<?>... classesToBeBound){
		configurations.add(new ConfigurationFile(file, classesToBeBound));
	}
	
	public synchronized void load(){
//		try {
//			Thread.sleep(5000L);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		for (ConfigurationFile config : configurations){
			if (!config.isBinded()){
				config.setRoot(load(config.getFile(),config.getClassesToBeBound()));
				config.setBinded(true);
			}
		}
	}
	
	
	public class DictionaryListener extends Unmarshaller.Listener {

		@Override
		public void beforeUnmarshal(Object target, Object parent) {
		}

		@Override
		public void afterUnmarshal(Object target, Object parent) {
			if (target instanceof HasStringId)
				dictionary.add((HasStringId)target);
		}

	}
	
	
	
	public synchronized Object load(String resourceName, Class<?>... classesToBeBound) {
		try {
			JAXBContext context = JAXBContext.newInstance(classesToBeBound);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			unmarshaller.setSchema(null);
			unmarshaller.setListener(new DictionaryListener());
			InputStream in = Configuration.class.getClassLoader().getResourceAsStream(resourceName);
			//TODO handle null case if not found
			return unmarshaller.unmarshal(in);
		} catch(JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}
	public synchronized void save(String resourceName, Object configuration, Class<?> configurationClass) {
		try {
			JAXBContext context = JAXBContext.newInstance(configurationClass);
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(configuration, new File(resourceName));
		} catch(JAXBException e) {
			e.printStackTrace();
		}
	}
	public static synchronized void dump(Object obj, java.io.OutputStream out){
		dump(obj.getClass(),obj,out);
	}
	public static synchronized void dump(Class<?> classe, Object obj,  java.io.OutputStream out){
		if (obj==null)
			System.out.println("null");
		else{
			try {
				JAXBContext context = JAXBContext.newInstance(classe);
				Marshaller marshaller = context.createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				marshaller.marshal(obj, out);
			} catch (PropertyException e) {
				e.printStackTrace();
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void dumpDictionary(){
		try {
			JAXBContext context = JAXBContext.newInstance(dictionary.getClassesAsArray());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			for (DictionaryCategory category : dictionary.keySet()){
				System.out.println("============================== "+category+" ===============================");
				Map<String,HasStringId> map=dictionary.get(category);
				for(String id : map.keySet()){
					System.out.println("------------------ "+id+" ------------------");
					marshaller.marshal(map.get(id), System.out);
				}
			}
		} catch (PropertyException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
	
	protected FieldManager fieldManager=new FieldManager();

	public FieldManager getFieldManager() {
		return fieldManager;
	}



}
