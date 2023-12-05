package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    By dropDownOptionZtoA = By.xpath("//option[contains(text(),'Name: Z to A')]");

    public void selectDropdownOptionZtoA() {
        clickOnElement(dropDownOptionZtoA);
    }

    By dropDownOptionAtoZ = By.xpath("//option[contains(text(),'Name: A to Z')]");

    public void selectDropdownOptionAtoZ() {
        clickOnElement(dropDownOptionAtoZ);
    }

    By listOfProducts = By.xpath("//h2[@class='product-name']/a");
    public String listOfProducts(){
        return getTextFromElement(listOfProducts);
    }

    public void verifyProductsAreInTheRightOrder() {
        List<WebElement> productNames = driver.findElements(listOfProducts);
        List<String> productNameStrings = new ArrayList<String>();
        for (WebElement productName : productNames) {
            productNameStrings.add(productName.getText());
        }
        List<String> sortedProductNames = new ArrayList<String>(productNameStrings);
        Collections.sort(sortedProductNames, Collections.reverseOrder());
    }

    By addToCartButton = By.xpath("//a[text() = 'Build your own computer']");
    public void clickAddToCartButton() {
        mouseHoverToElementAndClick(addToCartButton);
    }
}
