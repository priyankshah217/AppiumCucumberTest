package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by priyankp.shah on 9/17/15.
 */
@Component
@Scope("cucumber-glue")
public class NotificationScreen extends AbstractScreen {

    private WebElement incomingMessageNotificationElement;

    @Autowired
    private IncomingMessageNotificationScreen incomingMessageNotificationScreen;


    @Autowired
    public NotificationScreen(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public IncomingMessageNotificationScreen getIncomingMessageNotificationScreen() {
        incomingMessageNotificationElement = this.getElement("apidemo.notificationscreen.incomingmessage.lable");
        incomingMessageNotificationElement.click();
        return incomingMessageNotificationScreen;
    }


}
