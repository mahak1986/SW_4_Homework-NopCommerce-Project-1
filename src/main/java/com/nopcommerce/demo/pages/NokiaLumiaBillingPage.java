package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaBillingPage extends Utility {
    //Fill the Mandatory fields
    By firstNameOption = By.id("BillingNewAddress_FirstName");

    public void firstNameOption(String firstName) {

        sendTextToElement(firstNameOption, firstName);
    }

    By lastNameOption = By.id("BillingNewAddress_LastName");

    public void lastNameOption(String lastName) {

        sendTextToElement(lastNameOption, lastName);
    }

    By countryByDropDownOption = By.id("BillingNewAddress_CountryId");

    public void selectUKFromDropdownOption(String country) {
        selectByVisibleText(countryByDropDownOption, country);
    }

    By provinceOption = By.id("BillingNewAddress_StateProvinceId");

    public void inputProvince(String Province) {

        sendTextToElement(provinceOption, Province);
    }

    By provinceFromDropDownOption = By.id("BillingNewAddress_CountryId");

    public void selectOtherProvinceFromDropdownOption(String province) {
        selectByVisibleText(provinceFromDropDownOption, province);
    }

    By cityOption = By.id("BillingNewAddress_City");

    public void enterCity(String city) {

        sendTextToElement(cityOption, city);
    }

    By addressFirstLineOption = By.id("BillingNewAddress_Address1");

    public void enterFirstLineOfAddressCity(String address) {

        sendTextToElement(addressFirstLineOption, address);
    }

    By zipPostalCodeeOption = By.id("BillingNewAddress_ZipPostalCode");

    public void enterZipPostalCode(String zipcode) {

        sendTextToElement(zipPostalCodeeOption, zipcode);
    }

    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    public void enterPhoneNumber(String phonenumber) {

        sendTextToElement(phoneNumber, phonenumber);
    }

    By continueTab = By.xpath("//button[text() = 'Continue']");

    public void clickOnContinueTab() {

        clickOnElement(continueTab);
    }

    By secondDayAirRadioButtonTab = By.id("shippingoption_2");

    public void clickOnRadioButtonSecondDayAir() {

        clickOnElement(secondDayAirRadioButtonTab);
    }

    By continueButtonTab = (By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));

    public void clickOnContinueButtonTab() {

        clickOnElement(continueButtonTab);
    }

    By creditCardRadioButton = By.xpath("//input[@id='paymentmethod_1']");

    public void clickOnCreditCardRadioButton() {

        clickOnElement(creditCardRadioButton);
    }

    By paymentMethodRadioButton = By.xpath("//div[@id='checkout-step-payment-method']/div/button");

    public void clickOnCheckOutStepPaymentMethodRadioButton() {

        clickOnElement(paymentMethodRadioButton);
    }

    By selectPaymentCardOptionMasterOrVisa = By.id("CreditCardType");

    public void selectMasterOrVisaCardForPayment(String card) {
        selectByVisibleText(selectPaymentCardOptionMasterOrVisa, card);
    }

    By cardHolderName = By.id("CardholderName");

    public void cardHolderNameAsOnCard(String name) {

        sendTextToElement(cardHolderName, name);
    }

    By cardNumber = By.id("CardNumber");

    public void cardNumberAsOnCard(String number) {
        sendTextToElement(cardNumber, number);
    }

    By monthOption = By.id("ExpireMonth");

    public void enterMonthOption(String month) {

        selectByVisibleText(monthOption, month);
    }

    By yearOption = By.id("ExpireYear");

    public void enterYearOption(String year) {
        selectByVisibleText(yearOption, year);
    }

    By cardCodeOption = By.id("CardCode");

    public void enterCardCodeFromBackOfTheCard(String code) {

        sendTextToElement(cardCodeOption, code);
    }

    By continueCheckOutTab = By.xpath("//div[@id='payment-info-buttons-container']/button");

    public void clickOnContinueCheckOutTab() {

        clickOnElement(continueCheckOutTab);
    }

    By paymentMethodCreditCardOption = By.xpath("//li[@class='payment-method']/span[2]");

    public String verifyPaymentMethodByCreditCardText() {

        return getTextFromElement(paymentMethodCreditCardOption);
    }

    By shippingSecondDayAirMethodText = By.xpath("//li[@class='shipping-method']/span[2]");

    public String getShippingSecondDayAirMethodText() {

        return getTextFromElement(shippingSecondDayAirMethodText);
    }

    By totalPriceText = By.xpath("//td[@class='subtotal']/span");

    public String getTotalPriceText() {

        return getTextFromElement(totalPriceText);
    }

    By confirmButton = By.xpath("//button[text()='Confirm']");

    public void clickOnConfirmButton() {

        clickOnElement(confirmButton);
    }

    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");

    public String getThankYouText() {

        return getTextFromElement(thankYouText);
    }

    By successfulOrderText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public String getSuccessfulOrderText() {

        return getTextFromElement(successfulOrderText);
    }

    By lastContinueButton = By.xpath("//button[contains(text(),'Continue')]");

    public void clickOnTheLastContinueButton() {
        clickOnElement(lastContinueButton);
    }

    By welcomeText = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public String getWelcomeText() {

        return getTextFromElement(welcomeText);
    }

    By logOutButton = By.xpath("//a[contains(text(),'Log out')]");

    public void clickOnLogoutTabButton() {

        clickOnElement(logOutButton);
    }

    By confirmUrlText = By.xpath("https://demo.nopcommerce.com/");

    public String getCurrentUrl() {
        return getTextFromElement(confirmUrlText);

    }

    By continueTab1 = (By.xpath("//button[@class='button-1 new-address-next-step-button']"));

    public void clickOnBillingContinueTab() {
        clickOnElement(continueTab1);

    }
}

