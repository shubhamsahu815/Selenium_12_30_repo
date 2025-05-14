package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {

	@BeforeSuite
	public void beforesuite() {
		Reporter.log("@BeforeSuite",true);
	}
	
	@Test
	public void demo() {
		Reporter.log("demo test case executed",true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("@AfterSuite",true);
	}
	
}
