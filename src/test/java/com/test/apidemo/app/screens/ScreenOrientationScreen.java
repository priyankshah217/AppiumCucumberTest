package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ScreenOrientationScreen extends AbstractScreen {

	private String sensorType;
	@AndroidFindBy(id = "io.appium.android.apis:id/orientation")
	private WebElement orientationMenu;

	@AndroidFindBy(id = "android:id/text1")
	private List<WebElement> orientationList;

	@AndroidFindBy(id = "android:id/action_bar_title")
	private WebElement actionBarTitle;

	public ScreenOrientationScreen(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver, 15,
				TimeUnit.SECONDS), this);
	}

	public ScreenOrientationScreen changeScreenOrientation(String sensorType) {
		this.sensorType = sensorType;
		orientationMenu.click();
		if (!isElementPresent(By.name(sensorType))) {
			TouchAction action = new TouchAction(driver);
			action.press(245, 1637).waitAction(300).moveTo(245, 615).release()
					.perform();
		}
		for (WebElement el : orientationList) {
			if (el.getText().equals(sensorType)) {
				el.click();
				break;
			}
		}
		return this;
	}

	public boolean checkOrientationType() {
		boolean isPassed = false;
		if (orientationList.get(0).getText().equals(this.sensorType)) {
			isPassed = true;
		} else {
			takeScreenShot("InvalidOrientation");
		}
		return isPassed;
	}

	public boolean isItValidScreenOrientationPage() {
		boolean isPassed = false;
		if (actionBarTitle.getText().equals("App/Activity/Screen Orientation")) {
			isPassed = true;
		} else {
			takeScreenShot("InvalidSensor");
		}
		return isPassed;
	}
}
