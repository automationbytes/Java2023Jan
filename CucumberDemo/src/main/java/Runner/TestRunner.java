package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/java/FeaturesFiles/Google_2.feature"},
		glue = {"StepDefn"},
		plugin = {"pretty","html:reports/cucumber-rports.html"},
		publish = true
		
		)



public class TestRunner {

}
