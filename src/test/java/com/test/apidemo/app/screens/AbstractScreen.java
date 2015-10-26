package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
@PropertySources({
        @PropertySource("classpath:config_apidemo_elements.properties")
})
public abstract class AbstractScreen {

    @Value("${explicit.wait}")
    public int explicitWaitTime;
    @Value("${implicit.wait}")
    public int implicitWaitTime;
    @Value("${default.wait}")
    public int defaultWaitTime;
    public AppiumDriver<? extends MobileElement> driver;
    @Autowired
    private Environment env;

    public AbstractScreen(AppiumDriver<? extends MobileElement> driver) {
        // TODO Auto-generated constructor stub
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, implicitWaitTime,
                TimeUnit.SECONDS), this);

    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public List<? extends MobileElement> getElementList(String locatorName) {

        String locatorKeyVal = env.getProperty(locatorName);
        String locatorStrategy = locatorKeyVal.split(":")[0];
        String locatorValue = locatorKeyVal.split(":")[1];
        List<? extends MobileElement> elementList = null;

        switch (locatorStrategy) {
            case "AccessibilityID":
                elementList = driver.findElements(MobileBy.AccessibilityId(locatorValue));
                break;
            case "Class":
                elementList = driver.findElements(MobileBy.className(locatorValue));
                break;
            case "Xpath":
                elementList = driver.findElements(MobileBy.xpath(locatorValue));
                break;
            case "AndroidUIAutomator":
                elementList = driver.findElements(MobileBy.AndroidUIAutomator(locatorValue));
                break;
            case "Css":
                elementList = driver.findElements(MobileBy.cssSelector(locatorValue));
                break;
            case "Id":
                elementList = driver.findElements(MobileBy.id(locatorValue));
                break;
            case "Tag":
                elementList = driver.findElements(MobileBy.tagName(locatorValue));
                break;
            case "LinkText":
                elementList = driver.findElements(MobileBy.linkText(locatorValue));
                break;
            case "PartialLinkText":
                elementList = driver.findElements(MobileBy.partialLinkText(locatorValue));
                break;
        }
        return elementList;
    }

    public MobileElement getElement(String locatorName) {

        String locatorKeyVal = env.getProperty(locatorName);
        String locatorStrategy = locatorKeyVal.split(":")[0];
        String locatorValue = locatorKeyVal.split(":")[1];
        MobileElement element = null;

        switch (locatorStrategy) {
            case "AccessibilityID":
                element = driver.findElement(MobileBy.AccessibilityId(locatorValue));
                break;
            case "Class":
                element = driver.findElement(MobileBy.className(locatorValue));
                break;
            case "Xpath":
                element = driver.findElement(MobileBy.xpath(locatorValue));
                break;
            case "AndroidUIAutomator":
                element = driver.findElement(MobileBy.AndroidUIAutomator(locatorValue));
                break;
            case "Css":
                element = driver.findElement(MobileBy.cssSelector(locatorValue));
                break;
            case "Id":
                element = driver.findElement(MobileBy.id(locatorValue));
                break;
            case "Tag":
                element = driver.findElement(MobileBy.tagName(locatorValue));
                break;
            case "LinkText":
                element = driver.findElement(MobileBy.linkText(locatorValue));
                break;
            case "PartialLinkText":
                element = driver.findElement(MobileBy.partialLinkText(locatorValue));
                break;
        }
        return element;
    }

    public void takeScreenShot(String fileName) {
        // TODO Auto-generated method stub
        File file = new File(fileName + ".png");
        File tmpFile = driver
                .getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(tmpFile, file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
