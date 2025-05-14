package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowpopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.shoppersstack.com/products_page/24");
	driver.findElement(By.id("compare")).click();
	
    	Set<String>allwindowIds=driver.getWindowHandles();
    	
    	for(String id:allwindowIds) {
    		driver.switchTo().window(id);
    		String url=driver.getCurrentUrl();
    		if(url.contains("flipkart")) {
    			break;
    		}
    	}
    	driver.manage().window().maximize(); 
}
}
