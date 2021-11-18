package com.example.TestNG.Activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp()
	{
	driver = new FirefoxDriver();
	wait = new WebDriverWait(driver,20);
	
	driver.get("https://www.training-support.net/selenium/target-practice");
	}
	@Test(priority=0)
	public void test1()
	{
		driver.getTitle();
	}
	
	@Test(priority =1)
	public void test2()
	{
		String txt=driver.findElement(By.xpath("//button[contains(text(),'Black')]")).getText();
		Assert.assertEquals(txt,"black");
	}
	@Test(enabled= false)
	public void test3()
	{
		String txt=driver.findElement(By.xpath("//button[contains(text(),'Black')]")).getText();
		Assert.assertEquals(txt,"black");
	}
	@Test()
	public void test4()
	{
		throw new SkipException("It is skipped");
	}
	 @AfterClass
	 public void close() {
	 driver.close();
	 }
	

}
