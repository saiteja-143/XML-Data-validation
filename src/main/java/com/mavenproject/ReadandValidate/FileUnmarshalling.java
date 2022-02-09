package com.mavenproject.ReadandValidate;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;


import org.xml.sax.SAXException;

import com.XML.javaObject.Students;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class FileUnmarshalling {
	Validator validator = new Validator();

	public void ReadFileFromMain(File file) throws JAXBException, SAXException, IOException {

		JAXBContext context = JAXBContext.newInstance(Students.class);// step 1: creating the Context object from JAXBContext
		Unmarshaller unmarshaller = context.createUnmarshaller();// Step 2: Creating Unmarshaller Object from the context Object

//		SchemaFactory schemafactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//		schemafactory.newSchema(new File("input.xsd"));

		JAXBElement<Students> rootElement = unmarshaller.unmarshal(new StreamSource(file), Students.class);
		Students students = rootElement.getValue();
		validator.Validate(students);

	}
}
