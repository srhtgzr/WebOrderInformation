package com.weborders.step_definitions;

import com.weborders.pages.EditOrderPage;
import com.weborders.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class EditOrderStepDefinitions {

    EditOrderPage editOrderPage = new EditOrderPage();

    @Then("user clicks edit order")
    public void userClicksEditOrder() {

        BrowserUtils.waitForClickablility(editOrderPage.editButton, 5);
        editOrderPage.editButton.click();
    }

    @Then("user selects {string}")
    public void user_selects(String string) {

        BrowserUtils.waitForVisibility(editOrderPage.productDropDown, 5);

        Select select = new Select(editOrderPage.productDropDown);

        select.selectByVisibleText(string);
    }

    @Then("user enters following information")
    public void user_enters_following_information(List<Map<String, String>> dataTable) {

        for (Map<String, String> each : dataTable) {
            editOrderPage.quantityBox.clear();
            BrowserUtils.wait(5);

            editOrderPage.quantityBox.sendKeys(each.get("Quantity:"));

            editOrderPage.pricePerUnitBox.clear();
            editOrderPage.pricePerUnitBox.sendKeys(each.get("Price per unit:"));

            editOrderPage.discountBox.clear();

            editOrderPage.discountBox.sendKeys(each.get("Discount:"));

            //  editOrderPage.totalBox.clear();

            // editOrderPage.totalBox.sendKeys(each.get("Total:"));

            BrowserUtils.wait(2);


        }
    }


    @And("click calculate button")
    public void clickCalculateButton() {
        editOrderPage.calculateButton.click();
        BrowserUtils.wait(2);
        System.out.println(editOrderPage.totalBox.getText());
    }

    @Then("user enters address information")
    public void user_enters_address_information(List<Map<String, String>> dataTable) {

        for (Map<String, String> each : dataTable) {

            editOrderPage.customerName.clear();

         //   editOrderPage.customerName.sendKeys(each.get("Customer name:"));

            editOrderPage.street.clear();

            editOrderPage.street.sendKeys(each.get("Street:"));

            editOrderPage.city.clear();

            editOrderPage.city.sendKeys(each.get("City:"));
            editOrderPage.state.clear();
            editOrderPage.state.sendKeys(each.get("State:"));

            editOrderPage.zip.clear();

            editOrderPage.zip.sendKeys(each.get("Zip:"));


        }
    }

    @Then("user enters payment information")
    public void user_enters_payment_information(List<Map<String,String>> dataTable) {

        for(Map<String,String> each : dataTable){

            editOrderPage.cardNumber.clear();

            editOrderPage.cardNumber.sendKeys(each.get("Card Nr:"));

            editOrderPage.expireDate.clear();

            editOrderPage.expireDate.sendKeys(each.get("Expire date (mm/yy):"));

        }
    }

    @Then("user selects visa card type")
    public void user_selects_visa_card_type() {

        editOrderPage.cardType.click();
    }
    @Then("user click update button")
    public void user_click_update_button() {
       editOrderPage.updateButton.submit();

       //BrowserUtils.wait(7);
    }

    @And("following error message displayed {string}")
    public void followingErrorMessageDisplayed(String arg0) {

        Assert.assertEquals(arg0, editOrderPage.errorMessage.getText().trim());

        System.out.println(editOrderPage.errorMessage.getText().trim());

    }
}
