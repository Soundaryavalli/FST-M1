package com.example.mobileTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.server.Operation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity3 {

	AndroidDriver<MobileElement> driver;

	@BeforeClass
	public void before() throws MalformedURLException {

		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "Pixel4Emulator");
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.calculator2");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");

		// Set Appium Server Url
		URL remoteurl = new URL("http://127.0.0.1:4723/wd/hub");

		// Initialize AndroidDriver
		driver = new AndroidDriver<MobileElement>(remoteurl, caps);
		System.out.println("Calculator is open");

	}

	@Test
	public void additiontest() {
		// Calculate 5 + 9 and print the result to the console.
		MobileElement digit1 = driver.findElementById("digit_5");
		digit1.click();
		MobileElement operation1 = driver.findElementById("op_add");
		operation1.click();
		MobileElement digit2 = driver.findElementById("digit_9");
		digit2.click();
		MobileElement operation2 = driver.findElementById("com.android.calculator2:id/eq");
		operation2.click();
		MobileElement result = driver.findElement(By.id("com.android.calculator2:id/result"));

		String actual = result.getText();

		Assert.assertEquals("14", actual);
	}

	@Test

	public void subtest() {

		// Calculate 10 - 5 and print the result to the console.
		driver.findElementById("digit_1").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("op_sub").click();
		driver.findElementById("digit_5").click();

		driver.findElementById("com.android.calculator2:id/eq");

		MobileElement result = driver.findElement(By.id("com.android.calculator2:id/result"));

		String actual = result.getText();
		Assert.assertEquals("5", actual);

	}

	@Test
	public void multipletest() {

		// Calculate 5 * 100 and print the result to the console
		driver.findElementById("digit_5").click();
		driver.findElementById("op_mul").click();
		driver.findElementById("digit_1").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("digit_0").click();

		driver.findElementById("com.android.calculator2:id/eq");

		MobileElement result = driver.findElement(By.id("com.android.calculator2:id/result"));

		String actual = result.getText();
		Assert.assertEquals("500", actual);
	}

	@Test
	public void divisiontest() {
		// Calculate 50 / 2 and print the result to the console.

		driver.findElementById("digit_5").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("op_div").click();
		driver.findElementById("digit_2").click();

		driver.findElementById("com.android.calculator2:id/eq");

		MobileElement result = driver.findElement(By.id("com.android.calculator2:id/result"));

		String actual = result.getText();
		Assert.assertEquals("25", actual);
	}

	@AfterClass
	public void afterclass() {
		driver.quit();
	}
}
