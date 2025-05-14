package mulTiselectlistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectfirst {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://selectcars.in/");
	WebElement cars = driver.findElement(By.id(""));
	Select carSel=new Select(cars);
	carSel.selectByIndex(1);
	carSel.selectByIndex(2);
	carSel.selectByIndex(3);
	
	WebElement firstSelectedoption = carSel.getFirstSelectedOption();
	System.out.println(firstSelectedoption.getText());
}
}
