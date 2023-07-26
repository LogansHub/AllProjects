Feature: validation of Login functionality in facebook



Scenario: Validation of Login with  invalid Details
Given user lanch browser 
Then user verify Error message is displayed
When user enters  invalid username and invalid password
 |username|password|
 |logan   |kumar   |
 |yogan   | yogu   |
And user clicks login button 
Then user verify Error message is displayed


 