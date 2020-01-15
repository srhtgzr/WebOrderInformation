package com.weborders.step_definitions;

import com.weborders.pages.ViewAllOrdersPage;
import com.weborders.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ViewAllOrdesDefinitions {

     ViewAllOrdersPage  viewAllOrdersPage = new ViewAllOrdersPage();

     @Then("user verifies that table title is {string}")
     public void userVerifiesThatTableTitleIs(String str) {

          BrowserUtils.waitForVisibility(viewAllOrdersPage.tableTitle,5);
          Assert.assertEquals(str, viewAllOrdersPage.tableTitle.getText().trim());

          System.out.println(viewAllOrdersPage.tableTitle.getText());
     }

     @Then("user checks all orders and uncheck them")
     public void userChecksAllOrdersAndUncheckThem() {

          BrowserUtils.waitForClickablility(viewAllOrdersPage.checkButton,5);
          viewAllOrdersPage.checkButton.click();

          BrowserUtils.waitForClickablility(viewAllOrdersPage.uncheckButton,5);

          viewAllOrdersPage.uncheckButton.click();

          BrowserUtils.wait(3);

     }

     @Then("user verifies table headers as follows")
     public void user_verifies_table_headers_as_follows(List<String> dataTable) {

        Assert.assertEquals(dataTable,BrowserUtils.getListOfString(viewAllOrdersPage.tableHeaders));

          System.out.println(BrowserUtils.getListOfString(viewAllOrdersPage.tableHeaders));
     }

     int count1;
     @Then("user checks order count")
     public void user_checks_order_count() {
          count1 = viewAllOrdersPage.orderCounts.size();
          System.out.println("A");
     }


     @Then("user deletes {string}")
     public void user_deletes(String string) {
          BrowserUtils.waitForClickablility(viewAllOrdersPage.deleteButton,5);
          viewAllOrdersPage.deleteOrder(string);

          System.out.println("B");

     }
     int count2;
     @Then("user checks new order count")
     public void userChecksNewOrderCount() {
          BrowserUtils.wait(4);
          count2= viewAllOrdersPage.orderCounts.size();
          System.out.println("C");
     }

     @Then("user verifies that order deleted")
     public void user_verifies_that_order_deleted() {
          Assert.assertTrue(count2 == count1-1);

          System.out.println("D");
     }



}
