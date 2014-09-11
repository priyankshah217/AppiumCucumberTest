package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppMenuPage extends AbstractScreen {

	@FindBy(name = "Activity")
	private WebElement appActivity;

	public AppMenuPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public AppActivityPage getActivityPage() {
		// TODO Auto-generated method stub
		appActivity.click();
		return new AppActivityPage(driver);
	}

}
