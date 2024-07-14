package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFlipKart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
			driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.Enter);
			driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')];
	}

}
