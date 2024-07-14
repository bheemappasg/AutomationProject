package JS;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript1.xlsx");
		Workbook wb = WorkbookFactory.create(fis); 
		
	  
		  Sheet s = wb.getSheet("login page");
			Row r = s.getRow(4);
		   Cell c = r.getCell(1);
      String data = c.getStringCellValue();
	//String d = wb.getSheet("login page").getRow(0).getCell(1).getStringCellValue();	         
	     System.out.println(data);
	     //System.out.println(d);

	}

}
