package webdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCurrentUrl1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/men-blazers");
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	driver.quit();
}
}
