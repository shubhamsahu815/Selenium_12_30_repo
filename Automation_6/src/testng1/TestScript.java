package testng1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends Baseclass {
@Test
public void clickOnbooks() {
	driver.findElement(By.partialLinkText("Books")).click();
	if(driver.getTitle().equals("Demo Web Shop. Books")) {
	Reporter.log("Books page displayed",true);
	}
	else {
		Reporter.log("Books page is not displayed",true);
	}
}
}
