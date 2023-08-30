package com.sdet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    // ... other elements and methods ...

 

    public void navigateToHomePage() {

        navigateToURL(baseUrl);

    }

  //  @FindBy(linkText = "Contact")
    @FindBy(xpath  = "//*[text()='Contact']")
    private WebElement contactLink;

 

    public HomePage(WebDriver driver) {

        super(driver);

    }

 

    public void clickContactLink() {
    	wait.until(ExpectedConditions.visibilityOf(contactLink));
        wait.until(ExpectedConditions.elementToBeClickable(contactLink));
        contactLink.click();

    }
}