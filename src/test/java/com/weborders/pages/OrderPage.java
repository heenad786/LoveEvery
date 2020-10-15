package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends PageBase {

    //PRODUCT INFORMATION:

    //missing Product select dropdown here, put in test Scenario_CreateOrder instead
    @FindBy(xpath = "//select[@id = 'ctl00_MainContent_fmwOrder_ddlProduct']")
    private WebElement productDropdown;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_txtQuantity']")
    private WebElement quantityInput;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_txtUnitPrice']")
    private WebElement pricePerUnitInput;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_txtDiscount']")
    private WebElement discountInput;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_txtTotal']")
    private WebElement totalInput;

    @FindBy(xpath = "//input[@value = 'Calculate']")
    private WebElement calculateButton;

    //ADDRESS INFORMATION:

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_txtName']")
    private WebElement customerNameInput;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_TextBox2']")
    private WebElement streetInput;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_TextBox3']")
    private WebElement cityInput;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_TextBox4']")
    private WebElement stateInput;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_TextBox5']")
    private WebElement zipInput;


    //PAYMENT INFORMATION:

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_cardList_0']")
    private WebElement visaRadioButton;


    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_TextBox6']")
    private WebElement cardNumberInput;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_fmwOrder_TextBox1']")
    private WebElement expirationDateInput;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement processButton;



    public void selectProduct(String productName) {
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@id = 'ctl00_MainContent_fmwOrder_ddlProduct']")));
        select.selectByVisibleText(productName);
    }

    public void enterQuantity(String quantityValue){
        quantityInput.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END), quantityValue);
    }

    public void enterPricepPerUnit(String pricePerUnitValue){
        pricePerUnitInput.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END), pricePerUnitValue);
    }

    public void enterDiscount(String discountValue){
        discountInput.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END), discountValue);
    }

    public void clickToCalculate(){
        calculateButton.click();
    }

    public String getTotal(){
        return totalInput.getAttribute("value");
    }

    public void enterCustomerName(String customerName){
        customerNameInput.sendKeys(customerName);
    }

    public void enterStreetName(String streetName){
        streetInput.sendKeys(streetName);
    }


    public void enterCityName(String cityName){
        cityInput.sendKeys(cityName);
    }

    public void enterStateName(String stateName){
        stateInput.sendKeys(stateName);
    }

    public void enterZip(String zip){
        zipInput.sendKeys(zip);
    }

    public void selectCard(String cardName){
        String xpath = "//label[text()='" + cardName + "']/preceding-sibling::input";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
    }

    public void enterCardNum(String cardNumber){
        cardNumberInput.sendKeys(cardNumber);
    }

    public void enterExpirationDate(String expiration){
        expirationDateInput.sendKeys(expiration);
    }

    public void clickOnProcessButton(){
        processButton.click();
    }




}
