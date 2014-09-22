package com.test.googlesearch.screens;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppiumGithubScreen extends AbstractScreen {

	@FindBy(partialLinkText = "View all issues")
	private WebElement viewAllIssuesLink;

	@FindBy(linkText = "▶")
	private WebElement nextIssuePageLink;

	public AppiumGithubScreen(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public AppiumGithubScreen viewAllIssues() {
		viewAllIssuesLink.click();
		return this;
	}

	public void navigateToIssue(String issueNo) {		
		while (!isElementPresent(By.name(issueNo))) {
			nextIssuePageLink.click();
		}
	}
}
