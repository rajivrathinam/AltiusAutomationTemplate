package com.altius.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAutomation {

WebDriver driver;
	
	@BeforeTest
	public void beforeExecution(){
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void sampleTest(){
		driver.get("http://www.google.com");
		driver.close();
	}
	
}
