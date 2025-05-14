package popup1;

import java.time.Duration;
import java.util.Set;

import org.bouncycastle.oer.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandleswictchTochildwindow {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://shoppersstack.com/products_page/23");
	
	driver.findElement(By.id("compare")).click();
	switchtowindow(driver, "amazon");
	driver.manage().window().maximize();
	switchtowindow(driver,"ebay");
	driver.manage().window().maximize();
	
}

  public static void switchtowindow(WebDriver driver,String expUrl) {
	  Set<String> allwindowids = driver.getWindowHandles();
	  for(String id:allwindowids) {
		  driver.switchTo().window(id);
		  String acturl = driver.getCurrentUrl();
		  if(acturl.contains(expUrl)) {
			  break;
		  }
		  
	  }
	  
  }
}
