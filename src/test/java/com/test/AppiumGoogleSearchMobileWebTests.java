package com.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.googlesearch.screens.AppiumGithubScreen;
import com.test.googlesearch.screens.GoogleSearchHomeScreen;
import com.test.utils.TestAppUtils;

public class AppiumGoogleSearchMobileWebTests {
	private TestAppUtils testAppUtils;
	private AppiumDriver driver;
	private GoogleSearchHomeScreen googleSearchHomeScreen;
	private AppiumGithubScreen appiumGitHubScreen;

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws IOException {
		TestAppUtils
				.loadConfigProp("config_googlesearch_mobile_web.properties");
		testAppUtils = new TestAppUtils();
		testAppUtils.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		testAppUtils.setCapability(MobileCapabilityType.PLATFORM_VERSION,
				"4.4.2");
		testAppUtils.setCapability(MobileCapabilityType.PLATFORM_NAME,
				"Android");
		testAppUtils.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		testAppUtils.setCapability(MobileCapabilityType.AUTOMATION_NAME,
				"Appium");
		driver = testAppUtils.getDriver();
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		driver.quit();
	}

	@Test(groups = { "Smoke" }, enabled = true)
	public void testBrowseTopic() {

		googleSearchHomeScreen = new GoogleSearchHomeScreen(driver);
		appiumGitHubScreen = googleSearchHomeScreen.openGoogleSearch()
				.searchFor("Appium").openAppiumGitHub();
		appiumGitHubScreen.viewAllIssues().navigateToIssue("#3564");
	}
}
