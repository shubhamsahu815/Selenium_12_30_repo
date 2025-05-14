package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
      
	public WebDriver driver;
	
	@BeforeClass
	public  void openBrowser() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abhis123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhi@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterClass
	public void closeBrower() {
		driver.quit();
	}
}
