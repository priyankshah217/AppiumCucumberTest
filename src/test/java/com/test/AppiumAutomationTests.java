package com.test;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.screens.HomeScreen;
import com.test.screens.UserRegistrationScreen;
import com.test.screens.VerifyUserScreen;
import com.test.utils.TestAppUtils;

public class AppiumAutomationTests {
	private TestAppUtils testAppUtils;
	private AppiumDriver driver;
	private UserRegistrationScreen userRegistrationScreen;
	private HomeScreen homeScreen;
	private VerifyUserScreen verifyUserScreen;

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws MalformedURLException {
		testAppUtils = new TestAppUtils();
		testAppUtils.setCapabilities();
		driver = testAppUtils.getDriver();
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		driver.quit();
	}

	@Test(groups = { "Smoke" })
	public void AppTest() {
		homeScreen = new HomeScreen(driver);
		userRegistrationScreen = homeScreen.getUserRegistration();
		verifyUserScreen = userRegistrationScreen.fillUserName("Priyank")
				.fillEmailID("abc@abc.com").fillPassword("123456")
				.fillName("Priyank Shah").selectProgrammingLanguage("C++")
				.selectAddsRadio().verifyUser();
		verifyUserScreen.registerUser();
	}
}
