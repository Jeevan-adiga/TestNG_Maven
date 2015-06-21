package com.example.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.example.utils.Log;

public class TestCase01 {

	WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		
//		File file = new File("./resources/IEDriverServer.exe");
//		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
//		driver = new InternetExplorerDriver();
//		driver.get("http://www.imdb.com");
	}
	
	@Test
	public void testCase1() {
		Log.startTestCase("testCase1");
		System.out.println("TestCase 1");
		Log.info("TestCase 1");
		Log.endTestCase("1");
	}

	@Test
	public void testCase2() {
		Log.startTestCase("testCase2");
		System.out.println("TestCase 2");
		Log.info("TestCase2");
		Assert.fail("Assert Failed Message");
		Log.endTestCase("2");
	}

	@Test
	public void testCase3() {
		Log.startTestCase("testCase3");
		System.out.println("TestCase 3");
		Log.info("TestCase3");
		Assert.fail("Assert Failed Message - TestCase 3");
		Log.endTestCase("3");
	}

}
