package com.twitter.example;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Example of Automation with frameworks Selenium, Cucumber, Maven and with Java code. 
 * Creator: Nicolas Mori
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/cucumber-html-reports",
		"json:target/cucumber-html-reports/cucumber.json",
		"junit:target/surefire-reports/cucumber-junit.xml" }, features = "src/test/resources", tags = "@twiterSimpleTest", glue = { "com.twitter.steps" })
public class AppTest {

}