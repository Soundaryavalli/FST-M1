package CRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
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
	public void test() throws InterruptedException {
		
		// Enter the username and password 
		WebElement user = driver.findElement(By.id("user_name"));
		wait.until(ExpectedConditions.visibilityOf(user));

		user.sendKeys("admin");
		WebElement pass = driver.findElement(By.id("username_password"));
		pass.sendKeys("pa$$w0rd");
		driver.findElement(By.name("Login")).click();

		// Navigate to Sales -> Leads
		WebElement sales = driver.findElement(By.id("grouptab_0"));

		Actions action = new Actions(driver);
		action.moveToElement(sales).build().perform();

		// Additional information icon
		WebElement leads = driver.findElement(By.id("moduleTab_9_Leads"));
		action.moveToElement(leads).build().perform();
		action.doubleClick(leads).perform();

		// wait for Additional details popup to open
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Additional Details']")));
		WebElement additionaldetails = driver.findElement(By.xpath("//span[@title='Additional Details']"));
		action.moveToElement(additionaldetails).build().perform();
		action.doubleClick(additionaldetails).perform();
		Thread.sleep(3000);
		// Read the popup and print the phone number displayed in it.

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='phone']")));
		String txt = driver.findElement(By.xpath("//span[@class='phone']")).getText();
		System.out.println(txt);

	}

	@AfterClass
	public void after() {

		// Close the browser
		driver.close();
	}

}
