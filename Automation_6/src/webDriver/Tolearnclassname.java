package webDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnclassname {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get(" https://demowebshop.tricentis.com/login");
	driver.findElement(By.className("email")).sendKeys("sam.1997@gmail.com");
	
}
}
