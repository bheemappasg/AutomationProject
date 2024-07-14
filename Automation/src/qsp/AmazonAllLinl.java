package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAllLinl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement>L =driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
			int count = L.size();
			System.out.println(count);
			for (int i = 0;i<count;i++)
			{
			
				String text = L.get(i).getText();

	System.out.println(text);
	
			}
				
	

	}

}
