package popup1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnhiddendivisionpopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.abhibus.com/");
	driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
	
	int count=0;
	while(true)
	{
		try {
			driver.findElement(By.xpath("//span[text()='June']/../../..//span[text()='16']")).click();
			break;
		}
		catch(Exception e) {
			if(count==0) {
				driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
				count++; 
			}
			else {
				driver.findElement(By.xpath("(//span[@class='calender-month-change'])[2]")).click();
			}
		}
	}
}
}
