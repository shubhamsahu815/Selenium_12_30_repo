package mulTiselectlistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assselectlistbox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	WebElement day = driver.findElement(By.id("day"));
	Select daysel=new Select(day);
	daysel.selectByValue("31");
	
	WebElement month = driver.findElement(By.id("month"));
	Select monthSel=new Select(month);
	monthSel.selectByValue("12");
	
	WebElement year = driver.findElement(By.id("year"));
	Select yearSel=new Select(year);
	yearSel.selectByValue("1905");
}
}
