package com.test;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.MalformedURLException;

import org.openqa.selenium.remote.CapabilityType;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.apidemo.app.screens.AppActivityPage;
import com.test.apidemo.app.screens.AppMenuPage;
import com.test.apidemo.app.screens.HomeScreen;
import com.test.apidemo.app.screens.ScreenOrientationPage;
import com.test.utils.TestAppUtils;

public class AppiumApiDemoAppTests {
	private TestAppUtils testAppUtils;
	private AppiumDriver driver;
	private HomeScreen homeScreen;
	private AppMenuPage appMenuPage;
	private AppActivityPage appActivityPage;
	private ScreenOrientationPage screenOrientationPage;

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws MalformedURLException {
		testAppUtils = new TestAppUtils();
		testAppUtils.setCapability(CapabilityType.BROWSER_NAME, "");
		testAppUtils.setCapability("platformVersion", "4.4.2");
		testAppUtils.setCapability("appium-version", "1.2.2");
		testAppUtils.setCapability("platformName", "Android");
		testAppUtils.setCapability("deviceName", "Android");
		testAppUtils.setCapability("automationName", "Appium");
		testAppUtils.setCapability("app", new File(ClassLoader
				.getSystemResource("ApiDemos-debug.apk").getFile())
				.getAbsolutePath());
		testAppUtils.setCapability("newCommandTimeout", "3600");
		testAppUtils.setCapability("deviceReadyTimeout", "3600");
		testAppUtils.setCapability("fullreset", "false");
		testAppUtils.setCapability("appActivity", ".ApiDemos");
		testAppUtils.setCapability("appPackage", "io.appium.android.apis");
		driver = testAppUtils.getDriver();
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		driver.quit();
	}

	@Test(groups = { "Smoke" }, enabled = true)
	public void testAppActivity() {
		homeScreen = new HomeScreen(driver);
		appMenuPage = homeScreen.getAppMenuPage();
		appActivityPage = appMenuPage.getActivityPage();
		screenOrientationPage = appActivityPage.browseAppActivityScreen()
				.getScreenOrientationPage();
		Assert.assertEquals(
				screenOrientationPage.isItValidScreenOrientationPage(), true);
		screenOrientationPage.changeScreenOrientation("FULL_SENSOR");
		Assert.assertEquals(screenOrientationPage.checkOrientationType(), true);
	}
}
