package bheem;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticalWithoutDublicate {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/FOOD.html");
        WebElement mtrlistbox = driver.findElement(By.id("mtr"));
       
           Select s = new Select(mtrlistbox);
	     List<WebElement> alloptions = s.getOptions();
	   
	   Set<String> set = new TreeSet<String>();
	   
	   for(int i =0;i<alloptions.size();i++ )
	   {
		      WebElement ele = alloptions.get(i);
		      String text = ele.getText();
		      set.add(text);
	   }
	   for(String  String :set)
	   {
		   System.out.println(String);
	   }
	
	}
	

}
