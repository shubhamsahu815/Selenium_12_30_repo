package locator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnxpath11 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.linkText("Facebook")).click();
	
	 Set<String> allwindowids = driver.getWindowHandles();
	for(String id:allwindowids) {
		driver.switchTo().window(id);
		String Url = driver.getCurrentUrl();
		if(Url.contains("Facebook")) {
		
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[text()='Create new account']")).click();	
		}
		
	}
}
}
