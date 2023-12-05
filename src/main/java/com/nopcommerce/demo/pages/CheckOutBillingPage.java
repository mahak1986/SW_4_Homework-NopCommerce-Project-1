package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutBillingPage extends Utility {

    //Fill the all mandatory field

    By firstNameOption = (By.id("BillingNewAddress_FirstName"));

    public void firstNameOption(String firstName) {

        sendTextToElement(firstNameOption, firstName);
    }

    By lastNameOption = (By.id("BillingNewAddress_LastName"));

    public void lastNameOption(String lastName) {
        sendTextToElement(lastNameOption, lastName);
    }

    By emailFieldOption = (By.id("BillingNewAddress_Email"));

    public void emailFieldOption(String email) {
        sendTextToElement(emailFieldOption, email);
    }

    // Select Country
    By countryDropDownOption = By.xpath("//select[@id='BillingNewAddress_CountryId']");

    public void selectUKFromDropdownOption(String country) {
        selectByVisibleText(countryDropDownOption, country);

    }

    //Select City
    By cityFieldOption = (By.id("BillingNewAddress_City"));

    public void enterCity(String city) {
        sendTextToElement(cityFieldOption, city);
    }

    // Enter Address
    By addressFieldOption = (By.id("BillingNewAddress_Address1"));

    public void enterAddress(String address) {
        sendTextToElement(addressFieldOption, address);
    }

    //Enter Postal Code
    By postalCodeOption = (By.id("BillingNewAddress_ZipPostalCode"));

    public void enterPostalCode(String postalCode) {
        sendTextToElement(postalCodeOption, postalCode);
    }

    //Enter Phone Number
    By phoneNumberOption = (By.id("BillingNewAddress_PhoneNumber"));

    public void enterPhoneNumberOption(String phoneNumber) {
        sendTextToElement(phoneNumberOption, phoneNumber);
    }

    //Click on continue
    By continueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");

    public void clickOnContinueButton() {

        clickOnElement(continueButton);
    }

    //Click on Radio Button “Next Day Air($0.00)”
    By shippingOption = By.xpath("//input[@id='shippingoption_1']");

    public void clickOnTheShippingOption() {

        clickOnElement(shippingOption);
    }

    //Click on continue button
    By continueButton2 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");

    public void clickOnSecondContinueButton() {
        clickOnElement(continueButton2);
    }

    // Select Radio Button “Credit Card”
    By selectCreditCard = By.xpath("//input[@id='paymentmethod_1']");

    public void selectCreditCardOption() {
        clickOnElement(selectCreditCard);
    }

    //Click on continue button
    By continueButton3 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");

    public void clickOnThirdContinueButton() {

        clickOnElement(continueButton3);
    }

    //Select “Master card” From Select credit card dropdown
    By cardDropdownOption = By.xpath("//select[@id='CreditCardType']");

    public void selectMasterCardOptionFromDropdown(String cardType) {
        selectByVisibleText(cardDropdownOption, cardType);
    }

    //Enter CardHolder Name
    By nameField = By.xpath("//input[@id='CardholderName']");

    public void enterCardHolderName(String name) {

        sendTextToElement(nameField, name);
    }

    //Enter Card Number
    By cardNumberField = By.xpath("//input[@id='CardNumber']");

    public void enterCardNumber(String cardNumber) {

        sendTextToElement(cardNumberField, cardNumber);
    }

    //Enter Month Expiry Date
    By monthExpiryField = By.xpath("//select[@id='ExpireMonth']");

    public void enterExpiryMonth(String month) {

        sendTextToElement(monthExpiryField, month);
    }

    //Enter Year Expiry Date
    By yearExpiryField = By.xpath("//select[@id='ExpireYear']");

    public void enterExpiryYear(String year) {

        sendTextToElement(yearExpiryField, year);
    }

    // Enter Security Code
    By securityCodeField = By.xpath("//input[@id='CardCode']");

    public void enterSecurityCode(String code) {

        sendTextToElement(securityCodeField, code);
    }

    //Click on continue
    By continueButton4 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");

    public void clickOnFourthContinueButton() {

        clickOnElement(continueButton4);
    }

    //Verify “Payment Method” is “Credit Card”
    By paymentMethodText = By.xpath("//span[contains(text(),'Credit Card')]");

    public String getPaymentMethodText() {
        return getTextFromElement(paymentMethodText);
    }

    //Verify “Shipping Method” is “Next Day Air”
    By shippingMethodText = (By.xpath("//li[@class='shipping-method']"));

    public String getShippingMethodText() {

        return getTextFromElement(shippingMethodText);
    }

    //Verify Total is “$2,950.00”
    By totalPriceText = (By.xpath("//span[text()='$2,950.00'][@class = 'product-subtotal']"));

    public String getTotalPriceText() {

        return getTextFromElement(totalPriceText);
    }

    //Click on “CONFIRM”
    By clickOnConfirmButton = (By.xpath("//button[@class='button-1 confirm-order-next-step-button']"));

    public void clickOnConfirm() {

        clickOnElement(clickOnConfirmButton);
    }
    //Verify the Text “Thank You”
    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    public String getThankYouText() {

        return getTextFromElement(thankYouText);
    }
    //Verify the message “Your order has been successfully processed!”
    By successfulOrderText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    public String getSuccessfulOrderText() {
        return getTextFromElement(successfulOrderText);
    }
    // Click on “CONTINUE”
    By endContinueButton = (By.xpath("//button[@class='button-1 order-completed-continue-button']"));
    public void clickOnEndContinueButton(){

        clickOnElement(endContinueButton);
    }
    //Verify the text “Welcome to our store”
    By welcomeText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    public String getWelcomeText() {

        return getTextFromElement(welcomeText);
    }

}
