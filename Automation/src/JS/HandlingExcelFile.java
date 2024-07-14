package JS;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript1.xlsx");
			Workbook wb = WorkbookFactory.create(fis); 
		 int rowcount = wb.getSheet("login page").getLastRowNum();
		
          for(int i = 1;i<=rowcount; i++)
          { 
        	  String un = wb.getSheet("login page").getRow(i).getCell(0).getStringCellValue(); 
        	  String pw = wb.getSheet("login page").getRow(i).getCell(1).getStringCellValue();
        	  String emid = wb.getSheet("login page").getRow(i).getCell(2).getStringCellValue();
        	  System.out.println(un+"  "+pw+"  "+emid);
          }
          
	}

}
