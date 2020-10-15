package com.weborders.LoveEveryPages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);


    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"sign in\"]/div[3]/div[1]/div[1]/button")
    public WebElement signInButton;

    public void loggingInMethod(){
        wait.until(ExpectedConditions.visibilityOf(emailBox)).sendKeys("dhananiheena@yahoo.com");

        passwordBox.sendKeys("Hello123!");

        signInButton.click();
    }

}
