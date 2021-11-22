package com.mindtree.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//features//",
		glue= "stepdefinition",
		dryRun=false
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}