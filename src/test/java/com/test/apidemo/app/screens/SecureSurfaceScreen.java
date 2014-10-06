package com.test.apidemo.app.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SecureSurfaceScreen extends AbstractScreen {
	
	@AndroidFindBy(id="android:id/text1")
	private List<WebElement> secureSurfaceItemList;

	public SecureSurfaceScreen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver, 15,
				TimeUnit.SECONDS), this);
	}

	public SecureDialogDescriptionScreen getSecureDialogDescriptionScreen() {
		// TODO Auto-generated method stub
		for (WebElement el : secureSurfaceItemList) {
			if (el.getText().equals("Secure Dialog")) {
				el.click();
				break;
			}
		}
		return new SecureDialogDescriptionScreen(driver);
	}

}
