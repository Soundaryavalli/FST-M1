package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		driver.getTitle();
	    WebElement checkbox=driver.findElement(By.name("toggled"));
	    Boolean check = checkbox.isEnabled();
	    System.out.println(check); 
	    driver.findElement(By.name("toggled")).click();
	    Boolean check1 = checkbox.isEnabled();
	    System.out.println(check1); 
		
	}

}
