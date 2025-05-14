package testng1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listenerimplementation1.class)
public class Testscript11 extends BaseClass1 {
@Test
public void login() {
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("abhis12@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("abhi@1234");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	Assert.assertEquals(driver.getTitle(),"","Home page is not displayed");
	Reporter.log("Home page is displayed",true);
}
}
