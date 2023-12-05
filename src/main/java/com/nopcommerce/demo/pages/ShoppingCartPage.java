package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    //Verify the message "Shopping cart"
    By shoppingCartText = (By.xpath("//h1[normalize-space()='Shopping cart']"));

    public String getShoppingCartText() {

        return getTextFromElement(shoppingCartText);
    }

    //Change the Qty to "2" and Click on "Update shopping cart"
    By quantityOption = By.xpath("//input[@class='qty-input']");

    public void quantityUpdateOption() {
        clickOnElement(quantityOption);
        clearTextField(quantityOption);
        //sendTextToElement(quantityOption, Keys.CONTROL +"a");
        sendTextToElement(quantityOption, "2");
    }

    //and Click on "Update shopping cart"
    By shoppingCartOption = (By.xpath("//button[@id='updatecart']"));
    public void updateShoppingCart() {

        clickOnElement(shoppingCartOption);
    }
    //Verify the Total"$2,950.00"

    By totalPriceOption = (By.xpath("//span[@class='product-subtotal']"));

    public String getTextFromFinalPrice() {

        return getTextFromElement(totalPriceOption);
    }

    //click on checkbox “I agree with the terms of service”
    By termsOfServiceOption = (By.xpath("//input[@id='termsofservice']"));

    public void clickOnTermsOfServiceOption() {
        clickOnElement(termsOfServiceOption);
    }

    //Click on “CHECKOUT”
    By checkoutOption = (By.id("checkout"));

    public void clickOnCheckoutOption() {

        clickOnElement(checkoutOption);
    }
}
