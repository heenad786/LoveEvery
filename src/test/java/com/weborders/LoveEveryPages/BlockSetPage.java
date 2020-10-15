package com.weborders.LoveEveryPages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlockSetPage {


    public BlockSetPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);


    @FindBy(xpath = "//*[@id=\"shopify-section-product\"]/div/section[1]/div[2]/div[2]/div[2]/form/button/span")
    public WebElement addToCartButton;

    public void addingBlockSetToCart(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    }
}
