package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tohandleHiddenDivisionpopup {
public static void main(String[] args) throws Exception 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
	
	driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
	while(true) {
	try {
		
	} catch (Exception e) {
		// TODO: handle excedriver.findElement(By.xpath("//div[text()='June 2025']/../..//p[text()='27']")).click();
		break;
	}  {
	driver.findElement(By.xpath("//div[text()='June 2025']/../..//p[text()='27']")).click();
	break;
}catch(Exception e) {
	driver.findElement(By.xpath("//span [@aria-label='Previous Month']")).click();
} 
	}
}

