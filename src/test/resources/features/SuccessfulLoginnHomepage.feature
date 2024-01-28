Feature: Login Page Validation

  @loginValidate
  Scenario: Validate Announcement section is visible
    When User enter the user name and password
    And User will be able to click drop down manu
    And click on login button
    Then Validate that user can see Announcement section
    
  @loginValidate
  Scenario: Validate that the logo is visible
    When User enter the user name and password
    And User will be able to click drop down manu
    And click on login button
    Then Validate that user can see the logo
    
    @loginValidate 
    Scenario: Validate that the url includes the "MainPage.aspx" extension.
    When User enter the user name and password
    And User will be able to click drop down manu
    And click on login button
    Then Validate that url includes the "MainPage.aspx" extension