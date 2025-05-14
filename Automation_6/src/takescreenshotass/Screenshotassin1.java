package takescreenshotass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotassin1 {
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.abhibus.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='From Station']")).click();
	driver.findElement(By.xpath("//div[text()='Hyderabad']")).click();
	
	

	driver.findElement(By.xpath("//input[@placeholder='To Station']")).click();
	driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
	
	
	
	
	
	driver.findElement(By.xpath("//button[text()='Search']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
	driver.findElement(By.xpath("//span[text()='Tu']/..//span[@class=' selected']")).click();
	


	
}
}
