package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnxpath122 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Facebook")).click();
	String currentWindowHandle = driver.getWindowHandle();
	for(String WindowHandle:driver.getWindowHandles()) {
		if(!WindowHandle.equals(currentWindowHandle)) {
			driver.switchTo().window(WindowHandle);
			break;
		}
	}
	driver.findElement(By.xpath("//span[text()='Create new account']")).click();
	 
	 
	 
	 }
}

