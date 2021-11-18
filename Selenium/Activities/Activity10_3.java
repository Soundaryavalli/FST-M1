package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		
		driver.get("https://training-support.net/selenium/drag-drop");
		
		String title= driver.getTitle();
		System.out.println(title);
		
       WebElement ball = driver.findElement(By.id("draggable"));
       WebElement dropzone1 = driver.findElement(By.id("droppable"));
       WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        
       actions.dragAndDrop(ball, dropzone1).perform();
       
       //wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone1, "Drop1zone"));
       System.out.println("ENTERED DROPZONE 1");
       
       actions.dragAndDrop(dropzone1, dropzone2).perform();
       //wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone2, "Drop2zone"));
       System.out.println("ENTERED DROPZONE 2");
 
        //Close browser
        driver.close();
		
		
}
	
}
