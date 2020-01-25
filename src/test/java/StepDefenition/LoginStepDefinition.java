package StepDefenition;

import com.bdd.myProject.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPageObject;

import java.util.List;

import org.junit.Assert;



public class LoginStepDefinition extends Base {
	
	
	//Declare LoginPageObject obj
	
	LoginPageObject testEnvironment = new LoginPageObject();

	
	@Given("^User is on TekSchool page$")
	public void user_is_on_TekSchool_page() throws Throwable {
                Base.initializeDriver();
		
		
	    
	}

	@When("^User Click on Test Environment link$")
	public void user_Click_on_Test_Environment_link() throws Throwable {
		testEnvironment.clickOnTestEnvironmentLink();
		
		
	}

/////////////////////////////////////////////////////////////
	@Then("^User should see Test Environment page$")
	public void user_should_see_Test_Environment_page() throws Throwable {

		System.out.println(driver.getTitle());
	
	}

	
	
}
