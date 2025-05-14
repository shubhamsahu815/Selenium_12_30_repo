package webdriver1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturesize {

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/men-tshirts");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	driver.manage().window().setSize(new Dimension(400,300));
	     driver.manage().window().setPosition(new Point(350,250));
	     Dimension size = driver.manage().window().getSize();
	     System.out.println(size);
	     driver.close();
}
}
