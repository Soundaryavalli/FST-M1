package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_3 {
    public static void main(String[] args) {
    
        //Create WebDriver instance
        WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get(" https://www.training-support.net/selenium/popups");

        //Print title of the page
        System.out.println("Title of the page is: " + driver.getTitle());
        driver.findElement(By.xpath(" //button[contains(@class, 'orange')]")).click();
     
        driver.findElement(By.name("Username")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("password");
        
        driver.findElement(By.xpath("//div[@id='dynamic-attributes-form']/div/button[@type='submit' and @class='ui green button']")).click();

        String text=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(text);
        //Close browser
        driver.close();
    }
}