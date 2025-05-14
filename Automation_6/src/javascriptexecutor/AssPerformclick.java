package javascriptexecutor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssPerformclick {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement Login = driver.findElement(By.linkText("Log in"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()",Login);
	
	WebElement email = driver.findElement(By.id("Email"));
	js.executeScript("arguments[0].value='abhis1234@gmail.com'", email);
	WebElement password = driver.findElement(By.id("Password"));
	js.executeScript("arguments[0].value='abhis@1234'", password);
	WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
	js.executeScript("arguments[0].click()", login);
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshots/image.png");
	FileHandler.copy(temp, dest);
	
}
}
