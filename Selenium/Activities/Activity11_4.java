package Activities;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("https://www.training-support.net/selenium/tab-opener");
		
		String title= driver.getTitle();
		System.out.println(title);
		
		
		WebElement tab =driver.findElement(By.id("launcher"));
		System.out.println("Parent window:"+ driver.getWindowHandle());
		tab.click();
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
	
		//Get Window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);
 
        //Loop through each handle
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
 
        //Print the handle of the current window
        System.out.println("Current window handle: " + driver.getWindowHandle());
 
		
		driver.findElement(By.id("actionButton")).click();
		 wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		String tabtitle= driver.getTitle();
		System.out.println(tabtitle);
		
		Set<String> allhandles =driver.getWindowHandles();
		System.out.println("All handles:"+ allhandles);
		
		//Loop through the handles set till we get to the newest handle
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
 
        //Print the handle of the current window
        System.out.println("New tab handle: " + driver.getWindowHandle());  
		
		
		
		//Get heading
        String newTabText = driver.findElement(By.className("sub header")).getText();
        System.out.println("New tab heading is: " + newTabText);
		
		driver.quit();
		
		
		
}
	
}
