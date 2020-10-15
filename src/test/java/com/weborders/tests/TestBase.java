package com.weborders.tests;

import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {


    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
    }


    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }




}
