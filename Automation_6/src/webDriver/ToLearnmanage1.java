package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnmanage1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.manage().window().minimize();
	Thread.sleep(1000); 
	driver.manage().window().fullscreen(); 
}
}
