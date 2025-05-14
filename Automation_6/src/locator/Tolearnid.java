package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnid {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login");
	driver.findElement(By.id("email")).sendKeys("abcdef123454@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("abhi@1234");
	driver.findElement(By.id("loginbutton")).click();
}
}
