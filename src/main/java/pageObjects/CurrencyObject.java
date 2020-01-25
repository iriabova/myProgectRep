package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bdd.myProject.Base;

public class CurrencyObject extends Base {
	
	public CurrencyObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using="//button[@class='btn btn-link dropdown-toggle']")
	private WebElement currencyButton;
	
	@FindBy(how=How.XPATH, using="//button[text()='€ Euro']")
	private WebElement optionsOfCurrency;
	
	@FindBy(how=How.XPATH, using="//a[text()='HTC Touch HD']")
	private WebElement clickOnProduct;
	
	@FindBy(how=How.XPATH, using="//button[@id='button-cart']")
	private WebElement addToCartButton;
	
	@FindBy(how=How.XPATH, using="//span[text()='My Account']")
	private WebElement myAccountButton;
	
	@FindBy(how=How.XPATH, using="//a[text()='Logout']")
	private WebElement logOutButton;
	
	@FindBy(how=How.XPATH, using="//a[text()='Login']")
	private WebElement loginWebElement;
	
	@FindBy(how=How.ID, using="input-email")
	private WebElement emailAdressFieldWebelement;
	
	@FindBy(how=How.ID, using="input-password")
	private WebElement passwordFieldWebElement;
	
	public void enterEmaiAddress(String emailValue) {
		emailAdressFieldWebelement.sendKeys(emailValue.trim());
		
	}	
	
	public void enterPassword(String passwordValue) {
		passwordFieldWebElement.sendKeys(passwordValue.trim());
	}
	
	public void clickLoginButton() {
		loginWebElement.click();
	}
	
	public void clickOnCurrency() {
		currencyButton.click();
		
	}
	
	public void clickOnEuro() {
		optionsOfCurrency.click();
	}
	
	public void clickOnProductButton() {
		clickOnProduct.click();
	}
	
	public void addToCart() {
		addToCartButton.click();
	}
	
	public void myAccountBut() {
		myAccountButton.click();
	}
	
	public void logoutBotton() {
		logOutButton.click();
	}

}
