package pageObjects;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bdd.myProject.Base;

public class TekSchoolObject extends Base{
	
	public TekSchoolObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using="//span[text()='My Account']")
	private WebElement myAccountWebElement;
	
	
	@FindBy(how=How.XPATH, using="//a[text()='Register']")
	private WebElement registerWebElement;
	
	@FindBy(how=How.XPATH, using="//a[text()='Login']")
	private WebElement loginWebElement;
	
	@FindBy(how=How.ID, using="input-email")
	private WebElement emailAdressFieldWebelement;
	
	@FindBy(how=How.ID, using="input-password")
	private WebElement passwordFieldWebElement;
	
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	private WebElement loginButtonWebElement;

	
	@FindBy(how = How.XPATH, using = "//h2[text()='My Account']")
	private WebElement myAccountTextWebElement;
	// Writing action methods for Webelement we store in this obj repositry class
	//////////////////////////////////////////////////
	
	@FindBy(how=How.XPATH, using ="//input[@name='firstname']")
	private WebElement firstNameWebElement;
	
	@FindBy(how=How.XPATH, using ="//input[@name='lastname']")
	private WebElement lastNameWebElement;
	
	@FindBy(how=How.XPATH, using ="//input[@name='email']")
	private WebElement emailWebElement;
	
	@FindBy(how=How.XPATH, using ="//input[@name='telephone']")
	private WebElement phoneElement;
	
	@FindBy(how=How.XPATH, using ="//input[@name='password']")
	private WebElement passwordElement;
	
	@FindBy(how=How.XPATH, using ="//input[@id='input-confirm']")
	private WebElement confirmpasswordElement;
	
	@FindBy(how=How.XPATH, using ="//input[@name='newsletter' and@value='1']")
	private WebElement subscribeYesButtonElement;
	
	@FindBy(how=How.XPATH, using ="//input[@name='newsletter' and@value='0']")
	private WebElement subscribeNoButtonElement;
	
	@FindBy(how=How.XPATH, using ="//input[@type='submit']")
	private WebElement continueButtonElement;
	
	@FindBy(how = How.XPATH, using = "//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedConfirmationText;
	
	public void clickOnMyAccount() {
		try {
		 myAccountWebElement.click();
	}catch(ElementNotInteractableException e) {
		myAccountWebElement.sendKeys(Keys.ENTER);
	}
	}
	public void clickonRegister() {
		try {
			registerWebElement.click();
		}catch(ElementNotInteractableException e) {
			registerWebElement.sendKeys(Keys.ENTER);
		}
	}
	
	public void clickonLogin() {
		try {
			loginWebElement.click();
		}catch(ElementNotInteractableException e) {
			loginWebElement.sendKeys(Keys.ENTER);
		}
	}
	
	public void enterEmaiAddress(String emailValue) {
		emailAdressFieldWebelement.sendKeys(emailValue.trim());
		
	}	
	
	public void enterPassword(String passwordValue) {
		passwordFieldWebElement.sendKeys(passwordValue.trim());
	}
	
	public void clickOnLOginButton() {
		loginButtonWebElement.click();
	}
	
	public boolean verifyLoginToMyAccount() {
		boolean verificationPoint = myAccountTextWebElement.isDisplayed();
		return verificationPoint;
	}
	public void fillFirstName(String firstName) {
		firstNameWebElement.sendKeys(firstName);
	}
	
	public void fillLastName(String lastName) {
		lastNameWebElement.sendKeys(lastName);
		
	}
	
	public void fillEmail(String emailValue) {
		emailWebElement.sendKeys(emailValue);
	}
	
	public void fillPhone(String phoneValue) {
		phoneElement.sendKeys(phoneValue);
	}
	
	public void fillPassword(String password) {
		passwordElement.sendKeys(password);
	}
	public void fillPasswordConfirmation(String passwordConfirmation) {
		confirmpasswordElement.sendKeys(passwordConfirmation);
	}
	public void subscribeRadioButton(String eysOrNo) {
		if (eysOrNo.equalsIgnoreCase("yes")) {
			subscribeYesButtonElement.click();
		}else {
			subscribeNoButtonElement.click();
		}
	}
	
	public void clickOnContinue() {
		continueButtonElement.click();
	}
	public boolean confirmationMessage() {
		boolean confermationtext=accountCreatedConfirmationText.isDisplayed();
		return confermationtext;
	}
//currency object
	
	@FindBy(how=How.XPATH, using="//a[text()='Phones & PDAs']")
	private WebElement phoneAndPDAs;
	
	@FindBy(how=How.XPATH, using="//button[@class='btn btn-link dropdown-toggle']")
	private WebElement currencyButton;
	
	@FindBy(how=How.XPATH, using="//button[text()='€ Euro']")
	private WebElement optionsOfCurrency;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a")
	private WebElement clickOnProduct;
	
	@FindBy(how=How.XPATH, using="//button[@id='button-cart']")
	private WebElement addToCartButton;
	
	@FindBy(how=How.XPATH, using="//span[text()='My Account']")
	private WebElement myAccountButton;
	
	@FindBy(how=How.XPATH, using="//a[text()='Logout']")
	private WebElement logOutButton;
	
	
	public void clickONphoneAndPDAs() {
		try {
			phoneAndPDAs.click();
		}catch(ElementNotInteractableException e) {
			phoneAndPDAs.sendKeys(Keys.ENTER);
		}
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
		try {
			clickOnProduct.click();
		}catch(ElementNotInteractableException e) {
			clickOnProduct.sendKeys(Keys.ENTER);
		}
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
