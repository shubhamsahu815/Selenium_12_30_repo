package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnxpath1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sam123@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("sam123@");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
}
