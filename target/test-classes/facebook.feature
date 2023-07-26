Feature: Validation of Login functionality in Facebook
Scenario:
  Given User lanch browser
  When User enters invalid username   and invalid password
  And  User clicks Login button
  Then User verfies Error Message is displayed
  