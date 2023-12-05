package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaCheckOutPage extends Utility {
    //Verify the Text “Welcome, Please Sign In!”
    By welcomePleaseSignInText = (By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']"));

    public String verifyWelcomePleaseSignInText() {
        return getTextFromElement(welcomePleaseSignInText);
    }

    //Click on “REGISTER” tab
    By clickRegisterTab = By.xpath("//button[normalize-space()='Register']");

    public void clickOnRegisterTabOption() {
        clickOnElement(clickRegisterTab);
    }

    By continueTab1 = (By.xpath("//button[@class='button-1 new-address-next-step-button']"));

    public void clickOnBillingContinueTab() {
        clickOnElement(continueTab1);
    }
}
