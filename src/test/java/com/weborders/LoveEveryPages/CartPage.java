package com.weborders.LoveEveryPages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);


    public CartPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"MainContent\"]/div/form/div[4]/div/input[2]")
    public WebElement continueToCheckoutButton;

    public void clickingContinuetoCheckoutButton(){
        wait.until(ExpectedConditions.elementToBeClickable(continueToCheckoutButton)).click();

    }
}
