package com.sdet.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sdet.pages.BaseTest;
import com.sdet.pages.ContactPage;
import com.sdet.pages.HomePage;

public class TestCases extends BaseTest {

    @Test

    public void testVerifyTitles() {

        HomePage homePage = new HomePage(driver);

        homePage.navigateToHomePage();

        AssertJUnit.assertEquals(homePage.getTitle(), "Want to practice test automation? Try these demo sites! | Automation Panda");

 

        homePage.clickContactLink();

        ContactPage contactPage = new ContactPage(driver);

        AssertJUnit.assertEquals(contactPage.getTitle(), "Contact | Automation Panda");

    }

 

    @Test

    public void testFillContactForm() {

        ContactPage contactPage = new ContactPage(driver);

        contactPage.navigateToContactPage();
        
        contactPage.fillFormAndSubmit("Vijay", "vkappali@gmail.com", "test");
        
        
        
        AssertJUnit.assertEquals(contactPage.getMessage(), "Your message has been sent");
 

       

    }

}