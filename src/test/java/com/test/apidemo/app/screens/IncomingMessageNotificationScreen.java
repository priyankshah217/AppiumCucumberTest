package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by priyankp.shah on 9/17/15.
 */
@Component
@Scope("cucumber-glue")
public class IncomingMessageNotificationScreen extends AbstractScreen {

    private WebElement showAppNotificationElement;

    @Autowired
    public IncomingMessageNotificationScreen(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public void openMessageNotification() {
        showAppNotificationElement = this.getElement("apidemo.incomingmessagenotification.appnotification.lable");
        showAppNotificationElement.click();
        ((AndroidDriver) driver).openNotifications();
    }
}
