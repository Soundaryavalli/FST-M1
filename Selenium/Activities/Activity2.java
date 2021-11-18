package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String Title=driver.getTitle();
		System.out.println(Title);
		//WebElement text=driver.findElement(By.id("about-link"));
		//WebElement text=driver.findElement(By.linkText("About Us"));
		//WebElement text= driver.findElement(By.className("green"));
		//WebElement text =driver.findElement(By.cssSelector("a.button"));
		WebElement text =driver.findElement(By.cssSelector("a#about-link"));
		String txt=text.getText();
		System.out.println(txt);
		//driver.close();
		//driver.quit();
	}

}
