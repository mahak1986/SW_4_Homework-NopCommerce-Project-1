package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By computerMenu = (By.xpath("//a[text()='Computers ']"));
    By registerLink = By.linkText("Register");
    By topMenu = By.xpath("//ul[@class = 'top-menu notmobile']");

    By desktopMenu = (By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']"));
    By electronicMenu = By.xpath("//a[text()= 'Electronics ']");
    public String findAllTabsInTopMenu (){
        List<WebElement> searchResults = driver.findElements(topMenu);
        ArrayList<String> searchResult = new ArrayList<>();
        for (WebElement e : searchResults) {//e object of webElement
            searchResult.add(e.getText());
        }
        for (String result : searchResult) {
            System.out.println(result);
            return result;
        }
        return null;
    }



    public void clickOnLoginLink(){

        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){

        clickOnElement(registerLink);
    }
    public void clickOnTopMenu(){
        clickOnElement(topMenu);
    }
    public void clickOnComputerMenu(){

        clickOnElement(computerMenu);
    }
    public void clickOnDesktopMenu(){

        clickOnElement(desktopMenu);
    }
    public void clickOnElectronicsMenu(){
        clickOnElement(electronicMenu);
    }
}
