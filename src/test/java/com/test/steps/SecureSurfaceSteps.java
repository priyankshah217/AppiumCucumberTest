package com.test.steps;

import io.appium.java_client.MobileBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by priyankp.shah on 5/3/16.
 */
@Component
@Scope("cucumber-glue")
public class SecureSurfaceSteps extends AbstractSteps {
    public void getSecureDialogScreen() {
        secureSurfaceScreen.clickOnSecureDialogLable();
    }

    public boolean checkForSecureDialog() {
        return secureSurfaceScreen.isElementPresent(MobileBy.AccessibilityId("Secure Dialog"));
    }
}
