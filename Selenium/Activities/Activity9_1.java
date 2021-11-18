package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		
WebDriver driver = new FirefoxDriver();
driver.get("https://training-support.net/selenium/selects");
WebElement dropdown =driver.findElement(By.xpath("//select[@id='single-select']"));
Select select = new Select(dropdown);
select.selectByVisibleText("Option 2");
WebElement selectedvalue =driver.findElement(By.xpath("//h3[@id='single-value']"));
System.out.println(selectedvalue.getText());
select.selectByIndex(3);
System.out.println(selectedvalue.getText());
select.selectByValue("4");
System.out.println(selectedvalue.getText());
List<WebElement> alloption = select.getOptions();

for(WebElement option : alloption)
	System.out.println(option.getText());






	}
	 

}
