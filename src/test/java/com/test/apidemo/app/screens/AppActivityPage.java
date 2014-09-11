package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

import org.openqa.selenium.support.PageFactory;

public class AppActivityPage extends AbstractScreen {

	public AppActivityPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void browseAppActivityScreen() {
		// TODO Auto-generated method stub

		TouchAction action = new TouchAction(driver);

		action.press(0, 1533).waitAction(300).moveTo(0, 219).release()
				.perform();

	}
}
