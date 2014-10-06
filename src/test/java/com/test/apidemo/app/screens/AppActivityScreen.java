package com.test.apidemo.app.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AppActivityScreen extends AbstractScreen {

	@AndroidFindBy(id = "android:id/text1")
	private List<WebElement> activityList;

	public AppActivityScreen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver, 15,
				TimeUnit.SECONDS), this);
	}

	public AppActivityScreen browseAppActivityScreen() {
		// TODO Auto-generated method stub

		// Swipe can be simulate using TouchAction

		// TouchAction action = new TouchAction(driver);
		// action.press(0, 1533).waitAction(900).moveTo(0, 219).release()
		// .perform();

		// Swipe can be simulate directly using AppiumDriver

		driver.swipe(0, 1533, 0, 219, 900);
		return this;
	}	

	public SecureSurfaceScreen getSecureSurfaceScreen() {
		// TODO Auto-generated method stub
		for (WebElement el : activityList) {
			if (el.getText().equals("Secure Surfaces")) {
				el.click();
				break;
			}
		}
		return new SecureSurfaceScreen(driver);
	}
}
