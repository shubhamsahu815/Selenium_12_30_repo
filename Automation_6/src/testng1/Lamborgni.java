package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lamborgni {
	@Test(groups="Regresion")
	 public void lanuch() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.maserati.com/in/en/models/");
		Reporter.log("lamborgni launched",true);
}
}