package com.weborders.tests;

import com.weborders.LoveEveryPages.*;
import com.weborders.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlockSetTest {

    LandingPage landingPage = new LandingPage();
    PlayGymPage playGymPage = new PlayGymPage();
    BlockSetPage blockSetPage = new BlockSetPage();
    CartPage cartPage = new CartPage();
    LoginPage loginPage = new LoginPage();
    InformationPage informationPage = new InformationPage();
    ShippingPage shippingPage = new ShippingPage();
    PaymentPage paymentPage = new PaymentPage();
    OrderSubmittedPage orderSubmittedPage = new OrderSubmittedPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);


    @Test
    public void purchasingBlockSetTest() throws InterruptedException {
        Driver.getDriver().get("https://lovevery-test.com/");
        Driver.getDriver().manage().window().maximize();

        landingPage.BlockSetButton.click();

        blockSetPage.addingBlockSetToCart();

        cartPage.clickingContinuetoCheckoutButton();

        loginPage.loggingInMethod();

        informationPage.fillingOutInformationPage();

        shippingPage.clickContinueToPaymentButton();

        paymentPage.enteringPaymentInfo();

        wait.until(ExpectedConditions.titleContains("Thank you"));
        wait.until(ExpectedConditions.visibilityOf(orderSubmittedPage.totalPrice));

        Assert.assertEquals("$97.21", orderSubmittedPage.totalPrice.getText());
    }
}
