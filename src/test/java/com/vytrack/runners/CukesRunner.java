package com.vytrack.runners;


import io.cucumber.java.StepDefinitionAnnotations;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"json:target/cucumber.json"},

        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
         dryRun = false,  // it control only steps are here  or not
         tags = "@loginAs"
)
public class CukesRunner {


}
