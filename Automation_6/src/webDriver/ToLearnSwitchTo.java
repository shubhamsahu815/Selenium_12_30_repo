package webDriver;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLearnSwitchTo {


public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.shoppersstack.com/products_page/23 ");
	Thread.sleep(15000);
	driver.findElement(By.id("compare")).click();
	
	 Set<String> allwindowids = driver.getWindowHandles();
	for(String id:allwindowids) {
		driver.switchTo().window(id);
	
	 String url=driver.getCurrentUrl();
	 if(url.contains("flipkart")) {
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());
	 }
	}	
}
}
