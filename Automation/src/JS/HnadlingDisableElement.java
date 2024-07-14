package JS;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HnadlingDisableElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();   //up casting
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/HDE.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		
		RemoteWebDriver r =(RemoteWebDriver) driver;   //down casting
		r.executeScript("documet.getEelemetById('d2').value='manager'");

	}

}
