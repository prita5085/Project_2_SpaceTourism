package com.revature.runner;
import org.junit.AfterClass;       
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pages.SpacePage;

import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/CUST_FILTER_BOOK_4.feature", glue = {"com.revature.steps"})
public class SpaceRunner {

	public static WebDriver driver;
	public static SpacePage spacePage;
	

	@BeforeClass
	public static void setUp() {
		String path = "C:/Selenium/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		driver = new ChromeDriver();
		spacePage = new SpacePage(driver);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
	
	
}

