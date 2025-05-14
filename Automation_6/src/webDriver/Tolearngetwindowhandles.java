package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Tolearngetwindowhandles {
public static void main(String[] args) throws InterrupedExeception, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.shoppersstack.com/products_page/23");
	Thread.sleep(15000);
	driver.findElement(By.id("compare")).click();
	
	Set<String> allwindowIds = driver.getWindowHandles();
	System.out.println(allwindowIds);
	
	for(String id:  allwindowIds) {
		String url=driver.getCurrentUrl();
		if(url.contains("https://www.ebay.com/ ")) {
			driver.manage().window().maximize();//
			Point position = driver.manage().window().getPosition();
			System.out.println(position);
			
			driver.close();
			
			      
			{
			
		
			
			if(url.contains("https://www.flipkart.com/")) {
		    driver.manage().window().maximize();		
			Dimension size = driver.manage().window().getSize();
			System.out.println(size);
			driver.close();
			}
			}
			if(url.contains("https://www.amazon.in/")) {
				driver.close();
			}
			
			
		}
	}
}
}
