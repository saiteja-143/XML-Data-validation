package com.ust;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.xml.sax.SAXException;

import com.mavenproject.ReadandValidate.FileUnmarshalling;

import jakarta.xml.bind.JAXBException;

public class App
{
	public static void main( String[] args )throws IOException,FileNotFoundException, JAXBException, SAXException
	{
		File file = new File(args[0]);

		FileUnmarshalling fileUnmarshalling = new FileUnmarshalling();
		fileUnmarshalling.ReadFileFromMain(file);
		
	}
}

			
