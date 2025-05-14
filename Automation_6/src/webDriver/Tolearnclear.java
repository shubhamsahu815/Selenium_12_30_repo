package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnclear {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("");
	WebElement userNameTF= driver.findElement(By.id("username"));
	userNameTF.clear();
	Thread.sleep(2000);
	userNameTF.sendKeys( );
}
}
