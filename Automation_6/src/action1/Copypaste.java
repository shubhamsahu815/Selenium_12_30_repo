package action1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copypaste {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement firstnameTF = driver.findElement(By.id("FirstName"));
	Actions act=new Actions(driver);
	act.sendKeys(firstnameTF,"shubham").perform();
	
	act.keyDown(Keys.CONTROL).keyDown("a").perform();
}
}
