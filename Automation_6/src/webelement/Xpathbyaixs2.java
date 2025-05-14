package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyaixs2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//section[text()='Web Table']")).click();
	Thread.sleep(5000);
	String Discount = driver.findElement(By.xpath("//th[text()='SAMSUNG Galaxy']/following-sibling::td[3 ]")).getText();
	System.out.println(Discount );
}
}
