package action1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tolearndraganddrop {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(frame);
	    WebElement img1 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	    WebElement trash = driver.findElement(By.id("trash"));
	    
	    Actions act=new Actions(driver);
	    act.dragAndDrop(img1, trash).perform();
}
}
