package testng1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class Baseclass11
{
	public static WebDriver driver;
	FileUtility fu=new FileUtility();
 public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./TestData/untitled spreadsheet.xlsx");
	
	Workbook wb=WorkbookFactory.create(fis);
	String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(url);
	String email = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	System.out.println(email);
	String Password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	System.out.println(Password);
 }
 
	@BeforeClass
	public void openbrowser(){
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
 } 
	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
	}
}
