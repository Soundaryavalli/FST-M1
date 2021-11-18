package com.example.TestNG.Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;

	@BeforeClass
	public void bc() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}

	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {
		return new Object[][] { { "admin", "password" } };
	}

	@Test(dataProvider = "Authentication")
	public void credentials(String user, String pass) {
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Assert Message
		String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
		Assert.assertEquals(loginMessage, "Welcome Back, admin");

	}

	@AfterClass
	public void ac() {
		driver.close();
	}
}
