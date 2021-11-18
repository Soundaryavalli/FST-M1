package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement select =driver.findElement(By.id("multi-select"));
		WebElement selectedvalue = driver.findElement(By.id("multi-value"));
		Select multiselect = new Select(select);
		
		multiselect.selectByVisibleText("Javascript");
		System.out.println(selectedvalue.getText());
		
		multiselect.selectByValue("3");
		System.out.println(selectedvalue.getText());
		
		for(int i=4;i<=6;i++)
		{
		multiselect.selectByIndex(i);
		
		}
		System.out.println(selectedvalue.getText());
		
		multiselect.deselectByValue("3");
		multiselect.deselectByIndex(6);
		System.out.println(selectedvalue.getText());
		
		WebElement first =multiselect.getFirstSelectedOption();
		System.out.println(first.getText());
		
		List<WebElement> selectionoption = multiselect.getAllSelectedOptions();
		
		
		for (WebElement selectoption :selectionoption)
		{
			System.out.println(selectoption.getText()); 
		}
		
		
		multiselect.deselectAll();
		
		System.out.println(selectedvalue.getText());
		
		;
	}

}
