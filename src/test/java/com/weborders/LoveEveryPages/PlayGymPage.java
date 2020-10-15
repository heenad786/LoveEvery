package com.weborders.LoveEveryPages;

import com.weborders.tests.TestBase;
import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlayGymPage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);


    public PlayGymPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"shopify-section-product\"]/div/section[1]/div/div[2]/div[2]/form/button")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"shopify-section-product\"]/div/section[1]/div/div[1]/div/span")
    public WebElement priceForPlayGym;

    public void clickingAddToCartButton(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    }


}
