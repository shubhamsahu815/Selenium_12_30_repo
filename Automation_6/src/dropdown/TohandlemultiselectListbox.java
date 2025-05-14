package dropdown;

import java.time.Duration;
import java.time.Month;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TohandlemultiselectListbox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	WebElement pricelistbox=driver.findElement(By.id("month"));
	
	Select monthSelect=new Select(pricelistbox);
	List<WebElement> allmonths = monthSelect.getOptions();
	System.out.println(allmonths.size());
	
	WebElement yearListbox = driver.findElement(By.id("year"));
	Select yearSelect=new Select(yearListbox);
	List<WebElement> allyear = yearSelect.getOptions();
	System.out.println(allyear.size());
	
	
}
}
