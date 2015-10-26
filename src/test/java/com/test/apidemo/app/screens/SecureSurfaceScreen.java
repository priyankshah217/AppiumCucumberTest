package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by priyankp.shah on 15/9/15.
 */
@Component
@Scope("cucumber-glue")
public class SecureSurfaceScreen extends AbstractScreen {
    @Autowired
    private SecureDialogScreen secureDialogScreen;
    private WebElement secureDialogElement;

    @Autowired
    public SecureSurfaceScreen(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public SecureDialogScreen getSecureDialogScreen() {
        secureDialogElement = this.getElement("apidemo.securesurfacescreen.securedialog.lable");
        secureDialogElement.click();
        return secureDialogScreen;
    }
}
