package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles1 {
public static void main(String[] args)throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://www.shoppersstack.com/products_page/23");
	Thread.sleep(15000);
	driver.findElement(By.id("compare")).click();
	
	Set<String>allWindowIDSet=driver.getWindowHandles();
	System.out.println(allWindowIDSet);  
}
}
