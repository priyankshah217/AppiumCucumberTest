package com.test.steps;

import io.appium.java_client.MobileBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by priyankp.shah on 5/3/16.
 */
@Component
@Scope("cucumber-glue")
public class SecureDialogSteps extends AbstractSteps {
    public boolean checkForSecureDialog() {
        return secureDialogScreen.isElementPresent(MobileBy.AccessibilityId("Show secure dialog"));
    }

    public void getSecureDialog() {
        secureDialogScreen.clickOnSecureDialog();
    }
}
