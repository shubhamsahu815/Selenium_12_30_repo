package webDriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPartiallinkText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize(); 
	
	driver.get("https://demowebshop.tricentis.com/");
	//driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
	driver.findElement(By.linkText("Books")).click();
}
}
