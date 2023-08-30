package com.sdet.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;

 

public class ContactPage extends BasePage {

    @FindBy(id = "g3-name")

    private WebElement nameField;

 

    @FindBy(id = "g3-email")

    private WebElement emailField;

 

    @FindBy(id = "contact-form-comment-g3-message")

    private WebElement commentField;

 

    @FindBy(xpath = "//*[text()='Contact Me']")

    private WebElement submitButton;

 

    @FindBy(id = "contact-form-success-header")

    private WebElement messageLabel;

 

    public ContactPage(WebDriver driver) {

        super(driver);

    }

 

    public void fillFormAndSubmit(String name, String email, String comment) {

        wait.until(ExpectedConditions.visibilityOf(nameField)).sendKeys(name);

        wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);

        wait.until(ExpectedConditions.visibilityOf(commentField)).sendKeys(comment);

        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

    }

 

    public String getMessage() {

        return wait.until(ExpectedConditions.visibilityOf(messageLabel)).getText();

    }

 

    public void navigateToContactPage() {

        navigateToURL(baseUrl + "/contact");

    }

}



