package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.UUID;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    // Enter Email
    public String randomEmail = randomEmail();
    By emailAddressOption = By.id("Email");
    public void enterEmailAddress(){

        sendTextToElement(emailAddressOption, randomEmail);
    }

    private static String randomEmail() {

        return "random-" + UUID.randomUUID().toString() + "@gmail.com";
    }

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

}
