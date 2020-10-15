package com.weborders.LoveEveryPages;

import com.weborders.tests.TestBase;
import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public LandingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"MainContent\"]/section[1]/div[2]/div[2]/div/div/div/a")
    public WebElement PlayKitButton;


    @FindBy(xpath = "/html/body/main/section[1]/div[3]/div[2]/div/div/div/a")
    public WebElement BlockSetButton;


    //




}
