package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGet {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
	   String actTitle = driver.getTitle();
	   System.out.println(actTitle);
	   
	   if(actTitle.equals("Insta")) {
		   System.out.println("Home page is Display");
	   }else {
		   System.out.println("Home page is not Displayed");
		   
	   }
	   
	}

}
