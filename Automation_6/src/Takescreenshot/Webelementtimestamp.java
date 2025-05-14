package Takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webelementtimestamp {
public static void main(String[] args) throws IOException {
	String timestamp = LocalDateTime.now().toString().replace(":","-");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
File temp = driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).getScreenshotAs(OutputType.FILE);
    File dest = new File("./screenshot/"+timestamp+"elementImage.png");
    FileHandler.copy(temp, dest);
	
	
}
}
