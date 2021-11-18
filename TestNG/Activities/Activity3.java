package com.example.TestNG.Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {

	WebDriver driver;
	 @BeforeClass
	 public void bc()
	 {
		 driver =new FirefoxDriver();
		 driver.get("https://www.training-support.net/selenium/login-form");
	 }
	 @Test
	 public void login()
	 {
		 WebElement username= driver.findElement(By.id("username"));
		 WebElement password=driver.findElement(By.id("password"));
		 username.sendKeys("admin");
		 password.sendKeys("password ");
		 
	 }
	 @Test
	 public void submit()
	 {
		
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
	 }
	 @AfterClass
	 public void ac()
	 {
		 driver.close();
		 
	 }
}
