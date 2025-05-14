package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnclassName {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	
	driver.findElement(By.className("email")).sendKeys("sam.1887@gmail.com");
	driver.findElement(By.className("password")).sendKeys("sam479@");
}
}
