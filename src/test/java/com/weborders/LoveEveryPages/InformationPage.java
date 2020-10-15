package com.weborders.LoveEveryPages;

import com.github.javafaker.Faker;
import com.weborders.tests.TestBase;
import com.weborders.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InformationPage {

    public InformationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
    Faker faker = new Faker();


    @FindBy(xpath = "//input[@placeholder='First name']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[@id=\"checkout_shipping_address_last_name\"]")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[@id=\"checkout_shipping_address_address1\"]")
    public WebElement addressBox;

    @FindBy(xpath = "//*[@id=\"checkout_shipping_address_city\"]")
    public WebElement cityBox;

    @FindBy(xpath = "//*[@id=\"checkout_shipping_address_zip\"]")
    public WebElement zipCodeBox;

    @FindBy(xpath = "//*[@id=\"checkout_shipping_address_phone\"]")
    public WebElement phoneBox;

    @FindBy(xpath = "//*[@id=\"continue_button\"]")
    public WebElement continueToShippingButton;


    public void dropDown(){
        Select countryDropDown = new Select(Driver.getDriver().findElement(By.xpath("//*[@id=\"checkout_shipping_address_country\"]")));
        Select stateDropDown = new Select(Driver.getDriver().findElement(By.xpath("//*[@id=\"checkout_shipping_address_province\"]")));

        countryDropDown.selectByVisibleText("United States");
        stateDropDown.selectByVisibleText("Texas");

    }

    public void fillingOutInformationPage(){
        wait.until(ExpectedConditions.visibilityOf(firstNameBox));

        addressBox.sendKeys(faker.address().streetAddress());

        cityBox.sendKeys(faker.address().cityName());

        dropDown();

        zipCodeBox.sendKeys("77027");

        phoneBox.sendKeys(faker.phoneNumber().cellPhone());

        continueToShippingButton.click();
    }

}
