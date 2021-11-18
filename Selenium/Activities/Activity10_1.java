package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Activity10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		
		String title= driver.getTitle();
		System.out.println(title);
		
		Actions act= new Actions(driver);
		WebElement cube =driver.findElement(By.id("wrapD3Cube"));
		//		WebElement text= driver.findElement(By.id("D3Cube"));
       WebElement value= driver.findElement(By.className("active"));
		//Left click and print the value of the side in the front.
		act.moveToElement(cube).click().perform();
		WebElement value1= driver.findElement(By.className("active"));
		String number1 = value1.getText();
		System.out.println(number1);
		
		//Double click to show a random side and print the number.
		act.doubleClick(cube).perform();
		WebElement value2= driver.findElement(By.className("active"));
		String number2 = value2.getText();
		System.out.println(number2);
		
		//Right click and print the value shown on the front of the cube.
		act.contextClick(cube).perform();
		WebElement value3= driver.findElement(By.className("active"));
		String number3 = value3.getText();
		System.out.println(number3);
		
		
		
}
	
}
