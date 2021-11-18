package com.example.mobileTesting;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity2 {

	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;

	@BeforeClass
	public void before() throws MalformedURLException {

		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "Pixel4Emulator");
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);

		// Set Appium Server Url
		URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
	

		// Initialize AndroidDriver
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		System.out.println(" Browser is opened");

		wait = new WebDriverWait(driver, 10);
		

	}

	@Test
	public void test() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/");
		String pageTitle = driver.findElementByClassName("android.widget.TextView").getText();
		System.out.println("Title on Homepage: " + pageTitle);
		MobileElement aboutButton = driver.findElementByAccessibilityId("About Us");
		aboutButton.click();

		String newPageTitle = driver
				.findElementByClassName("android.widget.TextView")
				.getText();

		System.out.println("Title on new page: " + newPageTitle);

		// Assertions
		Assert.assertEquals(pageTitle, "Training Support");
		Assert.assertEquals(newPageTitle, "About Us");
	}

	@AfterClass
	public void after() {

		driver.quit();
	}
}
