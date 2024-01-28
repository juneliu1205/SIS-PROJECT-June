package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentsValidation extends CommonMethods {

	@When("User will be able to see and click the students tab")
	public void user_will_be_able_to_see_and_click_the_students_tab() {
			waitForClickability(homepage.MainLogo);
			homepage.students.click();
		}

	@Then("User validate all sub tabs are visible")
	public void user_validate_all_sub_tabs_are_visible() {
		verifyElementIsDisplayed(homepage.personaltab);
		verifyListElementIsDisplayed(homepage.subtab);
	}


	
	
	
}
