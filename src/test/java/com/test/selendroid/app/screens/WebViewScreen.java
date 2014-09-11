package com.test.selendroid.app.screens;

import io.appium.java_client.AppiumDriver;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebViewScreen extends AbstractScreen {

	@FindBy(id = "android:id/text1")
	private WebElement selectItemFromList;

	@FindBy(id = "android:id/text1")
	private List<WebElement> optionList;

	@FindBy(className = "android.widget.EditText")
	private WebElement enterNameText;

	@FindBy(className = "android.widget.Button")
	private List<WebElement> buttonList;

	public WebViewScreen(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void selectOptionFromList() {		
		selectItemFromList.click();
		optionList.get(0).click();
		enterNameText.sendKeys("abc@abc.com");
		buttonList.get(1).click();
	}

}
