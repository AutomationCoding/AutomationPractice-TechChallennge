package com.runner;

/** Cucumber Runner class to glue the step definition, features, report configurations **/ 

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "stepdefs" },monochrome=true, plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
		"html:target/cucumberReport",
		"json:target/cucumberReport/cucumber-json-report.json",
		"junit:target/cucumberReport/cucumber.xml" }, features = { 
				"src/test/resources/features/HomePage" }) 
public class CucumberRunner {

	
}
