package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentXpath {   
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc12@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc12");
	driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
	driver.findElement(By.xpath("//input[@name='login']")).click();
	
	}

}
