package CRMProject;

import java.util.ArrayList;
import java.util.Arrays;
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

public class Activity9 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void before() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 20);

		// Open the Browser
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

		// Navigate to the Sales -> Leads.

		WebElement sales = driver.findElement(By.id("grouptab_0"));

		Actions action = new Actions(driver);
		action.moveToElement(sales).build().perform();

		WebElement leads = driver.findElement(By.id("moduleTab_9_Leads"));
		action.moveToElement(leads).build().perform();
		action.doubleClick(leads).perform();

		// wait for the table to be displayed
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//table[@class='list view table-responsive']")));

		// Initialize the list
		List<String> listname = new ArrayList<String>();
		List<String> listuser = new ArrayList<String>();

		for (int i = 1; i <= 10; i++) {

			String names = driver.findElement(By.xpath("//tr[" + i + "]/td[@type='name']//a")).getText();
			String users = driver.findElement(By.xpath("//tr[" + i + "]/td[@type='relate']//a")).getText();

			listname.add(names);
			listuser.add(users);
		}

		// print the first 10 values in the Name column and the User column .
		System.out.println("The first 10 values in the Name column " + listname);
		System.out.println("The first 10 values in the User column " + listuser);
	}

	@AfterClass
	public void after() {

		// close the browser
		driver.close();
	}

}
