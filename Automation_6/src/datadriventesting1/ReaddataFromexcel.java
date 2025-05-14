package datadriventesting1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReaddataFromexcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new FileInputStream("./TestData/TestScriptData.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	
	String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(url);
	        
	String email = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();//string data
	System.out.println(email);
	
	double price = wb.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();//number data
	System.out.println(price );
	
	boolean status = wb.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();//booleandata
	System.out.println( status );
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
	
	driver.get(url);
}
}
