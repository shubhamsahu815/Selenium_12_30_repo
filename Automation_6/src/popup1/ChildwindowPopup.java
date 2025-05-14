package popup1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwindowPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://shoppersstack.com/products_page/23");
	
	driver.findElement(By.id("compare")).click(); 
	
	Set<String> allwindowids = driver.getWindowHandles();//capture all window ids
	
	for(String id:allwindowids) {
		driver.switchTo().window(id);//switch to any window
		String url = driver.getCurrentUrl();
		if(url.contains("amazon")) {
			break;
		}
	}
	driver.manage().window().maximize();
}
}
