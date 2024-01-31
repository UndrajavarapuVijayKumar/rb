package com.metlife.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = true,
        features = {"src/test/java/com/metlife/features"},
        glue = "com.metlife.stepdefinition",
        plugin={"html:TestOutput.html"},
        monochrome = true)

public class AllTestRunner {

}
