package com.test.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@Configuration
public class AppUtils {
    @Value("${explicit.wait}")
    public int explicitWaitTime;
    @Value("${implicit.wait}")
    public int implicitWaitTime;
    @Value("${default.wait}")
    public int defaultWaitTime;
    @Value("${application.path}")
    public String applicationName;
    @Value("${base.pkg}")
    public String basePkg;
    @Value("${application.activity}")
    public String appActivity;
    @Value("${appium.server.port}")
    private String appiumPort;
    @Value("${application.path}")
    private String appPath;
    @Value("${automation.instumentation}")
    private String instrumentation;
    @Value("${browser.name}")
    private String browserName;
    @Value("${platform.name}")
    private String platformName;
    @Value("${device.name}")
    private String deviceName;
    @Value("${platform.version}")
    private String platformVersion;
    @Value("${new.command.timeout}")
    private String newCommandTimeout;
    @Value("${device.ready.timeout}")
    private String deviceReadyTimeout;

    private DesiredCapabilities capabilities;
    private URL serverUrl;
    private AndroidDriver androidDriver;

    public AppUtils() throws MalformedURLException {
        // TODO Auto-generated constructor stub
    }

    @Bean(destroyMethod = "quit")
    @Scope("cucumber-glue")
    public AndroidDriver getDriver() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, browserName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, instrumentation);
        capabilities.setCapability(MobileCapabilityType.APP, new File(ClassLoader.getSystemResource(appPath).getFile()).getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, basePkg);
        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, appActivity);
        serverUrl = new URL("http://localhost:" + appiumPort + "/wd/hub");
        androidDriver = new AndroidDriver(serverUrl, capabilities);
        androidDriver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
        return androidDriver;
    }
}
