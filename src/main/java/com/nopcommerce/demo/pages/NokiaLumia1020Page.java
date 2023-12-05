package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NokiaLumia1020Page extends Utility {
    //Verify the text “Nokia Lumia 1020”
    By nokiaLumaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");

    public String verifyNokiaLuma1020Text() {

        return getTextFromElement(nokiaLumaText);
    }
    //Verify the price “$349.00”
    By nokiaLumiaPriceText = (By.id("price-value-20"));
    public String verifyNokiaLumiaPriceText(){

        return getTextFromElement(nokiaLumiaPriceText);
    }
    //Change quantity to 2
    By quantityOption = By.xpath("//input[@id='product_enteredQuantity_20']");
    public void updateQuantityOption(){
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a");
        sendTextToElement(quantityOption,"2");
    }
    //Click on “ADD TO CART” tab
    By addToCartOption = (By.id("add-to-cart-button-20"));
    public void clickOnAddToCart(){

        clickOnElement(addToCartOption);
    }
    //Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By productAddedToShoppingCartText = By.xpath("//div[@id='bar-notification']/div/p");

    public String verifyTheProductHasBeenAddedToYourShoppingCartText() {
        return getTextFromElement(productAddedToShoppingCartText);
    }
    //After that close the bar clicking on the cross button
    By clickOnGreenCross = (By.xpath("//span[@class = 'close']"));
    public void clickOnGreenCrossOption(){

        clickOnElement(clickOnGreenCross);
    }
    //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    //By shoppingCartButtonOption = By.xpath("//button[contains(text(),'Go to cart')]");
    By shoppingCartButtonOption = (By.xpath("//a[@class='ico-cart']"));
    public void mouseHoverOnShoppingCartOption() {
        mouseHoverToElement(shoppingCartButtonOption);
    }
    //and Click on "GO TO CART" button.
    By goToCartOption = By.xpath("//button[contains(text(),'Go to cart')]");
    public void clickOnGoToCartOption() {

        clickOnElement(goToCartOption);
    }
}
