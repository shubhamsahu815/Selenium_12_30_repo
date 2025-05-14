package testng1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscript3 extends Baseclass{
	@Test
	public void clickOnElectronics() {
		driver.findElement(By.partialLinkText("Electronics")).click();
		if(driver.getTitle().equals("Demo Web Shop. Electronics")) {
		Reporter.log("Electronics page displayed",true);
		}
		else {
			Reporter.log("Electronics page is not displayed",true);
		}
	}
}
