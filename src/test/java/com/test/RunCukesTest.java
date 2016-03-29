package com.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:cucumber.json", features = {
        "src/test/resources/features/Notification.feature",
        "src/test/resources/features/SecureDialog.feature"},
        glue = "com.test.stepdefs")
public class RunCukesTest {

}
