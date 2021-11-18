package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		boolean check =driver.findElement(By.name("toggled")).isSelected();
		System.out.println(check);
		driver.findElement(By.name("toggled")).click();
		boolean check1=driver.findElement(By.name("toggled")).isSelected();
		System.out.println(check1);

	}

}
