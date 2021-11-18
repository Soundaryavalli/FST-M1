package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String Title=driver.getTitle();
		System.out.println(Title);
		WebElement about =driver.findElement(By.xpath("//a[@id='about-link']"));
		about.click();
		String Title1=driver.getTitle();
		System.out.println(Title1);
		
		}

}
