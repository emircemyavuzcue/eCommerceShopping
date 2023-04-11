package com.eCommerce.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/default-html-reports",
                "junit:target/cucumber-reports/Cucumber.xml",
                },
        //"rerun:target/rerun.txt"
        features = "src/test/resources/features",
        glue = "com/eCommerce/step_definitions",
        dryRun = false,
        tags = "@smokeTestSuite"
)
public class CukesRunner {
}