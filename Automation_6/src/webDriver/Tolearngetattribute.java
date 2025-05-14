package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearngetattribute {
@SuppressWarnings({ "null", "unused" })
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	String value=driver.findElement(By.name("q")).getAttribute("title");
	
	Object toolTip = null;
	System.err.println(toolTip);
	if(toolTip.equals("Search for product,Brands and More"))
	{
		System.out.println("Tool tip is present");
	}
	else {
		System.out.println("Tool tip is not present");
	}
	
	
}
}
