package testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class BaseClass1 {
      public static WebDriver driver;
      
      @BeforeClass
      public void openBrowser() {
    	  driver=new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	  
    	  driver.get("https://demowebshop.tricentis.com/");
      }

	public void onTestskipped(ITestResult result) {
		Reporter.log("Test case is skipped",true);
		
	}
}
