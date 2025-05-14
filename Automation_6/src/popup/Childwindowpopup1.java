package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindowpopup1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(null);
	driver.findElement(By.id(null)).click();
	
	switchToWindow(driver,"flipkart");
	driver.manage().window().maximize();
	
	switchTo
}

private static void switchToWindow(WebDriver driver, String string) {
	// TODO Auto-generated method stub
	
}
}
