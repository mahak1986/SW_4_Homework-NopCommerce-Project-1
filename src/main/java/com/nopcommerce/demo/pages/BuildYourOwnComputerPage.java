package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    By buildYourOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");

    public String getTextFromBuildYourOwnComputerHeading() {

        return getTextFromElement(buildYourOwnComputerText);
    }
    By processorOption = By.xpath(
            "//select[@id='product_attribute_1']");
    public void selectProcessOption(){
        selectByVisibleText(processorOption, "2.2 GHz Intel Pentium Dual-Core E2200");
    }
    By ramOption = By.xpath("//select[@id='product_attribute_2']");
    public void selectRamOption(){
       selectByVisibleText(ramOption, "8GB [+$60.00]");
    }
    By hddOption = By.xpath("//input[@id='product_attribute_3_7']");
    public void selectHddOption(){
        clickOnElement(hddOption);
    }

    By osOption =  By.xpath("//input[@id='product_attribute_4_9']");
    public void selectOsOption(){
        clickOnElement(osOption);
    }
    By softwareOption = By.xpath("//input[@id='product_attribute_5_12']");
    public void selectSoftwareOption(){
        clickOnElement(softwareOption);
    }

    By priceText = By.xpath("//span[@id='price-value-1']");
    public String getTextFromPriceHeading(){
        return getTextFromElement(priceText);
    }

    //Click on "ADD TO CART" Button.
    By addToCartOption = By.xpath("//button[@id='add-to-cart-button-1']");
    public void addToCartOption(){

        clickOnElement(addToCartOption);
    }

    //Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By productAddedToCartText = By.xpath("//body/div[@id='bar-notification']/div[1]");

    public String getTheProductAddedToCartText(){

        return getTextFromElement(productAddedToCartText);
    }
    //close the bar clicking on the cross button
    By closeBarOption = (By.xpath("//span[@class = 'close']"));
    public void closeBarOption(){

        clickOnElement(closeBarOption);
    }
    //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By shoppingCartOption = (By.xpath("//a[@class='ico-cart']"));
    public void mouseHoverOnShoppingCartOption(){
        mouseHoverToElement(shoppingCartOption);
    }
    //and Click on "GO TO CART" button.
    By goToCartOption = (By.xpath(
            "//span[@class='cart-label']"));
    public void goToCartOptionButton(){

        clickOnElement(goToCartOption);
    }
}
