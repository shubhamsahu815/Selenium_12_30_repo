package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnclear {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement usernametextfield = driver.findElement(By.id("username"));
	usernametextfield.clear();
	usernametextfield.sendKeys("shubham");
}
}
