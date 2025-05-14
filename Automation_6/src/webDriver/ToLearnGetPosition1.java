package webDriver;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition1 {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://www.amazon.in/");
	org.openqa.selenium.Point position= driver.manage().window().getPosition();
	
	System.out.println(position);
	System.out.println(position.getX());
	System.out.println(position.getY());
}
}
