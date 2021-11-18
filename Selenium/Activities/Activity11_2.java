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

public class Activity11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		String title= driver.getTitle();
		System.out.println(title);
		
		
		WebElement Confirmalert =driver.findElement(By.id("confirm"));
		Confirmalert.click();
       
		Alert confirm=driver.switchTo().alert();
		System.out.println(confirm.getText());
		confirm.accept();
		
		Confirmalert.click();
	       
		Alert alertdismiss=driver.switchTo().alert();
		System.out.println(confirm.getText());
		alertdismiss.dismiss();
		
		
		driver.close();
		
		
		
}
	
}
