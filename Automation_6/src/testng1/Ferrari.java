package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ferrari {
@Test(groups="smoke")
 public void lanuch() {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.wired.com/story/ferraris-latest-goes-211-mph-986-hp-hybrid/");
	Reporter.log("ferrari launched",true);
}
}
