package com.weborders.LoveEveryPages;

import com.weborders.tests.TestBase;
import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderSubmittedPage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);


    public OrderSubmittedPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//table[@class = 'total-line-table']/tfoot/tr/td/span[2]")
    public WebElement totalPrice;
}
