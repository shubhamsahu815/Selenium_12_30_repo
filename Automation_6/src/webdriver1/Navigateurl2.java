package webdriver1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateurl2 {
public static void main(String[] args) throws InterruptedException, MalformedURLException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.navigate().to("https://shoppersstack.com/products_page/23");
	driver.navigate().to(new URL("https://shoppersstack.com/products_page/23"));
	Thread.sleep(20000);
	driver.navigate().back();
	Thread.sleep(20000);
	driver.navigate().forward();
	Thread.sleep(20000);
	driver.navigate().refresh();
}
}
