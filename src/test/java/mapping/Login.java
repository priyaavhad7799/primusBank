package mapping;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Login 
{

	@Given("user open {string} browser")
	public void user_open_browser(String name) {
		Object []input= new Object[1];
		input[0]=name;
		//input[1]=location;
		SeleniumOperations.LaunchBrowser(input);
	}

	@Given("user open url")
	public void user_open_url() {
	//	Object []input1= new Object[1];
	//	input1[0]=url;
		SeleniumOperations.openApp();
	}

	
@When("user enter {string} as a username")
public void user_enter_as_a_username(String uname) 
{
	Object []input2= new Object[2];
	input2[0]="//*[@id='txtuId']";
	input2[1]=uname;
	SeleniumOperations.sendkyes(input2);
}

@When("user enter {string} as a password")
public void user_enter_as_a_password(String password) 
{
	Object []input3= new Object[2];
	input3[0]="//*[@id='txtPword']";
	input3[1]=password;
	SeleniumOperations.sendkyes(input3);

   
}

@When("user click on login button")
public void user_click_on_login_button() 
{
	Object []input4= new Object[1];
	input4[0]="//*[@id='login']";
	SeleniumOperations.click(input4);
}

@Then("application shows admin page")
public void application_shows_admin_page()
{
	
	Object []input5= new Object[2];
	input5[0]="//*[text()='Admin']";
	input5[1]="Admin";
	SeleniumOperations.validation(input5);
}
}
