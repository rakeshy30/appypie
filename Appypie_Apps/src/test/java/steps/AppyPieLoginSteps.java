package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LoginPage;
import utils.SeleniumDriver;

public class AppyPieLoginSteps {
	
	LoginPage login= new LoginPage();
	
	@Given("user navigates to appypie website")
	public void user_navigates_to_appypie_website() {
		
		SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testsiteurl"));
	    
	}
	@When("user enters email")
	public void user_enters_email() {
		
		login.enterLoginDetails();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	@Then("user enters password")
	public void user_enters_password() {
		
		
	    
	}
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		
		
		
	    
	}
	

}
