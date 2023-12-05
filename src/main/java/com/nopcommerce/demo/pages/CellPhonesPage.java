package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {
//Verify the text “Cell phones”
  By cellPhoneText = (By.xpath("//h1[normalize-space()='Cell phones']"));
  public String getCellPhoneText(){
      return getTextFromElement(cellPhoneText);
  }
  //Click on List View Tab
    By listViewTab = By.xpath("//a[contains(text(),'List')]");
  public void clickOnListViewTab(){
      clickOnElement(listViewTab);
  }
  //Click on product name “Nokia Lumia 1020” link
    By nokiaLumia1020 = By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");
  public void clickOnNokiaLumia1020(){
      clickOnElement(nokiaLumia1020);
  }

}
