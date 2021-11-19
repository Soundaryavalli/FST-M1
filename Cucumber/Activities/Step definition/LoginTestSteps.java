package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginTestSteps {
	
	WebDriver driver;
	
	@Given("^User is on Login page$")
	public void given()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	
	//@When("^User enters username and password$")
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void when(String username,String password)
	{
		//driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("^Read the page title and confirmation message$")
	public void then()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String txt =driver.findElement(By.id("action-confirmation")).getText();
		Assert.assertEquals("Welcome Back, admin", txt);
		
		
	}
	@And("^Close the Browser$")
	public void and()
	{
		driver.close();
	}
}
