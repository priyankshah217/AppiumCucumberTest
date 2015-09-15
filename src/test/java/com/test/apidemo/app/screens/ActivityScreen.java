package com.test.apidemo.app.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * Created by priyankp.shah on 15/9/15.
 */
@Component
public class ActivityScreen extends AbstractScreen {

    @Autowired
    private SecureSurfaceScreen secureSurfaceScreen;

    @AndroidFindBy(accessibility = "Secure Surfaces")
    private WebElement secureSurfaceElement;

    @Autowired
    public ActivityScreen(AndroidDriver driver) {
        super(driver);
    }

    public SecureSurfaceScreen getSecureSurfaceScreen() {
        secureSurfaceElement.click();
        return secureSurfaceScreen;
    }
}
