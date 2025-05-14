package pom1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	
	Welcomepage wp=new Welcomepage(driver);
	wp.getLoginLink().click();
	
	Loginpage lp=new Loginpage(driver);
	lp.getEmailTextField().sendKeys("abhis1234@gmail.com");
	lp.getPasswordTextField().sendKeys("abhis@1234");
	lp.getLoginButton().click(); 
	
}
}
