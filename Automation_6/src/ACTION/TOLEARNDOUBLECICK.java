package ACTION;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOLEARNDOUBLECICK {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
	WebElement addICon=driver.findElement(By.id(""));
	
	Action act=new Action(driver);
	Thred.sleep(2000);
	act.doubleclick(addIcon).perform();
}
}
