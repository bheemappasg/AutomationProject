package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoFlipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		  driver.findElement(By.name("q")).sendKeys("dell");
		  Thread.sleep(5000);
		 
		  List<WebElement> all  =driver.findElements(By.xpath("//span[contains(text(),'dell')]"));
		  Thread.sleep(5000);
			 
		 int count = all.size();
		 System.out.println(count); 
		 for(int i=0;i<count;i++)
		 {
			 
			   String l  = all.get(i).getText();
			System.out.println(l);
		 }
        driver.quit();
	}

}