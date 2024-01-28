package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class LoginPageValidation extends CommonMethods {

	@Then("Validate that user can see Announcement section")
	public void validate_that_user_can_see_announcement_section() {
		Assert.assertTrue(homepage.announcements.isDisplayed());
	}

	@Then("Validate that user can see the logo")
	public void validate_that_user_can_see_the_logo() {
		Assert.assertTrue(homepage.MainLogo.isDisplayed());
	}

	@Then("Validate that url includes the {string} extension")
	public void validate_that_url_includes_the_extension(String expectedURL) {
		
		String actualURL = driver.getCurrentUrl();
		String expURL = "https://sis.neotechacademy.com/AD/Main/MainPage.aspx";
		
		if(actualURL.contains("MainPage.aspx"))
		{
			System.out.println("Test Pass!");
		}
		else
		{
			System.out.println("Test Failed!");
		}
		
	}

}
