package pom;

import java.security.PrivateKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryPage {
@FindBy(id ="navbar-search-input")
private WebElement searchTextField;

public SkillraryPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getSearchTextField() {
	return searchTextField;
}
   
}
