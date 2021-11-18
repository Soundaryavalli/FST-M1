package com.example.TestNG.Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
	@BeforeClass
	public void before()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
	}
	@Test
	public void test() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Training Support");
		driver.findElement(By.id("about-link")).click();
		String title2=driver.getTitle();
		Assert.assertEquals(title2, "About Training Support");
	}
	@AfterClass
	public void after() {
		driver.close();
	}

}
