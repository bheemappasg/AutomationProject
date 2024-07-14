import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.actitime.generic.FileLib;

public class LoginActitimeGenericLib {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		FileLib f = new FileLib();
		
        driver.get(f.getPropertyData("url"));
        Thread.sleep(2000);
        
        driver.findElement(By.id("username")).sendKeys(f.getPropertyData("username"));
        Thread.sleep(3000);
        
        driver.findElement(By.name("pwd")).sendKeys(f.getPropertyData("password"));
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
        // Thread.sleep(4000);
        driver.quit();
	}

}
