package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearncssselector {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();    
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.cssSelector("input[type='text']")).click();
}
}
