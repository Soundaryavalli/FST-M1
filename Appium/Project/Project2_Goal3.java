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
import java.rmi.server.Operation;
import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project2_Goal3 {
	
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
            System.out.println(" Browser is open");
            
            wait= new WebDriverWait(driver,10);
            driver.get("https://www.training-support.net/selenium");
          //Scroll to find the Popups card and click it.
	    	driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Popups\"))")).click(); 
	    	
     
        
    }

		    @Test (priority= 1)
		   public void validcredentailstest()
		   {
		    	//wait for the page to load
		    	wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.view.View")));
		    	
		    	//click on Sign In button
		    	driver.findElementByXPath("//android.view.View/android.widget.Button[contains(@text,'Sign In')]").click();
		    	
		    	//Enter username and password input fields
		    	driver.findElementByXPath("//android.view.View/android.widget.EditText[1]").sendKeys("admin");
		    	driver.findElementByXPath("//android.view.View/android.widget.EditText[2]").sendKeys("password");
		    	
		    	//Click on the Log in button to submit.
		    	driver.findElementByXPath("//android.view.View/android.widget.Button[contains(@text,'Log in')]").click();
		    	
		    	
		    	//wait for the login message
		    	 wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//android.webkit.WebView/android.view.View/android.widget.TextView[4][contains(@text,'Welcome Back, admin')]"), "Welcome Back, admin"));
		    	
		    	//assertions
		    	String msg=driver.findElementById("action-confirmation").getText();
			    Assert.assertEquals("Welcome Back, admin", msg);	
			    	
			 	        		    	
             }


		    @Test (priority= 2)
			   public void invalidcredentailstest()
			   {
		    	   //wait for the page to load
			    	wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.view.View")));
			    	
			    	//click on Sign In button
			    	driver.findElementByXPath("//android.view.View/android.widget.Button").click();
			    	
			        //Enter username and password input fields  	
			    	driver.findElementByXPath("//android.view.View/android.widget.EditText[1]").sendKeys("admin123");
			    	driver.findElementByXPath("//android.view.View/android.widget.EditText[2]").sendKeys("password123");
			    	
			    	//Click on the Log in button to submit.
			    	driver.findElementByXPath("//android.view.View/android.widget.Button[contains(@text,'Log in')]").click();
			    	
			    	//wait for the text to be present
			    	 wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//android.webkit.WebView/android.view.View/android.widget.TextView[4][contains(@text,'Invalid Credentials')]"), "Invalid Credentials"));
			    	
			    	//assertions
			    	String msg=driver.findElementById("action-confirmation").getText();
				    Assert.assertEquals("Invalid Credentials", msg);	
				    		            
			    	
	            }

		    	

		   @AfterClass
		   public void afterclass()
		   {
			   driver.quit();
		   }
}


