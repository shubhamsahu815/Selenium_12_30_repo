package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpagesscreenshot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp= ts.getScreenshotAs(OutputType.FILE);
	System.out.println(temp);
	File dest=new File("./screenshot/webpage.png");
	org.openqa.selenium.io.FileHandler.copy(temp, dest);
	
}
}
