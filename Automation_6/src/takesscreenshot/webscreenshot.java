package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webscreenshot {
public static void main(String[] args) throws IOException {
	String timestamp = LocalDate.now().toString().replace(":", "-");
	System.out.println(timestamp);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
  TakesScreenshot ts = (TakesScreenshot)driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
     File dest=new File("./screenshot/"+timestamp+".png");
	FileHandler.copy(temp, dest);
	
	
}
}
