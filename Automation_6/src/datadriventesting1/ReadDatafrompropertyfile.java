package datadriventesting1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDatafrompropertyfile {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./TestData/commonDataproperties1") ;
	Properties prop=new Properties();
	prop.load(fis);
	String URL = prop.getProperty("url");
	String Username = prop.getProperty("username");
	String Password = prop.getProperty("password");
	System.out.println(URL);
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(URL);
	driver.findElement(By.id("user-name")).sendKeys(Username);
	driver.findElement(By.id("password")).sendKeys(Password);
	driver.findElement(By.id("login-button")).click();
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/webpage.png");
	org.openqa.selenium.io.FileHandler.copy(temp, dest);
	
	
}
}
