package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Jenkins {
        @Test
        public void demo(){
        	WebDriver driver=new ChromeDriver();
        	driver.get("https://demowebshop.tricentis.com/");
               Reporter.log("sample case executed",true);	
        }
}
