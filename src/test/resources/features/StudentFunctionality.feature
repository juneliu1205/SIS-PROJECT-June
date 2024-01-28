Feature: Validate Add New Student functionality

  @studentfunction
  Scenario: valid login
    When User enter the user name and password
    And User will be able to click drop down manu
    And click on login button
    And User will be able to see and click the students tab 
    And User will be able to see and click the add new tab 
    And User fill up detail
    Then Validate student is created success message is displayed
    