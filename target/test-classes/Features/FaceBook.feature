Feature: validation of Login functionality in facebook

Background: 
Given user lanch browser 
Then user verify Error message is displayed

Scenario Outline: Validation of Login with  invalid Details


When user enters  invalid username "<username>"
When user enters invalid  password "<password>"
And user clicks login button 

Examples:
|username|password|
|logan   |kumar   |
|kumar   |logan   |


 