package testng1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configurationannotation {

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("@BeforeSuite",true);
	}
	@BeforeTest
	public void beforeTest(){
		Reporter.log("@BeforeTest",true);
	}
	@BeforeClass
	public void beforeclass() {
		Reporter.log("@BeforeClass",true);
	}
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("@BeforeMethod",true);
	}
	@Test
	  public void demo() {
		Reporter.log("@Test(demo)executed",true);
   
    }
	@AfterMethod
	public void aftermethod() {
		Reporter.log("@TestAftermethod",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("AfterTest",true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("Afterclass",true);
	}
		
	
	@AfterSuite
	  public void afterSuite(){
		Reporter.log("@AfterSuite",true);
	}
}
