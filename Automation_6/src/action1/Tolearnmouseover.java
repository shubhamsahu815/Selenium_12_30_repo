package action1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tolearnmouseover {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.flipkart.com/");
	WebElement home = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	Actions act= new Actions(driver);
	//act.moveToElement(home).perform();
	act.moveByOffset(570, 172).perform();
}
}
