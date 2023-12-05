package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaRegisterPage extends Utility {
    //Verify the text “Register”
    By registerText = By.xpath("//h1[contains(text(),'Register')]");

    public String verifyRegisterText() {

        return getTextFromElement(registerText);
    }

    //Fill the mandatory fields
    //Enter First name
    By firstNameOption = (By.id("FirstName"));

    public void enterFirstName(String firstName) {

        sendTextToElement(firstNameOption, firstName);
    }

    //Enter Last Name
    By lastNameOption = (By.id("LastName"));

    public void enterLastName(String lastName) {

        sendTextToElement(lastNameOption, lastName);
    }
   // Enter Email
  //  final String randomEmail = randomEmail();
    By emailAddressOption = By.id("Email");
   // public void enterEmailAddress(){

      //  sendTextToElement(emailAddressOption, randomEmail);
    //}

    //Enter Password
    By enterPasswordOption = (By.name("Password"));

    public void enterPassword(String password) {

        sendTextToElement(enterPasswordOption, password);
    }

    //Enter Confirm Password
    By enterConfirmPassword = (By.name("ConfirmPassword"));

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(enterConfirmPassword, confirmPassword);
    }
   // private static String randomEmail() {

       // return "random-" + UUID.randomUUID().toString() + "@gmail.com";
   // }
    //Click on Register button
    By clickRegisterButton = By.id("register-button");

    public void clickOnRegisterTabButton() {

        clickOnElement(clickRegisterButton);
    }

    //Verify the message “Your registration completed”
    By registrationCompletedText = By.xpath("//div[contains(text(),'Your registration completed')]");

    public String verifyYourRegistrationCompletedText() {

        return getTextFromElement(registrationCompletedText);
    }

    //Click on continue tab
    By clickOnContinueButton = By.xpath("//a[contains(text(),'Continue')]");

    public void clickOnContinueButton() {
        clickOnElement(clickOnContinueButton);
    }

    // Verify the text “Shopping cart”
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public String verifyShoppingCartText() {

        return getTextFromElement(shoppingCartText);
    }

    //click on checkbox “I agree with the terms of service”
    By clickOnTermsAndServiceBox = By.xpath("//input[@id = 'termsofservice']");

    public void clickOnTermsAndServiceBox() {

        clickOnElement(clickOnTermsAndServiceBox);
    }

    //Click on CHECKOUT
    By clickOnCheckOutTab = By.id("checkout");

    public void clickOnCheckOutTab() {
        clickOnElement(clickOnCheckOutTab);
    }
    //
}
