package com.test.screens;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen extends AbstractScreen {

	@FindBy(id = "io.selendroid.testapp:id/buttonStartWebview")
	private WebElement startWebViewButton;

	@FindBy(id = "io.selendroid.testapp:id/buttonTest")
	private WebElement testButton;

	@FindBy(id = "io.selendroid.testapp:id/startUserRegistration")
	private WebElement userRegistrationButton;

	@FindBy(id = "io.selendroid.testapp:id/my_text_field")
	private WebElement textEditField;

	@FindBy(id = "io.selendroid.testapp:id/waitingButtonTest")
	private WebElement waitingTestButton;

	@FindBy(id = "io.selendroid.testapp:id/input_adds_check_box")
	private WebElement addsCheckBox;

	@FindBy(id = "io.selendroid.testapp:id/visibleButtonTest")
	private WebElement visibleTestButton;

	@FindBy(id = "io.selendroid.testapp:id/showToastButton")
	private WebElement showToastButton;

	@FindBy(id = "io.selendroid.testapp:id/showPopupWindowButton")
	private WebElement showPopupButton;

	@FindBy(id = "io.selendroid.testapp:id/exceptionTestButton")
	private WebElement exceptionTestButton;

	@FindBy(id = "io.selendroid.testapp:id/exceptionTestField")
	private WebElement exceptionEditTextField;

	@FindBy(id = "io.selendroid.testapp:id/encodingTextview")
	private WebElement encodingEditTextField;

	public HomeScreen(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public UserRegistrationScreen getUserRegistration() {
		userRegistrationButton.click();
		return new UserRegistrationScreen(driver);
	}

}
