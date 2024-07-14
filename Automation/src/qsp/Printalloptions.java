package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printalloptions {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/FOOD.html");
		
		 WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		 
      Select s = new Select(mtrlistbox);
               List<WebElement> alloptions = s.getOptions();
                
             
                 
                for(int i =0;i<alloptions.size();i++)
                {
                	String text = alloptions.get(i).getText();
                	System.out.println(text);
                }
                driver.quit();
	}

}
