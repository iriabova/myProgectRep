package StepDefenition;

import org.junit.Assert;

import com.bdd.myProject.Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.TekSchoolObject;
import utilities.Utility;

public class TekSchoolScenariosStepDefinitions extends Base {
	// just for git practice comment
	//one more practice to myself this is to push to git hub repo
	//my second comment to be pulled from remote repo
	//////////////////////////////////////////////////
	//my last practise to see the pull step
	//////////////////////////////////////////////////
	TekSchoolObject tekSchoolScenariosPageObject=new TekSchoolObject();
	
	@When("^User click on my account menu on top of the page$")
	public void user_click_on_my_account_menu_on_top_of_the_page() throws Throwable {
		Utility.screenshot(driver);
		tekSchoolScenariosPageObject.clickOnMyAccount();
		//tekSchoolScenariosPageObject.clickonLogin();
	}

	@When("^User click on login on my account menu$")
	public void user_click_on_login_on_my_account_menu() throws Throwable {
		tekSchoolScenariosPageObject.clickonLogin();
	}

	@And("^User enter username '(.+)' and password '(.+)' in returning menu$")
	public void user_enter_username_username_and_password_password_in_returning_menu(String userName, String passWord) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.enterEmaiAddress(userName);
		tekSchoolScenariosPageObject.enterPassword(passWord);
	
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);

		tekSchoolScenariosPageObject.clickOnLOginButton();
	}

	@Then("^User should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
		Assert.assertEquals(true, tekSchoolScenariosPageObject.verifyLoginToMyAccount());
		Utility.screenshot(driver);

	}

	//for currency step definition
	
	
	@When("^User ckics on currensy tap on the lefy top of the page$")
	public void user_ckics_on_currensy_tap_on_the_lefy_top_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.clickOnCurrency();
	}

	@Then("^tree currensies are displayed$")
	public void tree_currensies_are_displayed() throws Throwable {
	    
	}

	@Then("^User can click on different currency$")
	public void user_can_click_on_different_currency() throws Throwable {
		tekSchoolScenariosPageObject.clickOnEuro();
	}

	@Then("^choosen currency is displayed under the products$")
	public void choosen_currency_is_displayed_under_the_products() throws Throwable {
		Utility.screenshot(driver);
	}

	@Then("^user clicks on phones and PDAs$")
	public void user_clicks_on_phones_and_PDAs() throws Throwable {
		tekSchoolScenariosPageObject.clickONphoneAndPDAs();
	}

	
	@Then("^user clicks on spesific pruduct$")
	public void user_clicks_on_spesific_pruduct() throws Throwable {
		tekSchoolScenariosPageObject.clickOnProductButton();
	}

	@Then("^User should see the chosen currency is displayed on the product ditails page$")
	public void user_should_see_the_chosen_currency_is_displayed_on_the_product_ditails_page() throws Throwable {
		Utility.screenshot(driver);
	}

	@Then("^User clicks on Add to Cart Button$")
	public void user_clicks_on_Add_to_Cart_Button() throws Throwable {
		tekSchoolScenariosPageObject.addToCart();
	}

	@Then("^User sees the chesen currensy is displayed$")
	public void user_sees_the_chesen_currensy_is_displayed() throws Throwable {
		Utility.screenshot(driver);
	}

	@Then("^User clicks on my account Button$")
	public void user_clicks_on_my_account_Button() throws Throwable {
		tekSchoolScenariosPageObject.myAccountBut();
	}

	
	@Then("^User clicks on log out Button$")
	public void user_clicks_on_log_out_Button() throws Throwable {
		tekSchoolScenariosPageObject.logoutBotton();
	}
	
	@Then("^user clicks on my account menu$")
	public void user_clicks_on_my_account_menu() throws Throwable {
		tekSchoolScenariosPageObject.clickOnMyAccount();
	}
	
	@When("^User click on login on my account menu1$")
	public void user_click_on_login_on_my_account_menu1() throws Throwable {
		tekSchoolScenariosPageObject.clickonLogin();
	}
	
	
	@And("^User enter username '(.+)' and password '(.+)' in returning menu1$")
	public void user_enter_username_username_and_password_password_in_returning_menu1(String userName, String passWord) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.enterEmaiAddress(userName);
		tekSchoolScenariosPageObject.enterPassword(passWord);
	
	}

	@When("^User click on login button1$")
	public void user_click_on_login_button1() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);

		tekSchoolScenariosPageObject.clickOnLOginButton();
	}
	
	
	
}

