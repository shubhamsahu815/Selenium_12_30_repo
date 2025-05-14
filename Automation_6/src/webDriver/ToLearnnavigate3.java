package webDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnnavigate3 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.navigate().to(new URL("https://demowebshop.tricentis.com/"));
	  Thread.sleep(2000);
	  driver.navigate().back();
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Facebook")).click();
	  Set<String> windowid = driver.getWindowHandles();
	  System.out.println(windowid);
	  Thread.sleep(2000);
	  driver.close(); 
}
}
