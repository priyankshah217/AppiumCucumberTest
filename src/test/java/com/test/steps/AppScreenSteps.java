package com.test.steps;

import io.appium.java_client.MobileBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by priyankp.shah on 5/3/16.
 */
@Component
@Scope("cucumber-glue")
public class AppScreenSteps extends AbstractSteps {
    public void getActivityScreen() {
        appScreen.clickOnActivityLable();
    }

    public void getNotificationScreen() {
        appScreen.clickOnNotificationLable();
    }

    public boolean checkForActivityScreen() {
        return appScreen.isElementPresent(MobileBy.AccessibilityId("Activity"));
    }
}
