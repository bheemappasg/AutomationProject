package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoalloption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/FOOD.html");
		
		 WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		 
      Select s = new Select(mtrlistbox);
               List<WebElement> options = s.getOptions();
                
               List<String> optionTexts = new ArrayList<>();

   	        
   	        for (WebElement option : options) {
   	            optionTexts.add(option.getText());
   	   
   	        }

   	    
   	        Collections.sort(optionTexts);

   	        System.out.println("Options in alphabetical order:");
   	        for (String optionText : optionTexts) {
   	            System.out.println(optionText);
                 
               /* for(int i =0;i<alloptions.size();i++)
                {
                	String text = alloptions.get(i).getText();
                	System.out.println(text);*/
   	        }
                driver.quit();
	}

}
