package listenner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
 @Listeners(Listenerimplementation.class)
public class Testscript extends Baseclass {
	@Test
	public void login() {
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abhis12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhi@2345");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Home page is not displayed");
		Reporter.log("Home pager is displayed",true);
	}

}
