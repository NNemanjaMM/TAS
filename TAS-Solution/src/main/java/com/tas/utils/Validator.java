package com.tas.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Validator {
	
	private static final String SCHEMA_PATH = "src\\main\\resources\\com\\tas\\schemas\\ComponentsSchema.xsd";

	@SuppressWarnings("unused")
 	public static void checkWellFormness(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
		
 		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 		
		DocumentBuilder builder = factory.newDocumentBuilder();	
		InputStream stream = new FileInputStream(xmlFile);
		
		Document document = builder.parse(stream);
 	}
 
 	public static void checkValidity(File xmlFile) throws SAXException, IOException {	
 		
		Source schemaFile = new StreamSource(new File(SCHEMA_PATH));	 		
		Source stream = new StreamSource(xmlFile);
		
	    SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	    Schema schema = factory.newSchema(schemaFile);
	    javax.xml.validation.Validator validator = schema.newValidator();	
	    
        validator.validate(stream);
	 }
}