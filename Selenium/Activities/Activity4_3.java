package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		String Title = driver.getTitle();
		System.out.println(Title);
		String h3=driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println(h3);
		String h5color=driver.findElement(By.xpath("//h5[contains(text(),'Fifth header')]")).getCssValue("color");
		System.out.println(h5color);
		String clss=driver.findElement(By.xpath("//div[2]/button[3]")).getAttribute("class");
		System.out.println(clss);
		String grey=driver.findElement(By.xpath("//div[3]/button[2]")).getText();
	    System.out.println(grey);
	    
	    
	}

}
