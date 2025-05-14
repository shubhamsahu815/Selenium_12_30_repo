package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyaixs1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get(null);
	
	String movie = "puspa";
	String collection = driver.findElement(By.xpath("//td[text()='"+movie+"']/follwing-sibling: :td[2]")).getText();
	System.out.println(collection);
}
}
