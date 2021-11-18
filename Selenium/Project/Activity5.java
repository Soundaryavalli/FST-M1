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

public class Activity5 {
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

		// Get the color of the navigation menu and print it to the console.

		String color1 = driver.findElement(By.id("grouptab_0")).getCssValue("color");
		System.out.println("Color of the navigation menu1" + color1);

		String color2 = driver.findElement(By.id("grouptab_1")).getCssValue("color");
		System.out.println("Color of the navigation menu2" + color2);

		String color3 = driver.findElement(By.id("grouptab_2")).getCssValue("color");
		System.out.println("Color of the navigation menu3" + color3);

		String color4 = driver.findElement(By.id("grouptab_3")).getCssValue("color");
		System.out.println("Color of the navigation menu4" + color4);

		String color5 = driver.findElement(By.id("grouptab_4")).getCssValue("color");
		System.out.println("Color of the navigation menu5" + color5);

		String color6 = driver.findElement(By.id("grouptab_5")).getCssValue("color");
		System.out.println("Color of the navigation menu5" + color6);

	}

	@AfterClass
	public void after() {
		
		//close the browser
		driver.close();
	}

}
