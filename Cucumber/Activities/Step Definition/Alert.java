package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Alert {

	WebDriver driver;
	org.openqa.selenium.Alert alert;
	@Given("^User is on the page$")
	public void given()
	{
		driver = new FirefoxDriver();
				driver.get("https://www.training-support.net/selenium/javascript-alerts");
	}
	@When("^User clicks the Simple Alert button$")
	public void Simple_Alert() {
		driver.findElement(By.id("simple")).click();
	}
	@When("^User clicks the Confirm Alert button$")
	public void Comfirm_Alert() {
		driver.findElement(By.id("confirm")).click();
	}
	@When("^User clicks the Prompt Alert button$")
	public void Prompt_Alert() {
		driver.findElement(By.id("prompt")).click();
	}
	@Then("^Alert opens$")
	public void then()
	{
		 alert = driver.switchTo().alert();
	}
	
	@And("^Read the text from it and print it$")
	public void and()
	{
	  String txt =alert.getText();
	  System.out.println(txt);
	  
	}
	@And("^Close the alert$")
	public void acceptalt() {
		alert.accept();
	}
	@And("^Close the alert with Cancel$")
	public void dismissalt() {
		alert.dismiss();
	}
	@And("^Write a custom message in it$")
	public void write()
	{
		alert.sendKeys("Hello");
	}
	@And("^Close Browser$")
	public void close()
	{
		driver.close();
	}
}
