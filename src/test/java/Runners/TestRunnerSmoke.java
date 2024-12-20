package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"} ,
        tags="@SmokeTest"
)

public class TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
