package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenOrientationPage extends AbstractScreen {

	private String sensorType;
	@FindBy(id = "io.appium.android.apis:id/orientation")
	private WebElement orientationMenu;

	@FindBy(id = "android:id/text1")
	private List<WebElement> orientationList;

	@FindBy(id = "android:id/action_bar_title")
	private WebElement actionBarTitle;

	public ScreenOrientationPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public ScreenOrientationPage changeScreenOrientation(String sensorType) {
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
