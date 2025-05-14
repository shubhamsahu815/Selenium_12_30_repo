package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toleranxpath33 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shubham123@");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sam1234@");
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	
}
}
