package bheem;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFileAndLoginActitime {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		// get last row number where the data is present
		int rowcount = wb.getSheet("create customer").getLastRowNum();
		for(int i=1;i<= rowcount;i++) {
		String un =
		wb.getSheet("create customer").getRow(i).getCell(0).getStringCellValue();
		String pw =
		wb.getSheet("create customer").getRow(i).getCell(1).getStringCellValue();
		System.out.println(un+ "---->"+ pw);
		}
		}
		


	}

}
