package testng1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import takesscreenshot.Takescreenshot;

public class ListenerImplementation12 extends BaseClass1 implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test script is pass",true);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		//String time = LocalDateTime.now().toString().replace(":", "-");
		Reporter.log("Test script is failed",true);
		Takescreenshot ts=(Takescreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/lis.png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
    
}
