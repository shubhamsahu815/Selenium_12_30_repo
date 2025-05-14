package datadriventesting1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDatafromproperty {
public static void main(String[] args) throws IOException {
	//step1:create FileInput object
	FileInputStream fis=new FileInputStream("./TestData/commandata.properties");
	
	//step2:create respective file type object
	Properties prop= new Properties();
	
	//step3:call read metods
	prop.load(fis);
	String URL = prop.getProperty("url");
	String Email = prop.getProperty("email");
	String Password = prop.getProperty("password");
	System.out.println(URL);
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(URL);
	
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).click();
	driver.findElement(By.id("Password")).sendKeys(Password);
}
}
