package com.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = "json:cucumber.json",features=".")
public class TestRunCuke extends AbstractTestNGCucumberTests {
	// Run this
	// @Test(groups = "Smoke", description =
	// "Example of using TestNGCucumberRunner to invoke Cucumber")
	// public void runCukes() {
	// new TestNGCucumberRunner(getClass()).runCukes();
	// }
}
