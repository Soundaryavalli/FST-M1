package CRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;

	@BeforeClass
	public void before() {
		driver = new FirefoxDriver();
		// open a browser.
		driver.get("https://alchemy.hguy.co/crm");
	}

	@Test
	public void test() {

		// Get the title of the website
		String title = driver.getTitle();

		// Make sure it matches “SuiteCRM” exactly
		Assert.assertEquals(title, "SuiteCRM");

	}

	@AfterClass
	public void after() {

		// Close the browser
		driver.close();
	}

}
