package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\YUVARAJ\\Downloads\\hook cucu\\Apr_Cucumber"
		+ "\\src\\test\\java\\feature",
		glue = "stepdefinition",
		tags = "  @Map",
		dryRun = false,
		publish = true)
public class Runner {

}
