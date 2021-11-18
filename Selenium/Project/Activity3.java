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

public class Activity3 {

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
	public void test() {
		WebElement txt = driver.findElement(By.id("admin_options"));
		wait.until(ExpectedConditions.visibilityOf(txt));

		// Get the first copyright text in the footer.
		String footer = txt.getText();

		// Print the text to the console
		System.out.println("The Footer text is :" + footer);

	}

	@AfterClass
	public void after() {

		// close the browser
		driver.close();
	}

}
