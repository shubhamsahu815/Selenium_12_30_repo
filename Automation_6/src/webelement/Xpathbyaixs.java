package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyaixs {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/shubham/Desktop/sample.html");
	String collection = driver.findElement(By.xpath("//td[text()='puspa']/follwing-sibling: :td[2]")).getText();
	System.out.println(collection);
	String position = driver.findElement(By.xpath("")).getText();
	System.out.println(position );
}
}
