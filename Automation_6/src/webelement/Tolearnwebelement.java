package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnwebelement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();  
	
	driver.get("https://www.instagram.com/");
	String phonetext = driver.findElement(By.xpath("//span[contains(text(),'Phone number')]")).getText();
	System.out.println(phonetext);
	Rectangle Rect = driver.findElement(By.xpath("//div[text()='Log in']")).getRect();
	System.out.println(Rect.getHeight());
	System.out.println(Rect.getWidth());
	System.out.println(Rect.getX());
	System.out.println(Rect.getY());
	String color = driver.findElement(By.xpath("//div[text()='Log in with Facebook']")).getCssValue("color");
	System.out.println(color);
}
}
