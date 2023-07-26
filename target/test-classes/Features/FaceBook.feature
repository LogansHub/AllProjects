Feature: validation of Login functionality in facebook



Scenario Outline: Validation of Login with  invalid Details
Given user lanch browser 
Then user verify Error message is displayed
When user enters  invalid username "<username>"
When user enters invalid  password "<password>"
And user clicks login button 
Then user verify Error message is displayed
Examples:
|username|password|
|logan   |kumar   |
|kumar   |logan   |


 