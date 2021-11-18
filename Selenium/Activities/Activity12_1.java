package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("https://www.training-support.net/selenium/iframes");
		
		String title= driver.getTitle();
		System.out.println(title);
		//Frame 1
		driver.switchTo().frame(0);
		
		String heading1=driver.findElement(By.xpath("//div[@class='sub header']")).getText();
		System.out.println(heading1);
		
		WebElement button1 = driver.findElement(By.id("actionButton"));
		System.out.println(button1.getText());
		System.out.println(button1.getCssValue("background-color"));
		button1.click();
		
		
		System.out.println(button1.getText());
		System.out.println(button1.getCssValue("background-color"));
		
		driver.switchTo().defaultContent();
		
		//Frame 2
	
	    driver.switchTo().frame(1);
		
		String heading2=driver.findElement(By.xpath("//div[@class='sub header']")).getText();
		System.out.println(heading2);
		WebElement button2 = driver.findElement(By.id("actionButton"));
		wait.until(ExpectedConditions.elementToBeClickable(button2));
		
		System.out.println(button2.getText());
		System.out.println(button2.getCssValue("background-color"));
		button2.click();
		
		
		System.out.println(button2.getText());
		System.out.println(button2.getCssValue("background-color"));
		
		//Switch back to parent page
        driver.switchTo().defaultContent();
 
        //Close browser
        driver.close();
		
}
	
}
