package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethods {
	@Test
	public void register() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("register testcase executed",true);
		
	}
	
	@Test(dependsOnMethods="register")
	public void login() {// testcase
		//test steps
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login test case executed",true); 
}
}