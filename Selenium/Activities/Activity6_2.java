package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait= new WebDriverWait(driver,10);
	
	driver.get("https://training-support.net/selenium/ajax");
String title= driver.getTitle();

driver.findElement(By.xpath("//div[@id='ajax-content']/button")).click();

wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='ajax-content']/h1"), "HELLO!"));
String txt=driver.findElement(By.xpath("//div[@id='ajax-content']/h1")).getText();
System.out.println(txt);
wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='ajax-content']/h3"), "I'm late!"));
String txt1=driver.findElement(By.xpath("//div[@id='ajax-content']/h3")).getText();
	System.out.println(txt1);
	}

}
