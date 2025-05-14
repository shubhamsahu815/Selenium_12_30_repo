package datadriventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.SkillraryPage;

public class ToLearnStable {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapp.skillrary.com/");
	SkillraryPage sp=new SkillraryPage(driver);
	sp.getSearchTextField().sendKeys("Selenium",Keys.ENTER);
	//WebElement SearchTF= driver.findElement(By.id("navbar-search-input"));
	
	//SearchTF.sendKeys(args);
	Thread.sleep(2000);
	sp.getSearchTextField().sendKeys("TestNG");
}
}
