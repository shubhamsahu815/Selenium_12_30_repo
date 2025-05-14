package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ToLearnfluentwait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[contains(text(),'inch Laptop')]")).click();
	 WebElement addtocart = driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button')]"));
	FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver);
	fwait.withTimeout(Duration.ofSeconds(20));
	fwait.pollingEvery(Duration.ofMillis(200));
	fwait.until(ExpectedConditions.elementToBeClickable(addtocart));
	
}
}
