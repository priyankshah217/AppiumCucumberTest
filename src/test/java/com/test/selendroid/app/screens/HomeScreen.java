package com.test.selendroid.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen extends AbstractScreen {

	@AndroidFindBy(id = "io.selendroid.testapp:id/buttonStartWebview")
	private WebElement startWebViewButton;

	@AndroidFindBy(id = "io.selendroid.testapp:id/buttonTest")
	private WebElement testButton;

	@AndroidFindBy(id = "io.selendroid.testapp:id/startUserRegistration")
	private WebElement userRegistrationButton;

	@AndroidFindBy(id = "io.selendroid.testapp:id/my_text_field")
	private WebElement textEditField;

	@AndroidFindBy(id = "io.selendroid.testapp:id/waitingButtonTest")
	private WebElement waitingTestButton;

	@AndroidFindBy(id = "io.selendroid.testapp:id/input_adds_check_box")
	private WebElement addsCheckBox;

	@AndroidFindBy(id = "io.selendroid.testapp:id/visibleButtonTest")
	private WebElement visibleTestButton;

	@AndroidFindBy(id = "io.selendroid.testapp:id/showToastButton")
	private WebElement showToastButton;

	@AndroidFindBy(id = "io.selendroid.testapp:id/showPopupWindowButton")
	private WebElement showPopupButton;

	@AndroidFindBy(id = "io.selendroid.testapp:id/exceptionTestButton")
	private WebElement exceptionTestButton;

	@AndroidFindBy(id = "io.selendroid.testapp:id/exceptionTestField")
	private WebElement exceptionEditTextField;

	@AndroidFindBy(id = "io.selendroid.testapp:id/encodingTextview")
	private WebElement encodingEditTextField;

	public HomeScreen(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public UserRegistrationScreen getUserRegistration() {
		userRegistrationButton.click();
		return new UserRegistrationScreen(driver);
	}
	
	public WebViewScreen openWebView(){
		startWebViewButton.click();
		return new WebViewScreen(driver);
	}

}
