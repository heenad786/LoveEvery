package com.weborders.LoveEveryPages;

import com.weborders.tests.TestBase;
import com.weborders.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {


    public PaymentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//*[@title=\"Field container for: Card number\"]")
    public WebElement iFramecardNumBox;

    @FindBy(xpath = "//input[@placeholder=\"Card number\"]")
    public WebElement cardNumBox;

    @FindBy(xpath = "//iframe[@title = 'Field container for: Name on card']")
    public WebElement iFrameNameOnCardBox;

    @FindBy(xpath = "//input[@placeholder=\"Name on card\"]")
    public WebElement nameOnCardBox;

        @FindBy(xpath = "//*[@id=\"continue_button\"]")
    public WebElement payNowButton;

    @FindBy(xpath = "//iframe[@title = 'Field container for: Expiration date (MM / YY)']")
    public WebElement iFrameExpiryBox;

        @FindBy(xpath = "//input[@placeholder=\"Expiration date (MM / YY)\"]")
        public WebElement expiryBox;

    @FindBy(xpath = "//iframe[@title = 'Field container for: Security code']")
    public WebElement iFrameSecurityCodeBox;

        @FindBy(xpath = "//input[@placeholder=\"Security code\"]")
        public WebElement securityCodeBox;



        public void enteringPaymentInfo(){
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

            wait.until(ExpectedConditions.titleContains("Payment"));

            wait.until(ExpectedConditions.visibilityOf(iFramecardNumBox));

            Driver.getDriver().switchTo().frame(iFramecardNumBox);

            wait.until(ExpectedConditions.visibilityOf(cardNumBox)).click();

            JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
            js.executeScript("arguments[0].value='4111111111111111';", cardNumBox);

            Driver.getDriver().switchTo().parentFrame();

            Driver.getDriver().switchTo().frame(iFrameNameOnCardBox);
            wait.until(ExpectedConditions.visibilityOf(nameOnCardBox)).click();
            nameOnCardBox.sendKeys("BabyBoomer");

            Driver.getDriver().switchTo().parentFrame();

            Driver.getDriver().switchTo().frame(iFrameExpiryBox);
            wait.until(ExpectedConditions.visibilityOf(expiryBox)).click();
            js.executeScript("arguments[0].value='10/25';", expiryBox);


            Driver.getDriver().switchTo().parentFrame();

            Driver.getDriver().switchTo().frame(iFrameSecurityCodeBox);
            wait.until(ExpectedConditions.visibilityOf(securityCodeBox)).click();
            securityCodeBox.sendKeys("333");

            Driver.getDriver().switchTo().parentFrame();

            payNowButton.click();



        }

}

