package pom1;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stalement1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.myntra.com/");
	
	Myntrapage mp= new Myntrapage(driver);
	mp.getSearchTF();
	
	mp.getSearchTF().sendKeys("shoes",Keys.ENTER);
	mp.getSearchTF().sendKeys("watch",Keys.ENTER);
}
}  
