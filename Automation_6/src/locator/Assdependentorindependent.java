package locator;




	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Assdependentorindependent {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//div[text()='Free delivery'])[1]")).click();
           Set<String> ids = driver.getWindowHandles();
		for(String id:ids) {
			driver.switchTo().window(id);
			
			}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Compare']")).click();
		
			
			
		}
		
	}



