package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearngetText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	String errorMsg=driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
	System.out.println(errorMsg.css
	System.out.println(errorMsg.getCssv("fontfamily"));
}
}
