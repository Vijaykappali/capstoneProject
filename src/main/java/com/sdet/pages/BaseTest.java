package com.sdet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    protected WebDriver driver;

protected String baseUrl = "https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/";

 

    @BeforeSuite

    public void suiteSetUp() {

        // Set up WebDriver instance )

    	//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    	
    	WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

    }

 

    @AfterSuite

    public void suiteTearDown() {

        if (driver != null) {

            driver.quit();

        }

    }

}