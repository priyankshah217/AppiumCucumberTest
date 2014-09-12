package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppActivityPage extends AbstractScreen {

	@FindBy(id = "android:id/text1")
	private List<WebElement> activityList;

	public AppActivityPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public AppActivityPage browseAppActivityScreen() {
		// TODO Auto-generated method stub
		TouchAction action = new TouchAction(driver);
		action.press(0, 1533).waitAction(900).moveTo(0, 219).release()
				.perform();
		return this;
	}

	public ScreenOrientationPage getScreenOrientationPage() {
		for (WebElement el : activityList) {
			if (el.getText().equals("Screen Orientation")) {
				el.click();
				break;
			}
		}
		return new ScreenOrientationPage(driver);
	}
}
