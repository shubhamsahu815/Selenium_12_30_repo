package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscript extends Baseclass {
 @Test
 public void clickOnBooks() {
	 driver.findElement(By.partialLinkText("Books")).click();
	 if(driver.getTitle().equals("Demo Web Shop. Books")) {
		 Reporter.log("User navigated to Books page",true);
		 
	 }else {
		 Reporter.log("User failed to navigate to the Books",true);
	 }
 }
 @Test
 public void clickOncomputer() {
	 driver.findElement(By.partialLinkText("Computers")).click();
	 if(driver.getTitle().equals("Demo Web Shop. Computers")) {
		 Reporter.log("User navigated to computers page",true);
	 }else {
		 Reporter.log("User failed to navigate to the computer",true);
	 }
 }
 
}
