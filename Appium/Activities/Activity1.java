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
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity1 {
	
	AndroidDriver<MobileElement>driver;
	@BeforeClass
	public void before() throws MalformedURLException
	{
		
		 // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        
        caps.setCapability("deviceName", "Pixel4Emulator");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        caps.setCapability("noReset", true);
      
      
            // Set Appium Server Url
           URL remoteurl = new URL("http://127.0.0.1:4723/wd/hub");
          // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           //Initialize AndroidDriver
           driver= new AndroidDriver<MobileElement>(remoteurl,caps);
            System.out.println("Calculator is open");
     
        
    }

		    @Test
		   public void additiontest()
		   {
		    	MobileElement digit1=driver.findElementById("digit_5");
		    	digit1.click();
		    	MobileElement operation1=driver.findElementById("op_add");
		    	operation1.click();
		    	MobileElement digit2=driver.findElementById("digit_9");
		    	digit2.click();
		    	MobileElement operation2 = driver.findElementById("com.android.calculator2:id/eq");
		    	operation2.click();
		    	MobileElement result = driver.findElement(By.id("com.android.calculator2:id/result"));
                   String actual =result.getText();
                   Assert.assertEquals("14", actual);
}
		   @AfterClass
		   public void afterclass()
		   {
			   driver.quit();
		   }
}


