package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
        monochrome = true,
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-report/Extent.html" },
        features = "src/test/resources/Features",
        glue = {"stepdefinitions"}
		)

public class RunnerTest extends AbstractTestNGCucumberTests
{

}
