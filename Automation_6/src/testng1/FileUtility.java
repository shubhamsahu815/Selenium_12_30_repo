package testng1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
   public void getDataFromExcel() throws EncryptedDocumentException, IOException {
	   FileInputStream fis =new FileInputStream("./TestData/commondata.properties");
	   Workbook wb = WorkbookFactory.create(fis);
	  String value = wb.getSheet("Sheetname1").getRow(1).getCell(1).getStringCellValue();
   }
}
