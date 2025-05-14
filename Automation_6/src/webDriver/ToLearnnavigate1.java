package webDriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnnavigate1 {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws MalformedURLException, InterruptedException {
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  
  driver.navigate().to(new URL("https://www.instagram.com/"));
  Thread.sleep(2000);
  driver.navigate().back();
  Thread.sleep(2000);
  driver.navigate().forward();
  Thread.sleep(2000);
  driver.navigate().refresh();
}
}
