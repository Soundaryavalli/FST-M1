package Activities;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Activity11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		String title= driver.getTitle();
		System.out.println(title);
		
		
		WebElement alert =driver.findElement(By.id("prompt"));
		alert.click();
       
		Alert prompt=driver.switchTo().alert();
		System.out.println(prompt.getText());
		prompt.sendKeys("Yes, you are");
		prompt.accept();
		
		
		
		
		driver.close();
		
		
		
}
	
}
