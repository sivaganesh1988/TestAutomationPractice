package com.test.sivaganesh.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"pretty", "html:target/cucumber-report",
        "json:target/cucumber.json"}, glue = "Steps",
        dryRun = false,
        features = "src/test/resources/features/")

public class TestRunner {

}
