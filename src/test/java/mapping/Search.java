package mapping;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Search 
{

@Given("user click on branches button")
public void user_click_on_branches_button() {
	Object []input5= new Object[1];
	input5[0]="//*[@src='images/Branches_but.jpg']";
	SeleniumOperations.click(input5);
}

@Given("user select {string} as country")
public void user_select_as_country(String country) {
	Object []input6= new Object[2];
	input6[0]="lst_countryS";
	input6[1]=country;
	SeleniumOperations.select(input6);
}

@Given("user select {string} as state")
public void user_select_as_state(String state) {
	Object []input7= new Object[2];
	input7[0]="lst_stateS";
	input7[1]=state;
	SeleniumOperations.select(input7);
}

@Given("user select {string} as city")
public void user_select_as_city(String city) {
	Object []input8= new Object[2];
	input8[0]="lst_cityS";
	input8[1]=city;
	SeleniumOperations.select(input8);
}

@When("user click on search button")
public void user_click_on_search_button() {
	Object []input9= new Object[1];
	input9[0]="//*[@id='btn_search']";         
	SeleniumOperations.click(input9); 
}

@Then("user can see Branch deatails")
public void user_can_see_Branch_deatails() {
	Object []input10= new Object[2];
	input10[0]="//*[text()='Branch Details']";
	input10[1]="Branch Details";
	SeleniumOperations.validation(input10);
}

}
