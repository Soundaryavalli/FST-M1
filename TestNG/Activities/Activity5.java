package com.example.TestNG.Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass(alwaysRun = true)
	public void bc() throws InterruptedException {
		
		driver = new FirefoxDriver();
		wait= new WebDriverWait(driver,20);
		driver.get("https://www.training-support.net/selenium/target-practice");
		Thread.sleep(5000);
	}
	@Test (groups= {"HeaderTests"})
	public void test1() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebElement element =driver.findElement(By.xpath("//h1"));
		wait.until(ExpectedConditions.visibilityOf(element));
		String title = driver.getTitle();
	String txt1= driver.findElement(By.xpath("//h3")).getText();
	Assert.assertEquals("Third header", txt1);
	}
	
	@Test (groups= {"HeaderTests"})
	public void test2()
	{
		
	String txt1=driver.findElement(By.xpath("//h5")).getCssValue("color");
	Assert.assertEquals("Green", txt1);
	}
	@Test (groups= {"ButtonTests"})
	public void test3()
	{
	WebElement button=driver.findElement(By.xpath("//div[@class='column'][2]/div/button[4]"));	
	String btntxt=button.getText();
	Assert.assertEquals(btntxt, "Olive");
		}
	@Test (groups= {"ButtonTests"})
	public void test4()
	{
	WebElement button=driver.findElement(By.xpath("//div[@class='column'][2]/div[3]/button[1]"));	
	String btntxt=button.getCssValue("color");
	Assert.assertEquals(btntxt, "brown");
		}
	
	@AfterClass()
	public void ac()
	{
	driver.close();	
	}

}
