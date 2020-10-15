package com.weborders.tests;

import com.weborders.pages.LoginPage;
import com.weborders.utilities.BrowserUtils;
import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test(description = "Just login and verify title")
    public void login_test(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h1")).isDisplayed());
        Assert.assertEquals(Driver.getDriver().getTitle(), "Web Orders", "Page title is wrong!");

        BrowserUtils.takeScreenshot();
    }





}
