package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		
WebDriver driver = new FirefoxDriver();
driver .get(" https://training-support.net/selenium/simple-form");

String Title = driver.getTitle();
System.out.println(Title);
WebElement fn=driver.findElement(By.id("firstName"));
fn.sendKeys("Soundarya");
WebElement ln=driver.findElement(By.id("lastName"));
ln.sendKeys("Sudarsan");
WebElement mail=driver.findElement(By.id("email"));
mail.sendKeys("soundaryas123@gmail.com");
WebElement pn=driver.findElement(By.id("number"));
pn.sendKeys("1123456789");
WebElement submit=driver.findElement(By.xpath("//input[@value='submit']"));
submit.click();


	}

}
