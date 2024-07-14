package bheem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/FOOD.html");
           WebElement mtrlistbox = driver.findElement(By.id("mtr"));
	     Select s = new Select(mtrlistbox);
	     ArrayList<String> all = new ArrayList<String>();
	   List<WebElement> alloptions = s.getOptions();
	   for(int i =0;i<alloptions.size();i++ )
	   {
		      
		     String text = alloptions.get(i).getText();
		      all.add(text);
	   }
	   for(int i = 0;i<all.size();i++)
	   {
		 String options = all.get(i);
		 System.out.println(options);
	}
	   driver.quit();

}}
