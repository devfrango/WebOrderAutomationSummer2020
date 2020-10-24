package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(){
        String username = ConfigurationReader.getProperty("username");
        String passwrod = ConfigurationReader.getProperty("password");

        usernameElement.sendKeys(username);
        passwordElement.sendKeys(passwrod);
    }

    @FindBy(id = "ct100_MainContent_username")
    private WebElement usernameElement;

    @FindBy(id = "ct100_MainContent_password")
    private WebElement passwordElement;

}
