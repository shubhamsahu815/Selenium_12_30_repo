package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnbooleanmethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	
	WebElement customgender=driver.findElement(By.id("custom_gender"));
	System.out.println();
	
	driver.findElement(By.xpath("//label[text()='Custom']")).click();
	System.out.println(customgender.isDisplayed());
}
}
