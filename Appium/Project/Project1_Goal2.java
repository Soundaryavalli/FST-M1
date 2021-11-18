package com.example.mobileTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.server.Operation;
import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project1_Goal2 {

	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;

	@BeforeClass
	public void before() throws MalformedURLException {

		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "Pixel4Emulator");
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.google.android.keep");
		caps.setCapability("appActivity", ".activities.BrowseActivity");
		caps.setCapability("noReset", "true");

		// Set Appium Server Url
		URL remoteurl = new URL("http://127.0.0.1:4723/wd/hub");

		// Initialize AndroidDriver
		driver = new AndroidDriver<MobileElement>(remoteurl, caps);
		wait = new WebDriverWait(driver, 10);
		System.out.println("Google Keep is open");

	}

	@Test
	public void googleKeep() {

		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("new_note_button")));
		
		// Click the Create New Note button to add a new Note.
		driver.findElementById("new_note_button").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("title_editor_fragment")));
		
		//Add a title for the note and add a small description.
		driver.findElementById("editable_title").sendKeys("Dailyneeds");
		driver.findElementById("edit_note_text").sendKeys("Milk,Paper,Vegetables");
		
		//Press the back button and search for added new task
		
		driver.findElementByAccessibilityId("Open navigation drawer").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.google.android.keep:id/drawer_layout")));
		driver.findElementById("open_search_bar_text_view").sendKeys("Dailyneeds");
		MobileElement newtask = driver.findElementById("browse_text_note");

		// Assertion

		Assert.assertEquals(newtask.isDisplayed(), true);

	}

	@AfterClass
	public void afterclass() {
		driver.quit();
	}
}
