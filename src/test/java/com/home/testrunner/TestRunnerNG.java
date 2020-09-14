package com.home.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunnerNG {
	// features folder and stepdef can communicate through TestRunner
	@CucumberOptions(
	features = {"Features"},
	glue = {"com.home.stepdefs"} 
	)
	public class Testrunner extends AbstractTestNGCucumberTests{}

}
