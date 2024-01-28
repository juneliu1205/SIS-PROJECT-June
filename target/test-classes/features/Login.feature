Feature: Login Page Validation

  @login
  Scenario: valid login
    When User enter the user name and password
    And User will be able to click drop down manu
    And click on login button
    Then Validate that user is logged in
    
@login
 Scenario: invalid login
    When user enters invalid username
    And user enters invalid password
    And click on login button
    Then validate that "Either username and password do not match or your account doesn't have access for the selected Academic Year" message is displayed
