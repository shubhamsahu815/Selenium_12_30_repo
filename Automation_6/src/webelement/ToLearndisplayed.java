package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearndisplayed {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	     WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
	    System.out.println(loginbtn.isDisplayed());
	    System.out.println(loginbtn.isEnabled());
}
}
