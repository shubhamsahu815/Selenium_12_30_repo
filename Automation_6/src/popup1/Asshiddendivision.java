package popup1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asshiddendivision {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.freshersworld.com/");
	driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\shubham\\Documents\\2025 mp20.pdf");
}
}
