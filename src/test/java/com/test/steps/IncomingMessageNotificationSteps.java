package com.test.steps;

import io.appium.java_client.MobileBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by priyankp.shah on 5/3/16.
 */
@Component
@Scope("cucumber-glue")
public class IncomingMessageNotificationSteps extends AbstractSteps {
    public boolean checkIncomingNotification() {
        return incomingMessageNotificationScreen.isElementPresent(MobileBy.AccessibilityId("Show App Notification"));
    }

    public void openMessageNotification() {
        incomingMessageNotificationScreen.clickOnNotificationbar();
    }
}
