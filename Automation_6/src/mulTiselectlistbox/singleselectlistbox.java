package mulTiselectlistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselectlistbox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	
	WebElement day = driver.findElement(By.id("day"));
	Select daySel=new Select(day);
	daySel.selectByIndex(14);
	
	WebElement month = driver.findElement(By.id("month"));
	Select monthsel=new Select(month);
	monthsel.selectByValue("8");
	
	WebElement year = driver.findElement(By.id("year"));
	Select yearSel=new Select(year);
	yearSel.selectByVisibleText("1970");
	
	System.out.println(yearSel.isMultiple());
}
}
