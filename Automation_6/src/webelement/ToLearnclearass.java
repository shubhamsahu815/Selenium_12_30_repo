package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnclearass {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement usernametextfield = driver.findElement(By.id("username"));
	Thread.sleep(2000);
	usernametextfield.clear();
	Thread.sleep(2000);
	
	usernametextfield.sendKeys("Selenium");
	
	WebElement usernamepassword = driver.findElement(By.id("password"));
	Thread.sleep(2000);
	usernamepassword.clear();
	Thread.sleep(2000);
	usernamepassword.sendKeys("Selenium@1234");
	driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	String errormsg = driver.findElement(By.xpath("//span[text()='Invalid credentials'][1]")).getText();
	System.out.println(errormsg);
	driver.close();
	
}
}
