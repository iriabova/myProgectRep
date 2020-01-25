package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bdd.myProject.Base;

public class LoginPageObject extends Base {
	
	public LoginPageObject() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(how=How.XPATH, using="//a[text()= 'Test Environment']")
	private WebElement testEnvironmentLink;
	
	
	
	public void clickOnTestEnvironmentLink() {
		testEnvironmentLink.click();;
		
		/**
		 * This method will click on Login to class Link On Tek School page
		 */
	}
	
}
