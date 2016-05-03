package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class AppScreen extends AbstractScreen {

    @AndroidFindBy(accessibility = "Activity")
    private AndroidElement appActivityElement;

    @AndroidFindBy(accessibility = "Notification")
    private WebElement appNotificationElement;

    @Autowired
    public AppScreen(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public void clickOnActivityLable() {
        appActivityElement.click();
        driver.scrollTo("Secure Surfaces");
    }

    public void clickOnNotificationLable() {
        appNotificationElement.click();
    }
}
