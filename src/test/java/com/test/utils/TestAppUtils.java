package com.test.utils;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestAppUtils {

	private DesiredCapabilities capabilities;
	private URL serverUrl;
	private AppiumDriver driver;

	public void setCapabilities() {
		capabilities = new DesiredCapabilities();
		File app = new File(ClassLoader.getSystemResource(
				"selendroid-test-app.apk").getFile());
		// capabilities.setCapability("name", "Enigma Automation");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformVersion", "4.4.2");
		capabilities.setCapability("appium-version", "1.2.2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Android");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("newCommandTimeout", "3600");
		capabilities.setCapability("deviceReadyTimeout", "3600");
		// capabilities.setCapability("fullReset", true);
		// capabilities.setCapability("noReset", true);
		capabilities.setCapability("appActivity", ".HomeScreenActivity");
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
	}

	public AppiumDriver getDriver() throws MalformedURLException {
		serverUrl = new URL("http://localhost:4723/wd/hub");
		driver = new AppiumDriver(serverUrl, capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
