package action1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asstolearnrightclick {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	driver.findElement(By.linkText("Right Click")).click();
	  WebElement rightele = driver.findElement(By.xpath("//button[text()='Right Click']"));
	  Actions act= new Actions(driver);
	  act.contextClick(rightele).perform();
	  driver.findElement(By.xpath("//div[text()='Yes']")).click();
	  String color = driver.findElement(By.xpath("//button[text()='Right Click']")).getCssValue("color");
	  System.out.println(color);
}
}
