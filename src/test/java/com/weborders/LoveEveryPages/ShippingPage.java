package com.weborders.LoveEveryPages;

import com.weborders.tests.TestBase;
import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingPage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);


    public ShippingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"continue_button\"]")
    public WebElement continueToPaymentButton;

    public void clickContinueToPaymentButton(){
        wait.until(ExpectedConditions.visibilityOf(continueToPaymentButton)).click();

    }

}
