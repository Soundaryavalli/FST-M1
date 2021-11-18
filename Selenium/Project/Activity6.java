package CRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void before() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 20);

		// open the browser
		driver.get("https://alchemy.hguy.co/crm");

	}

	@Test
	public void test() {
		
		// Enter the username and password 
		WebElement user = driver.findElement(By.id("user_name"));
		wait.until(ExpectedConditions.visibilityOf(user));

		user.sendKeys("admin");
		WebElement pass = driver.findElement(By.id("username_password"));
		pass.sendKeys("pa$$w0rd");
		driver.findElement(By.name("Login")).click();

		// Locate the navigation menu.
		// Ensure that the “Activities” menu item exists.

		driver.findElement(By.id("grouptab_3")).isDisplayed();

	}

	@AfterClass
	public void after() {
		// Close the browser
		driver.close();
	}
}
