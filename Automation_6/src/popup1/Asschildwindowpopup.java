package popup1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asschildwindowpopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	switchToWindow(driver,"signup");
	driver.findElement(By.id("email")).sendKeys("sam.1997420@gmail.com");
	switchToWindow(driver,"login");
	driver.findElement(By.id("password")).sendKeys("sam1460@");
}
	
	
	public static void switchToWindow(WebDriver driver,String expUrl) {
	  Set<String> allwindowids = driver.getWindowHandles();
	  
	  for(String id:allwindowids ) {
		  driver.switchTo().window(id);
		String acturl = driver.getCurrentUrl();
		if(acturl.contains(expUrl)) {
			
		}
	  }
	
			
}
}
