package CRMProject;

import java.util.List;

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

public class Activity8 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void before() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 20);

		// Open the browser
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

		// Navigate to the Sales -> Accounts page.
		WebElement sales = driver.findElement(By.id("grouptab_0"));

		Actions action = new Actions(driver);
		action.moveToElement(sales).build().perform();

		WebElement accounts = driver.findElement(By.id("moduleTab_9_Accounts"));
		action.moveToElement(accounts).build().perform();
		action.doubleClick(accounts).perform();

		// Wait for the table to be displayed
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//table[@class='list view table-responsive']")));

		// print the names of the first 5 odd-numbered rows

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				String txt = driver
						.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[" + i + "]/td[3]"))
						.getText();
				System.out.println(txt);

			}

		}
	}

	@AfterClass
	public void after() {
		// close the browser
		driver.close();
	}

}
