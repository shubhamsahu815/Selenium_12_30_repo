package mulTiselectlistbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learnselectoption {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("");
	WebElement cars = driver.findElement(By.id(""));
	Select CarSel=new Select(cars);
	CarSel.selectByIndex(2);
	CarSel.selectByIndex(0);
	CarSel.selectByIndex(1);
	
	List<WebElement> allselectedoptions = CarSel.getAllSelectedOptions();
	System.out.println(allselectedoptions.size());
	
	for(WebElement ele:allselectedoptions) {
		System.out.println(ele.getText());
	}
	
}
}
