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

public class Project1_Goal1 {
	
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
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");

      
      
            // Set Appium Server Url
           URL remoteurl = new URL("http://127.0.0.1:4723/wd/hub");
           
           //Initialize AndroidDriver
           driver= new AndroidDriver<MobileElement>(remoteurl,caps);
           wait = new WebDriverWait(driver,10);
            System.out.println("Google task is open");
     
        
    }

		    @Test
		   public void googleTask() 
		   {
		    	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("welcome_get_started")));
		    	
		    	//Click the button to add a new task.
		    	driver.findElementById("welcome_get_started").click();
		    	
		    	//Add the following tasks:

		    	String Taskstoadd [] =
		    	{"Complete Activity with Google Tasks","Complete Activity with Google Keep","Complete the second Activity Google Keep"
		    			
		    	};
		    	
		    	
		    	//After each task is added, the Save button should be clicked.
		    	for(String Tasktoadd : Taskstoadd)
		    	{
		    	
		    	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
		    		    	
		    	driver.findElementById("tasks_fab").click();
		    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.id("add_task_title")));
		    	driver.findElementById("add_task_title").sendKeys(Tasktoadd);
		    	driver.findElementById("add_task_done").click();
		    	
		    	}
		    	
		    //Assertion
		    	wait.until(ExpectedConditions.textToBe(MobileBy.id("task_name"),"Complete the second Activity Google Keep"));
		    	List<MobileElement> taskadded = driver.findElementsById("task_name");
		    	assertEquals(taskadded.size(),3);
		    	assertEquals(taskadded.get(0).getText(),"Complete the second Activity Google Keep");
		    	
}
		   @AfterClass
		   public void afterclass()
		   {
			   driver.quit();
		   }
}


