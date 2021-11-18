package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/tables ");
		String Title = driver.getTitle();
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
		
		System.out.println(col.size());
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		System.out.println(row.size());
				
		WebElement valuebefore=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println(valuebefore.getText());
		
		WebElement sort = driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]"));
		System.out.println("click on the first header");
		sort.click();
		
		WebElement valueafter=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println(valueafter.getText());
		
		WebElement footer=driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
		System.out.println(footer.getText());
		
		driver.close();
			
		

	}

}
