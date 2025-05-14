package mulTiselectlistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectlistbox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.w3schools.com/tags/att_select_autofocus.asp");
	WebElement cars = driver.findElement(By.id("cars"));
	Select carsSel=new Select(cars );
	//carsSel.selectByIndex(0);
	//carsSel.selectByValue(null);
	// carsSel.selectByVisibleText("Volvo");
	
	Thread.sleep(2000);
	carsSel.deselectAll();
	
}
}
