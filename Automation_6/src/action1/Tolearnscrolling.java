package action1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tolearnscrolling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.redbus.in/");
	WebElement busticket = driver.findElement(By.xpath("//h2[text()='BOOK BUS TICKETS ONLINE']"));
	Actions act=new Actions(driver);
	//act.scrollToElement(busticket).perform();
	Thread.sleep(2000);
	act.scrollByAmount(0, 1500).perform();
	act.scrollByAmount(1200, 0).perform();  
}
}
