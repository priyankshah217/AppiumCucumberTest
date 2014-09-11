package com.test.selendroid.app.screens;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyUserScreen extends AbstractScreen {

	@FindBy(id = "io.selendroid.testapp:id/buttonRegisterUser")
	private WebElement registerUserButton;

	public VerifyUserScreen(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public HomeScreen registerUser() {
		registerUserButton.click();
		return new HomeScreen(driver);
	}
}
