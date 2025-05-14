package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asssample {
  @Test(priority=1)
       public void createaccount() {
	  Reporter.log("Account is created",true);
	  
  }
  
  
  @Test(priority=3)
  public void deleteaccount() {
	  Reporter.log("Account is deleted",true);
  }
  @Test(priority=2)
  public void editaccount() {
	  Reporter.log("Account is edited",true);
  }
}
