package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic class for data driven testing
 * @author bheem
 */
public class FileLib {
/**
 * This is a generic method for reading data from property file
 * @paramb key
 * @return string
 * @throws Ioexception
 */
	public String getPropertyData(String key) throws IOException 
	
	
	{
    
		FileInputStream fis = new FileInputStream("./data/commandatafile.property");
		Properties p =  new  Properties();
		p.load(fis);
		    String data = p.getProperty(key);
		return data;
	}
	/**
	 * This i a generic method for reading data from excel file
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelFile(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
		}
	
      public void setExcelData(String sheetName,int row,int cell,String data) throws EncryptedDocumentException, IOException
      {
    	  FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
    	 Workbook wb = WorkbookFactory.create(fis);
    	 wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
    	 FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
    	 wb.write(fos);
    	 wb.close();
    	 
      }
      
}
