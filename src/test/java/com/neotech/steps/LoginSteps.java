package com.neotech.steps;

import org.junit.Assert;
import org.openqa.selenium.Alert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	@When("User enter the user name and password")
	public void user_enter_the_user_name_and_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Neotech$123");
	}

	@When("User will be able to click drop down manu")
	public void user_will_be_able_to_click_drop_down_manu() {
		selectDropdown(login.Acadyear, "2020-2021");
	}

	@When("click on login button")
	public void user_click_on_login_button() {
		click(login.loginButton);
		wait(2);
	}

	@Then("Validate that user is logged in")
	public void validate_that_user_is_logged_in() {
		Assert.assertTrue(homepage.MainLogo.isDisplayed());
		
	}

	@When("user enters invalid username")
	public void user_enters_invalid_username() {
		sendText(login.username, "Student1");
	}

	@When("user enters invalid password")
	public void user_enters_invalid_password() {
		sendText(login.password, "Neotech$456");
	}

	@Then("validate that {string} message is displayed")
	public void validate_that_message_is_displayed(String expectedMsg) {
		Alert simpleAlert = driver.switchTo().alert();
		wait(1);
		String actualMsg  = simpleAlert.getText();
		if (actualMsg.equals(expectedMsg)) {
			simpleAlert.accept();
			Assert.assertTrue(expectedMsg.equals(actualMsg)) ;
	    Assert.assertEquals(expectedMsg,actualMsg);

	}
	}}
	