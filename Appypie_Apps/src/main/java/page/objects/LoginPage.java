package page.objects;

import pages.base.BasePage;

public class LoginPage extends BasePage{
	
	public void enterLoginDetails()
	{
		
		type("email_XPATH", "appcreator7aug@yopmail.com");
		type("password_XPATH", "Test@12345");
		click("loginbtn_XPATH");
		
	}

}
