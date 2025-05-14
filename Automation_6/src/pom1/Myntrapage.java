package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntrapage {
@FindBy(xpath="//input[contains(@placeholder,'Search for products')]")
private WebElement searchTF;

public Myntrapage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}

public WebElement getSearchTF() {
	return searchTF;
}
   
    

}
