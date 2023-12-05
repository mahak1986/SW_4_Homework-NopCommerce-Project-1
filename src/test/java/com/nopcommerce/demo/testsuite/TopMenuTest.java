package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation() {
        String selectMenu = "Computers\n" +
                "Electronics\n" +
                "Apparel\n" +
                "Digital downloads\n" +
                "Books\n" +
                "Jewelry\n" +
                "Gift Cards";
        String actualText = homePage.findAllTabsInTopMenu();
        Assert.assertEquals(actualText, selectMenu, "Top menu is not displayed");
    }
    }


