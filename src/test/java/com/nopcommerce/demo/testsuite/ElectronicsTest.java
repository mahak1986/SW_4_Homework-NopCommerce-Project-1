package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    //String randomEmail;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumia1020Page nokiaLumia1020Page = new NokiaLumia1020Page();
    NokiaLumia1020CartPage nokiaLumia1020CartPage = new NokiaLumia1020CartPage();
    NokiaLumiaCheckOutPage nokiaLumiaCheckOutPage = new NokiaLumiaCheckOutPage();
    NokiaLumiaRegisterPage nokiaLumiaRegisterPage = new NokiaLumiaRegisterPage();
    NokiaLumiaBillingPage nokiaLumiaBillingPage = new NokiaLumiaBillingPage();


    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.clickOnElectronicsMenu();
        electronicsPage.mouseHoverElectronics();
        electronicsPage.mouseHoverOnCellPhones();
        Thread.sleep(2000);
        String expectedText = "Cell phones";
        Assert.assertEquals(cellPhonesPage.getCellPhoneText(), expectedText, "Error Message");
        cellPhonesPage.clickOnListViewTab();
        Thread.sleep(2000);
        cellPhonesPage.clickOnNokiaLumia1020();
        String expectedText1 = "Nokia Lumia 1020";
        Assert.assertEquals(nokiaLumia1020Page.verifyNokiaLuma1020Text(), expectedText1, "Error Message");
        String expectedText2 = "$349.00";
        Assert.assertEquals(nokiaLumia1020Page.verifyNokiaLumiaPriceText(), expectedText2, "Error Message");
        nokiaLumia1020Page.updateQuantityOption();
        nokiaLumia1020Page.clickOnAddToCart();
        String expectedText3 = "The product has been added to your shopping cart";
        Assert.assertEquals(nokiaLumia1020Page.verifyTheProductHasBeenAddedToYourShoppingCartText(), expectedText3, "Error Message");
        nokiaLumia1020Page.clickOnGreenCrossOption();
        nokiaLumia1020Page.mouseHoverOnShoppingCartOption();
        nokiaLumia1020Page.clickOnGoToCartOption();
        String expectedText4 = "Shopping cart";
        Assert.assertEquals(nokiaLumia1020CartPage.verifyNokiaLumiaCartText(), expectedText4, "Error Message");
        nokiaLumia1020CartPage.verifyQuantityText();
        String expectedText6 = "$698.00";
        Assert.assertEquals(nokiaLumia1020CartPage.verifyPriceTotal(), expectedText6, "Error Message");
        nokiaLumia1020CartPage.checkTermsOfService();
        nokiaLumia1020CartPage.clickOnCheckout();
        nokiaLumiaCheckOutPage.verifyWelcomePleaseSignInText();
        nokiaLumiaCheckOutPage.clickOnRegisterTabOption();
        nokiaLumiaRegisterPage.verifyRegisterText();
        nokiaLumiaRegisterPage.enterFirstName("Mahak");
        nokiaLumiaRegisterPage.enterLastName("Agarwal");
        enterEmailAddress();
        nokiaLumiaRegisterPage.enterPassword("Mahak123");
        nokiaLumiaRegisterPage.enterConfirmPassword("Mahak123");
        nokiaLumiaRegisterPage.clickOnRegisterTabButton();
        String expectedMessage7 = "Your registration completed";
        Assert.assertEquals(nokiaLumiaRegisterPage.verifyYourRegistrationCompletedText(), expectedMessage7, "Your Registration Completed tab not displayed");
        nokiaLumiaRegisterPage.clickOnContinueButton();
        nokiaLumiaRegisterPage.verifyShoppingCartText();
        loginPage.clickOnLoginButton();
        System.out.println(randomEmail);
        loginPage.enterEmailID(randomEmail);
        loginPage.enterPassword("Mahak123");
        loginPage.clickOnBottomLoginButton();
        Thread.sleep(2000);
        nokiaLumiaRegisterPage.clickOnTermsAndServiceBox();
        nokiaLumiaRegisterPage.clickOnCheckOutTab();
        Thread.sleep(2000);
        nokiaLumiaBillingPage.selectUKFromDropdownOption("United Kingdom");
        nokiaLumiaBillingPage.enterCity("London");
        nokiaLumiaBillingPage.enterFirstLineOfAddressCity("10 Wayfair Street");
        nokiaLumiaBillingPage.enterZipPostalCode("DX2 1SW");
        nokiaLumiaBillingPage.enterPhoneNumber("07892345678");
        nokiaLumiaBillingPage.clickOnBillingContinueTab();
        nokiaLumiaBillingPage.clickOnContinueTab();
        nokiaLumiaBillingPage.clickOnRadioButtonSecondDayAir();
        nokiaLumiaBillingPage.clickOnContinueButtonTab();
        nokiaLumiaBillingPage.clickOnCreditCardRadioButton();
        nokiaLumiaBillingPage.clickOnCheckOutStepPaymentMethodRadioButton();
        nokiaLumiaBillingPage.selectMasterOrVisaCardForPayment("Visa");
        nokiaLumiaBillingPage.cardHolderNameAsOnCard("Mahak Agarwal");
        nokiaLumiaBillingPage.cardNumberAsOnCard("0000 0000 0000 0000");
        nokiaLumiaBillingPage.enterMonthOption("05");
        nokiaLumiaBillingPage.enterYearOption("2026");
        nokiaLumiaBillingPage.enterCardCodeFromBackOfTheCard("306");
        nokiaLumiaBillingPage.clickOnContinueCheckOutTab();
        nokiaLumiaBillingPage.verifyPaymentMethodByCreditCardText();
        nokiaLumiaBillingPage.getShippingSecondDayAirMethodText();
        String expectedMessage8 = "$698.00";
        Assert.assertEquals(nokiaLumiaBillingPage.getTotalPriceText(), expectedMessage8, "Total price incorrect");
        nokiaLumiaBillingPage.clickOnConfirmButton();
        String expectedMessage9 = "Thank you";
        Assert.assertEquals(nokiaLumiaBillingPage.getThankYouText(), expectedMessage9, "Text displayed is incorrect");
        String expectedMessage10 = "Your order has been successfully processed!";
        Assert.assertEquals(nokiaLumiaBillingPage.getSuccessfulOrderText(), expectedMessage10, "Page displayed is incorrect");
        nokiaLumiaBillingPage.clickOnTheLastContinueButton();
        String expectedMessage11 = "Welcome to our store";
        Assert.assertEquals(nokiaLumiaBillingPage.getWelcomeText(), expectedMessage11, "Page displayed is incorrect");
        nokiaLumiaBillingPage.clickOnLogoutTabButton();
        String expectedMessage12 = "https://demo.nopcommerce.com/";
        Assert.assertEquals(nokiaLumiaBillingPage.getWelcomeText(),expectedMessage11, "Wrong URL");

    }
}
