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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.testng.annotations.Test;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project2_Goal1 {
	
	AndroidDriver<MobileElement>driver;
	WebDriverWait wait;
	@BeforeClass
	public void before() throws MalformedURLException
	{
		
		 // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        
       caps.setCapability("deviceName", "Pixel4Emulator");
       caps.setCapability("platformName", "android");
       caps.setCapability("automationName", "UiAutomator2");
       caps.setCapability("appPackage", "com.android.chrome");
       caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
       
        caps.setCapability("noReset", true);
        
        
        
            // Set Appium Server Url
           URL appServer  = new URL("http://127.0.0.1:4723/wd/hub");
           
           //Initialize AndroidDriver
           driver= new AndroidDriver<MobileElement>(appServer ,caps);
            System.out.println(" Browser is opened");
            
            wait= new WebDriverWait(driver,10);
            driver.get("https://www.training-support.net/selenium");
     
        
    }

		    @Test
		   public void test() 
		   {
		    	
		    	  	
		    	driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"To-Do List\"))")).click(); 
		    			    	
		    	wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.view.View")));

		    	wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("tasksCard")));
		    	String Taskstoadd [] =
			    	{"Task1","Task2","Task3"	    			
			    	};
			    	
			    	for(String Tasktoadd : Taskstoadd)
			    	{
		    	driver.findElementById("taskInput").sendKeys(Tasktoadd);
		    	driver.findElementByXPath("//android.view.View/android.view.View[1][contains(@text,'Add Task')]").click();
		    	
			    	}
			    	List<MobileElement> tasklist = driver.findElementsById("tasksList");
			    	for(MobileElement element: tasklist)
			    	{
			    		System.out.println("The No of Tasks are:"+ element.getSize());
			    	driver.findElement(MobileBy.id("tasksList")).click();
		            }
		    	driver.findElementByClassName("android.widget.TextView");
		    	List<MobileElement> tasklist1 = driver.findElementsById("tasksList");
		    	 Assert.assertEquals("TC Passed!",0,tasklist1.size());
		    	 Assert.assertEquals("TC Failed!",1,tasklist1.size());
		    	
		    		
}
		   @AfterClass
		   public void afterclass()
		   {
			   driver.quit();
		   }
}


