package com.sdet.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	
	

	    protected WebDriver driver;

	    protected WebDriverWait wait;
	    
	    protected String baseUrl = "https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/";


	 

	    public BasePage(WebDriver driver) {

	        this.driver = driver;

	        wait = new WebDriverWait(driver, 60); // 60 seconds timeout

	        PageFactory.initElements(driver, this);

	    }

	 


	    public void navigateToURL(String url) {

	        driver.get(url);

	    }

	 

	    public String getTitle() {

	        return driver.getTitle();

	    }

	}


