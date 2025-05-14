package locator;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo3 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.linkText("Facebook")).click();
	 
	   Set<String> allwindowid = driver.getWindowHandles();
	   
	 for(String id:allwindowid) {
		 driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.contains("facebook")) {
			driver.switchTo().window(id);
		}
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
	 } 
	
}
}
