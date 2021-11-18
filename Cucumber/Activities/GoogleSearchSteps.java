package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on Google Home Page$")
	public void givenFunctionName() {
		
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,20);
		driver.get("https://www.google.com");
	
	}

	@When("^User types in Cheese and hits ENTER$")
	public void whenFunctionName() {
		driver.findElement(By.name("q")).sendKeys("Cheese");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	}

	@Then("^Show how many search results were shown$")
	public void thenFunctionName() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
		String txt=driver.findElement(By.id("result-stats")).getText();
		System.out.println(txt);
	}
	@And("^Close the browser$")
	public void andFunctionName()
	{
		driver.close();
	}
	

}
