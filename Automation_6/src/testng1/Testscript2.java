package testng1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscript2 extends Baseclass {
	@Test
	public void clickOncomputers() {
		driver.findElement(By.partialLinkText("Computers")).click();
		if(driver.getTitle().equals("Demo Web Shop. Computers")) {
		Reporter.log("computers page displayed",true);
		}
		else {
			Reporter.log("computers page is not displayed",true);
		}
	}
}
