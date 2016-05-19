package com.test.stepdefs;

import com.test.utils.AppUtils;
import cucumber.api.java.After;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.MalformedURLException;

/**
 * Created by priyankp.shah on 5/19/16.
 */
public class Hooks {
    @Autowired
    public AppUtils utils;

    @After
    public void clearSession() {
        try {
            utils.getDriver().quit();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
