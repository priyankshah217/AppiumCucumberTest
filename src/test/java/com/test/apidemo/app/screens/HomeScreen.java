package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen extends AbstractScreen {

	@FindBy(name = "App")
	private WebElement appMenuItem;

	public HomeScreen(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public AppMenuPage getAppMenuPage() {
		// driver.findElement(By.name("App")).click();
		appMenuItem.click();
		return new AppMenuPage(driver);
	}
}
