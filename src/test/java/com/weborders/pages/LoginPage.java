package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase {


    @FindBy(name = "ctl00$MainContent$username")
    private WebElement usernameInputBox;


    @FindBy(name = "ctl00$MainContent$password")
    private WebElement passwordInputBox;


    public void login(String username, String password) {
        wait.until(ExpectedConditions.visibilityOf(usernameInputBox)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(passwordInputBox)).sendKeys(password, Keys.ENTER);
    }

    public void login() { // does same job as above method with diff parameter
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        wait.until(ExpectedConditions.visibilityOf(usernameInputBox)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(passwordInputBox)).sendKeys(password, Keys.ENTER);

    }


}
