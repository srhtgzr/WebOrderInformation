package com.weborders.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features ={"src/test/resources/feature/login",
                "src/test/resources/feature/view_all_orders"
        } ,
        glue = "com/weborders/step_definitions",
        //dryRun = false,
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        }
)

public class RegressionRunner {


}

