package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsageofGetAtt {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new FirefoxDriver();
     Thread.sleep(4000);
     driver.get("https://www.facebook.com/");
     Thread.sleep(4000);
    WebElement link = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
    Thread.sleep(4000);
    String value = link.getAttribute("href");
     
    		 System.out.println(value);

	}

}
