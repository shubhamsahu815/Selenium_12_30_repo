package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://petdiseasealerts.org/forecast-map/#/");
	WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
	driver.switchTo().frame(iframe);
	driver.findElement(By.name("Montana")).click();
	driver.switchTo().defaultContent();
}
}
