package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetpageSource {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get(" https://www.flipkart.com/");
	driver.findElement(By.linkText("Flipkart    ")).click();
	driver.close();
	driver.quit();
}

}
