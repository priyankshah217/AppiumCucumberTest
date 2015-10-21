package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class AppScreen extends AbstractScreen {

    @Autowired
    private NotificationScreen notificationScreen;

    @Autowired
    private ActivityScreen activityScreen;

    @AndroidFindBy(accessibility = "Activity")
    private WebElement appActivityElement;

    @AndroidFindBy(accessibility = "Notification")
    private WebElement appNotificationElement;

    @Autowired
    public AppScreen(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public ActivityScreen getActivityScreen() {
        appActivityElement.click();
        driver.scrollTo("Secure Surfaces");
        return activityScreen;
    }

    public NotificationScreen getNotificationScreen() {
        appNotificationElement.click();
        return notificationScreen;
    }
}
