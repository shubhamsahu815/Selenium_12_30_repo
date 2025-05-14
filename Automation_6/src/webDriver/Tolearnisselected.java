package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnisselected {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	WebElement goodRadioBtn=driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
	System.out.println(goodRadioBtn.isSelected());
	goodRadioBtn.click();
	System.out.println(goodRadioBtn.isSelected());
}
}
