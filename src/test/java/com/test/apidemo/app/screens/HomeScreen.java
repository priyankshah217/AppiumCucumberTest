package com.test.apidemo.app.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class HomeScreen extends AbstractScreen {

    @Autowired
    private AppScreen appScreen;

    @AndroidFindBy(accessibility = "App")
    private WebElement appMenuElement;

    @Autowired
    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public AppScreen getAppScreen() {
        appMenuElement.click();
        return appScreen;
    }
}
