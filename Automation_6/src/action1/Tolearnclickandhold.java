package action1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tolearnclickandhold {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
	driver.findElement(By.id("password")).sendKeys("test@212345");
	WebElement eyecon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
	Actions act=new Actions(driver);
	//act.clickAndHold(eyecon).perform();
	act.clickAndHold(eyecon).pause(2000).release().perform();   
}
}
