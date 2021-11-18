package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity6_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		driver.get("https://training-support.net/selenium/dynamic-controls");
String Title= driver.getTitle();
System.out.println(Title);
WebElement checkbox =driver.findElement(By.name("toggle"));
checkbox.click();
WebElement button=driver.findElement(By.id("toggleCheckbox"));
//click on remove checkbox
button.click();
wait.until(ExpectedConditions.invisibilityOf(checkbox));
//click on add checkbox
button.click();
wait.until(ExpectedConditions.visibilityOf(checkbox));
checkbox.click();

	}

}
