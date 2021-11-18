package com.example.TestNG.Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
WebDriver driver;

@BeforeClass
public void bc()
{
	driver = new FirefoxDriver();
	driver.get("https://www.training-support.net/selenium/login-form");
}
@Test
@Parameters({"user","pass"})
public void test(String user,String pass)
{
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
@AfterClass
public void ac() {
	driver.close();
}
}
