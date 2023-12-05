package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutWelcomePage extends Utility {

    //Verify the Text “Welcome, Please Sign In!”
    By welcomeTitle = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    public String getTextFromWelcomeSignInTitle() {
        return getTextFromElement(welcomeTitle);
    }

    //Click on “CHECKOUT AS GUEST” Tab
    By checkOutAsGuestButton = (By.xpath("//button[normalize-space()='Checkout as Guest']"));
    public void clickCheckOutAsGuestButton(){
        clickOnElement(checkOutAsGuestButton);
    }
}
