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

public class Activity11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		String title= driver.getTitle();
		System.out.println(title);
		
		
		WebElement Simplealert =driver.findElement(By.id("simple"));
		Simplealert.click();
       
		Alert simple=driver.switchTo().alert();
		System.out.println(simple.getText());
		simple.accept();
		
		driver.close();
		
		
		
}
	
}
