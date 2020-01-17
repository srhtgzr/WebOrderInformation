package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage(){

        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(id = "ctl00_MainContent_username")

    public WebElement loginInput;


    @FindBy(id = "ctl00_MainContent_password")

    public WebElement passwordInput;




    public void login(String username, String password){

        loginInput.sendKeys(username);

        passwordInput.sendKeys(password, Keys.ENTER);
    }
}
