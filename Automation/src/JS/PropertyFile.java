package JS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
                
public class PropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\commandatafile.property");
        Properties p = new Properties();
        p.load(fis);
      String url = p.getProperty("url");
      String un = p.getProperty("username");
      String pw = p.getProperty("password");
      WebDriver driver = new ChromeDriver();
      driver.get("https://demo.actitime.com/login.do");
      Thread.sleep(3000);
      driver.findElement(By.id("username")).sendKeys("admin");
      Thread.sleep(3000);
      driver.findElement(By.name("pwd")).sendKeys("manager");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//div[text()='Login ']")).click();
      
      
	}

}
