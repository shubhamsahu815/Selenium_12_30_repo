package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearn {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("shubham");
	driver.findElement(By.id("LastName")).sendKeys("sahu");
	driver.findElement(By.id("Email")).sendKeys("sam.1886@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("sam456");
	driver.findElement(By.name("ConfirmPassword")).sendKeys("sam456");
	driver.findElement(By.name("register-button")).click();
}
}
