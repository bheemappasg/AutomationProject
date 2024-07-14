package bheem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAutosuggetion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("samsung phone");
		Thread.sleep(2000);
		List<WebElement> all  =driver.findElements(By.xpath("//span[contains(text(),'java')]"));
			int count = all.size();
			System.out.println(count);
			for (int i = 0;i<count;i++)
			{
			         	  
	   String	text = all.get(i).getText();
	       
	    System.out.println(text);
			}
			all.get(count-1).click();
		
			/*for(WebElement wb:all)
			{
				 String text = wb.getText();
				 System.out.println(text);
			}
				all.get(count-1).click();*/
		driver.quit();


	}

}
