package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String Title=driver.getTitle();
		System.out.println(Title);
		WebElement fn= driver.findElement(By.xpath("//input[@id='firstName']"));
		fn.sendKeys("Sound");
		WebElement ln=driver.findElement(By.xpath("//input[@id='lastName']"));
		ln.sendKeys("Rams");
		WebElement mail=driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys("rams@gmail.com");
		WebElement pn=driver.findElement(By.xpath("//input[@id='number']"));
		pn.sendKeys("2345678912");
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
	}

}
