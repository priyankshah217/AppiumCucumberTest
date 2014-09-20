package com.test.selendroid.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class UserRegistrationScreen extends AbstractScreen {

	@AndroidFindBy(id = "io.selendroid.testapp:id/input_preferedProgrammingLanguage")
	private WebElement preferredProgrammingLanguage;

	@AndroidFindBy(id = "android:id/text1")
	private List<WebElement> languageList;

	@AndroidFindBy(id = "io.selendroid.testapp:id/inputUsername")
	private WebElement userNameInput;

	@AndroidFindBy(id = "io.selendroid.testapp:id/inputEmail")
	private WebElement userEmailInput;

	@AndroidFindBy(id = "io.selendroid.testapp:id/inputPassword")
	private WebElement userPassword;

	@AndroidFindBy(id = "io.selendroid.testapp:id/inputName")
	private WebElement inputNameText;

	@AndroidFindBy(id = "io.selendroid.testapp:id/input_adds")
	private WebElement addCheckBox;

	@AndroidFindBy(id = "io.selendroid.testapp:id/btnRegisterUser")
	private WebElement registerButton;

	public UserRegistrationScreen(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public UserRegistrationScreen fillUserName(String userName) {
		userNameInput.sendKeys(userName);
		return this;
	}

	public UserRegistrationScreen fillEmailID(String emailID) {
		userEmailInput.sendKeys(emailID);
		return this;
	}

	public UserRegistrationScreen fillPassword(String password) {
		userPassword.sendKeys(password);
		return this;
	}

	public UserRegistrationScreen fillName(String name) {
		inputNameText.clear();
		inputNameText.sendKeys(name);
		return this;
	}

	public UserRegistrationScreen selectProgrammingLanguage(String languageName) {
		driver.navigate().back();
		preferredProgrammingLanguage.click();
		for (WebElement el : languageList) {
			if (el.getText().equals(languageName)) {
				el.click();
				break;
			}
		}
		return this;
	}

	public UserRegistrationScreen selectAddsRadio() {
		addCheckBox.click();
		return this;
	}

	public VerifyUserScreen verifyUser() {
		registerButton.click();
		return new VerifyUserScreen(driver);
	}
}
