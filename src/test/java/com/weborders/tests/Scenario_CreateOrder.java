package com.weborders.tests;

import com.weborders.pages.LoginPage;
import com.weborders.pages.OrderPage;
import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario_CreateOrder extends TestBase {


    @Test
    public void create_order_test() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        OrderPage orderPage= new OrderPage();
        orderPage.clickOnOrderButton();

        orderPage.selectProduct("ScreenSaver");
        orderPage.enterQuantity("12");
        orderPage.enterPricepPerUnit("20");
        orderPage.enterDiscount("10");
        orderPage.clickToCalculate();

        Assert.assertEquals(orderPage.getTotal(), "216");

        orderPage.enterCustomerName("Test User");
        orderPage.enterStreetName("5th Ave");
        orderPage.enterCityName("New York");
        orderPage.enterStateName("New York");
        orderPage.enterZip("10011");

        orderPage.selectCard("Visa");
        orderPage.enterCardNum("12345667890");
        orderPage.enterExpirationDate("04/25");

        orderPage.clickOnProcessButton();

        orderPage.clickOnViewAllOrdersButton();


        WebElement name= Driver.getDriver().findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[2]//td[2]"));
        WebElement product= Driver.getDriver().findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[2]//td[3]"));


        Assert.assertTrue(name.isDisplayed());
        Assert.assertEquals(name.getText(), "Test User");

        Assert.assertTrue(product.isDisplayed());
        Assert.assertEquals(product.getText(), "ScreenSaver");


    }


}
