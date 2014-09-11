package com.test.utils;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class TestAppUtils {

	private DesiredCapabilities capabilities;
	private URL serverUrl;
	private AppiumDriver driver;

	public TestAppUtils() {
		// TODO Auto-generated constructor stub
		capabilities = new DesiredCapabilities();
	}

	public void setCapability(String capabilityName, String capabilityValue) {
		capabilities.setCapability(capabilityName, capabilityValue);		
	}

	public AppiumDriver getDriver() throws MalformedURLException {
		serverUrl = new URL("http://localhost:4723/wd/hub");
		driver = new AppiumDriver(serverUrl, capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
