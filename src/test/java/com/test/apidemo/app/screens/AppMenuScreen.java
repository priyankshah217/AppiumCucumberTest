package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AppMenuScreen extends AbstractScreen {

	@AndroidFindBy(name = "Activity")
	private WebElement appActivity;

	public AppMenuScreen(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver, 15,
				TimeUnit.SECONDS), this);
	}

	public AppActivityScreen getActivityPage() {
		// TODO Auto-generated method stub
		appActivity.click();
		return new AppActivityScreen(driver);
	}

}
