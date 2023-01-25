package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features"},
		glue = "stepDefinations",
		dryRun = false, 
		
		monochrome = true,
		plugin = {"pretty", "html:test-output","json:target/cucumber-report/cucmber.json"}
		)
public class Runner {

}
