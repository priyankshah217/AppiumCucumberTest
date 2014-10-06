package com.test.apidemo.app.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen extends AbstractScreen {

	@AndroidFindBy(name = "App")
	private WebElement appMenuItem;

	public HomeScreen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver, 15,
				TimeUnit.SECONDS), this);
	}

	public AppMenuScreen getAppMenuPage() {
		// driver.findElement(By.name("App")).click();
		appMenuItem.click();
		return new AppMenuScreen(driver);
	}
}
