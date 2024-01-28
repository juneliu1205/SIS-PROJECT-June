Feature: Validate all sub tabs are visible

  @students
  Scenario: valid login
    When User enter the user name and password
    And User will be able to click drop down manu
    And click on login button
    And User will be able to see and click the students tab 
    Then User validate all sub tabs are visible