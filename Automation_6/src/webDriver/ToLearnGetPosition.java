package webDriver;

import java.awt.Point;

import javax.swing.text.Position;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");	
	org.openqa.selenium.Point Position = driver.manage().window().getPosition();
	System.out.println(Position);
	
	System.out.println(Position.getX());
	System.out.println(Position.getY());
	
	driver.manage().window().setPosition(new org.openqa.selenium.Point(200, 300));
	
}
}
