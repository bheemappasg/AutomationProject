package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptions {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/FOOD.html");
             WebElement mtrlistbox = driver.findElement(By.id("mtr"));
              Select s = new Select(mtrlistbox);
                 List<WebElement> alloptions = s.getOptions();
                int count= alloptions.size();
                System.out.println(count);
                for(int i= 0;i<count;i++)
                {
                	Thread.sleep(2000);
                 s.selectByIndex(i);
                /* String text = alloptions.get(i).getText();
                 
                 System.out.println(text);*/
                }
                 for(int i =count-1;i>=0;i--)
                 {
                   Thread.sleep(1000);
                	s.deselectByIndex(i); 
                 
                }
                
              driver.quit();
	}

	
}
