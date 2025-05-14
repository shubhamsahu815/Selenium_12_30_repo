package webdriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnswitchTo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://shoppersstack.com/products_page/23");
	Thread.sleep(20000);
	
	driver.findElement(By.id("compare")).click();
	
	   String Title = driver.getTitle();
	   System.out.println(Title);
	   
	   Set<String> allwindowid = driver.getWindowHandles();
	   
	   for(String id:allwindowid) {
		   System.out.println(id);
		   driver.switchTo().window(id);
		   Thread.sleep(10000);
		   
		     
			  
		childwindowHandles=driver.switchTo().window(childwindowHandles);
		   
		   String actUrl = driver.getCurrentUrl();
		   if(actUrl.equals("https://www.flipkart.com/")) {
			   Dimension size = driver.manage().window().getSize();
			   
			   System.out.println(size);
			   driver.manage().window().maximize();
		   }
		   
			   
		   
	   }
	
}
}
