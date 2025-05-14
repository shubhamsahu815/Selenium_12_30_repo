package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	WebElement hiddenelement = driver.findElement(By.id("custom_gender"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeAsyncScript("arguments[0].value='goodafternoon!!!!'", hiddenelement);
}
}
