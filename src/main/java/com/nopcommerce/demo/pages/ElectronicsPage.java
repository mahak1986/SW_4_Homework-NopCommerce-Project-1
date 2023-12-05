package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    //Mouse hover to Electronics Tab
    By mouseHoverToElectronicsTab = (By.xpath("//ul[@class='top-menu notmobile']/li[2]"));
    public void mouseHoverElectronics(){

        mouseHoverToElement(mouseHoverToElectronicsTab);
    }
    //Mouse Hover on “Cell phones” and click
    By mouseHoverOnCellPhonesAndClick = (By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul/li[2]"));
    public void mouseHoverOnCellPhones(){

        mouseHoverToElementAndClick(mouseHoverOnCellPhonesAndClick);
    }
}
