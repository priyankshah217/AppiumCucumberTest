package com.test.selendroid.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class VerifyUserScreen extends AbstractScreen {

	@AndroidFindBy(id = "io.selendroid.testapp:id/buttonRegisterUser")
	private WebElement registerUserButton;

	public VerifyUserScreen(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public HomeScreen registerUser() {
		registerUserButton.click();
		return new HomeScreen(driver);
	}
}
