package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependendentorindependent2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	
	driver.findElement(By.xpath("//span[text()='Train Tickets']")).click();
	driver.findElement(By.xpath("//span[text()='Check PNR status']")).click();
	driver.findElement(By.xpath("(//button[text()='Show Availability'])[1]")).click();
	driver.manage().window().maximize();
	
}
}
