package com.test.stepdefs;

import com.test.utils.AppUtils;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.MalformedURLException;

/**
 * Created by priyankp.shah on 9/17/15.
 */
public class NotificationStepDefs {
    @Autowired
    private AppUtils utils;

    @Then("^Message notification should be visible$")
    public void message_notification_should_be_visible() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true);
    }
    @After
    public void clearSession(){
        try {
            utils.getDriver().quit();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
