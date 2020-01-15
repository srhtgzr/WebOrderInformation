package com.weborders.pages;

import com.weborders.utilities.BrowserUtils;
import com.weborders.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditOrderPage {

    public EditOrderPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")

    public  WebElement productDropDown;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")

    public WebElement quantityBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtUnitPrice")

    public WebElement pricePerUnitBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtDiscount")

    public WebElement discountBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtTotal")

    public WebElement totalBox;

    @FindBy(xpath = "//table/tbody/tr/td[2]/div[2]/div/table/tbody/tr[2]/td[13]/input")

    public WebElement editButton;

    @FindBy (css = "[value='Calculate']")

    public WebElement calculateButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")

    public WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy(id ="ctl00_MainContent_fmwOrder_TextBox3" )
    public  WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")

    public WebElement zip;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_UpdateButton")
    public WebElement updateButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")

    public WebElement cardType;

    @FindBy(id = "ctl00_MainContent_fmwOrder_RequiredFieldValidator2")

    public WebElement errorMessage;




}
