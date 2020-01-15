package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ViewAllOrdersPage {

    public ViewAllOrdersPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//table//tbody//tr//td[2]//div[2]//h2")

    public WebElement tableTitle;

    @FindBy(id = "ctl00_MainContent_btnCheckAll")

    public WebElement checkButton;

    @FindBy(id = "ctl00_MainContent_btnUncheckAll")

    public WebElement uncheckButton;

    @FindBy(xpath = "//table/tbody/tr/th")

    public List<WebElement> tableHeaders;

    @FindBy(id = "ctl00_MainContent_btnDelete")

    public WebElement deleteButton;

    @FindBy(css = "[id=ctl00_MainContent_orderGrid] tbody tr td:nth-of-type(1)")

    public List<WebElement> orderCounts;


    public void deleteOrder(String orderNumber){

        String orderLocator = "//table//table//tbody//tr[2]//td["+orderNumber+"]";

        Driver.get().findElement(By.xpath(orderLocator)).click();

        deleteButton.click();
    }
}
