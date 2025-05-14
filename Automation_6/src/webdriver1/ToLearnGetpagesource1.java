package webdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetpagesource1 {
public static void main(String[] args) {
WebDriver driver=new EdgeDriver();
	
	driver.get("https://www.redbus.in/");
	String sourceCode = driver.getPageSource();
	System.out.println(sourceCode);
    driver.close();
}
}
