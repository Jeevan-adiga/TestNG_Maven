package com.example.utils;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		XmlSuite suite = new XmlSuite();
		suite.setName("TmpSuite");
		 
		XmlTest test = new XmlTest(suite);
		test.setName("TmpTest");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("com.example.testCases.TestCase01"));
		test.setXmlClasses(classes) ;
		
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);

		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);

		CustomReporter rep = new CustomReporter();
		tng.addListener(rep);
		
		CustomListner listner = new CustomListner();
		tng.addListener(listner);
		
//		TestListenerAdapter tla = new TestListenerAdapter();
//		tng.addListener(tla);
		
		tng.run();

	}

}
