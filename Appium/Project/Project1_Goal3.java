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

public class Project1_Goal3 {

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
	public void googlekeep() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("new_note_button")));
		
		// Click the Create New Note button to add a new Note.
		driver.findElementById("new_note_button").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("title_editor_fragment")));
		
		//Add a title for the note and add a small description.
		driver.findElementById("editable_title").sendKeys("TestTitle1");
		driver.findElementById("edit_note_text").sendKeys("TestNote1");
		
		//Click the reminder icon on the toolbar to add a reminder for Afternoon of the same day.
		driver.findElementByAccessibilityId("Reminder").click();
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("menu_text")));
		driver.findElementByXPath("//android.widget.TextView[Contains(@text(),'Pick a date & time')]").click();
		driver.findElementById("com.google.android.keep:id/time_spinner");
		driver.findElementByXPath("//android.widget.TextView[1][Contains(@text(),'Afternoon')]").click();
		driver.findElementById("save").click();
		
		//switch to the Reminders page.
		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("reminder_chip")));
		MobileElement reminder = driver.findElementById("reminder_chip");
		
		

		// Assertion
     Assert.assertEquals(reminder.isDisplayed(), true);
	}

	@AfterClass
	public void afterclass() {
		driver.quit();
	}
}
