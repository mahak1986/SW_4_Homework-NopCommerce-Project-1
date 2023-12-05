package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutWelcomePage checkOutPage = new CheckOutWelcomePage();
    CheckOutBillingPage billingPage = new CheckOutBillingPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();


    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        homePage.clickOnComputerMenu();
        homePage.clickOnDesktopMenu();
        desktopPage.selectDropdownOptionZtoA();
        List<WebElement> products = driver.findElements(By.xpath("//h2[@class='product-name']/a"));
        List<String> productNameStrings = new ArrayList<String>();
        for (WebElement productName : products) {
            productNameStrings.add(productName.getText());
        }
        List<String> sortedProductNames = new ArrayList<String>(productNameStrings);
        Collections.sort(sortedProductNames, Collections.reverseOrder());
        System.out.println(sortedProductNames);
    }
    
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputerMenu();
        homePage.clickOnDesktopMenu();
        desktopPage.selectDropdownOptionAtoZ();
        Thread.sleep(2000);
        desktopPage.clickAddToCartButton();
        String expectedMessage = "Build your own computer";
        Assert.assertEquals(buildYourOwnComputerPage.getTextFromBuildYourOwnComputerHeading(), expectedMessage, "Page not displayed");
        Thread.sleep(2000);
        buildYourOwnComputerPage.selectProcessOption();
        Thread.sleep(2000);
        buildYourOwnComputerPage.selectRamOption();
        Thread.sleep(2000);
        buildYourOwnComputerPage.selectHddOption();
        Thread.sleep(2000);
        buildYourOwnComputerPage.selectOsOption();
        Thread.sleep(2000);
        buildYourOwnComputerPage.selectSoftwareOption();
        Thread.sleep(2000);
        String expectedPrice = "$1,475.00";
        Assert.assertEquals(buildYourOwnComputerPage.getTextFromPriceHeading(), expectedPrice, "Price not matching");
        buildYourOwnComputerPage.addToCartOption();
        String expectedGreenBar = "The product has been added to your shopping cart";
        Assert.assertEquals(buildYourOwnComputerPage.getTheProductAddedToCartText(), expectedGreenBar, "Incorrect message");
        buildYourOwnComputerPage.closeBarOption();
        buildYourOwnComputerPage.mouseHoverOnShoppingCartOption();
        buildYourOwnComputerPage.goToCartOptionButton();
        String expectedText = "Shopping cart";
        Assert.assertEquals(shoppingCartPage.getShoppingCartText(), expectedText, "Incorrect message");
        shoppingCartPage.quantityUpdateOption();
        shoppingCartPage.updateShoppingCart();
        String expectedMessage4 = "$2,950.00";
        Assert.assertEquals(shoppingCartPage.getTextFromFinalPrice(), expectedMessage4, "Shopping cart");
        shoppingCartPage.clickOnTermsOfServiceOption();
        shoppingCartPage.clickOnCheckoutOption();
        Thread.sleep(2000);
        String expectedMessage1 = "Welcome, Please Sign In!";
        Assert.assertEquals(checkOutPage.getTextFromWelcomeSignInTitle(),expectedMessage1,"Error");
        checkOutPage.clickCheckOutAsGuestButton();
        billingPage.firstNameOption("Mahak");
        billingPage.lastNameOption("Agarwal");
        billingPage.emailFieldOption("mahak123@gmail.com");
        billingPage.selectUKFromDropdownOption("United Kingdom");
        billingPage.enterCity("London");
        billingPage.enterAddress("10 Wayfair Street");
        billingPage.enterPostalCode("W12 8DX");
        billingPage.enterPhoneNumberOption("07894567421");
        Thread.sleep(2000);
        billingPage.clickOnContinueButton();
        billingPage.clickOnTheShippingOption();
        Thread.sleep(2000);
        billingPage.clickOnSecondContinueButton();
        billingPage.selectCreditCardOption();
        billingPage.clickOnThirdContinueButton();
        Thread.sleep(2000);
        billingPage.selectMasterCardOptionFromDropdown("Master card");
        billingPage.enterCardHolderName("Mahak Agarwal");
        billingPage.enterCardNumber("0000 0000 0000 0000");
        billingPage.enterExpiryMonth("05");
        billingPage.enterExpiryYear("2025");
        billingPage.enterSecurityCode("306");
        billingPage.clickOnFourthContinueButton();
        String expectedMessage6 = "Credit Card";
        Assert.assertEquals(billingPage.getPaymentMethodText(), expectedMessage6, "Payment Method incorrect");
        String expectedMessage7 = "Shipping Method: Next Day Air";
        Assert.assertEquals(billingPage.getShippingMethodText(),expectedMessage7,"Error Message");
        String expectedMessage8 = "$2,950.00";
        Assert.assertEquals(billingPage.getTotalPriceText(),expectedMessage8,"Error Message");
        billingPage.clickOnConfirm();
        String expectedMessage9 = "Thank you";
        Assert.assertEquals(billingPage.getThankYouText(),expectedMessage9,"Error Message");
        String expectedMessage10 = "Your order has been successfully processed!";
        Assert.assertEquals(billingPage.getSuccessfulOrderText(),expectedMessage10,"Error Message");
        billingPage.clickOnEndContinueButton();
        String expectedMessage11 = "Welcome to our store";
        Assert.assertEquals(billingPage.getWelcomeText(),expectedMessage11,"Error Message");
    }

}
