package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectListbox {


public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.facebook.com/reg");
	WebElement monthdropdown=driver.findElement(By.id("Month"));
	Select monthselect=new Select(monthdropdown);
	//monthselect.deselectByIndex(5);
	//monthselect.selectByValue("7");
	monthselect.selectByVisibleText("Jul");
}
}
