package com.expedia.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"D:\\Testing\\Expedia capstone\\expedia\\src\\test\\java\\com\\expedia\\cucumber\\FlightSearch.feature"},
		glue = {"com.expedia.cucumber"},
				plugin = {"json:target/cucumber-report.json"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
