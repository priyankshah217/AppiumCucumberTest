package com.test.apidemo.app.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SecureDialogDescriptionScreen extends AbstractScreen {
	
	@AndroidFindBy(id = "io.appium.android.apis:id/show")
	private WebElement showSecureDialogButton;
	
	public SecureDialogDescriptionScreen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver, 15,
				TimeUnit.SECONDS), this);
	}

	public boolean hasShowSecureDialogButton() {
		// TODO Auto-generated method stub
		return showSecureDialogButton.isDisplayed();
	}

}
