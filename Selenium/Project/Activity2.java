package CRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

	WebDriver driver;

	@BeforeClass
	public void before() {
		driver = new FirefoxDriver();
		// Open the browser
		driver.get("https://alchemy.hguy.co/crm");
	}

	@Test
	public void test() {
		WebElement imgurl = driver.findElement(By.xpath("//a[@title='SuiteCRM']"));
		imgurl.click();

		// Get the url of the header image.
		String url = driver.getCurrentUrl();

		// Print the url to the console.
		System.out.println("The Current Url :" + url);

	}

	@AfterClass
	public void after() {
		
		//close the browser
		driver.close();
	}

}
