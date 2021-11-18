package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String Title = driver.getTitle();
		System.out.println(Title);
		String txt=driver.findElement(By.name("toggled")).getText();
		System.out.println(txt);
		boolean check=driver.findElement(By.name("toggled")).isDisplayed();
		System.out.println(check);
		driver.findElement(By.name("toggled")).click();
		driver.findElement(By.name("toggled")).click();
		System.out.println(check);
		
	}

}
