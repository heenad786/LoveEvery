package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {

    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    public PageBase(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "View all orders")
    private WebElement viewAllOrdersButton;

    @FindBy(linkText = "View all products")
    private WebElement viewAllProductsButton;

    @FindBy(linkText = "Order")
    private WebElement orderButton;




    public void clickOnViewAllOrdersButton(){
        System.out.println("Clicking on 'View All Orders' page");
        wait.until(ExpectedConditions.elementToBeClickable(viewAllOrdersButton));
        viewAllOrdersButton.click();
    }

    public void clickOnviewAllProductsButton(){
        System.out.println("Clicking on 'View All Products' page");
        wait.until(ExpectedConditions.elementToBeClickable(viewAllProductsButton));
        viewAllProductsButton.click();
    }

    public void clickOnOrderButton(){
        System.out.println("Clicking on 'Orders' page");
        wait.until(ExpectedConditions.elementToBeClickable(orderButton)).click();
    }

}
