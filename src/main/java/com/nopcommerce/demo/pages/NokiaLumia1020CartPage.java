package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumia1020CartPage extends Utility {
    // Verify the message "Shopping cart"
    By verifyNokiaLumiaShoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public String verifyNokiaLumiaCartText() {

        return getTextFromElement(verifyNokiaLumiaShoppingCartText);
    }

    //Verify the quantity is 2
    By verifyQuantity2 = (By.xpath("//input[@class = 'qty-input']"));

    public String verifyQuantityText() {

        return getTextFromElement(verifyQuantity2);
    }
    //Verify the Total $698.00
    By verifyNokiaLumiaPriceText = (By.xpath("//span[text() = '$698.00']"));
    public String verifyPriceTotal(){

        return getTextFromElement(verifyNokiaLumiaPriceText);
    }
    //click on checkbox “I agree with the terms of service”
    By checkTermsOfServiceOption = (By.id("termsofservice"));
    public void checkTermsOfService(){

        clickOnElement(checkTermsOfServiceOption);
    }
    //Click on “CHECKOUT
    By clickOnCheckOut = (By.id("checkout"));
    public void clickOnCheckout(){
        clickOnElement(clickOnCheckOut);
    }
}
