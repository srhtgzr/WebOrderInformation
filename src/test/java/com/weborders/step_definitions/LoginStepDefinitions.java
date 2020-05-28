package com.weborders.step_definitions;

import com.weborders.pages.LoginPage;
import com.weborders.utilities.BrowserUtils;
import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {


    LoginPage loginPage = new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        // test git
        Driver.get().get(ConfigurationReader.getProperty("url"));



    }

    @When("user login as an authorized user")
    public void user_login_as_an_authorized_user() {

        String username = ConfigurationReader.getProperty("username");

        String password = ConfigurationReader.getProperty("password");

        BrowserUtils.waitForVisibility(loginPage.loginInput,5);

        loginPage.login(username,password);

    }

}
