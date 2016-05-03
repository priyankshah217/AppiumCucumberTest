package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
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

    @AndroidFindBy(accessibility = "Show App Notification")
    private WebElement showAppNotificationElement;

    @Autowired
    public IncomingMessageNotificationScreen(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public void clickOnNotificationbar() {
        showAppNotificationElement.click();
        ((AndroidDriver) driver).openNotifications();
    }
}
