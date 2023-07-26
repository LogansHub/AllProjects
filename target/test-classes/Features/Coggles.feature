Feature: Validation of search functionality on Coggles WebApplication 

Background:
 Given User launch  browser
 And User accept cookies
 When User enters valid user name and valid password
 And User clicks Login Button
 And  User Checks Home page is Displayed

 
Scenario: TC1 Validation of search functionality with  invalid detail 
And User clicks Search button without value
Then User Verify some of the  products displayed by default

Scenario Outline: TC2 Validation of search functionality with invalid detail
And User clicks Search box 
When User enters invalid  search keyword  "<Keyword Search>"
And User clicks Search button
Then user verify Suggestion text is Displayed
Examples:
|Keyword Search|
|@!@#$%^&|
|s h i r t|


Scenario Outline: TC3 Validation of search functionality with valid detail
And User Clicks Search  box
When User enters valid keyword "<Keyword search>"
And user clicks search button
Then user verify product page is dispalyed
Examples:
|Keyword search|
|shirt|
|shirt and pant| 

 
Scenario: TC4 validation of search functionality with valid detail
And User Clicks Search  box  for prev searches
When User enters valid keyword 
Then user should able to get suggestions based on previous searches

Scenario: TC5 validation of search functionality with valid detail
And User Clicks Search  box for title verification
When User enters valid keyword for titile verification
Then user verify Search Result webpage title contains search keyword

Scenario: TC6 validation of search functionality with valid detail
And User Clicks Search  box for relevent
When User enters valid keyword for relevent search
Then user verify Search results are relevant

Scenario: TC7 validation of search functionality with valid detail
And User Clicks Search  box for pagi
When User enters valid keyword  for pagi
Then user verify Search results are paginated

Scenario: TC8 validation of search functionality with valid detail
And User Clicks Search  box for sorting meachanism
When User enters valid keyword for sorting
Then user verify Search results page contains sorting mechanism.

Scenario: TC9 validation of search functionality with valid detail
And User Clicks Search  box for again search
When User enters valid keyword for search functionality
And user should get product page
Then user should able to search again on the page itself

Scenario: TC10 validation of search functionality with valid detail
And User Clicks Search  box for refresh 
When User enters valid keyword for refresh
And user should get product page
Then user should able to refresh and get the same result




Scenario: TC11 Validation of Checkout functionality with valid detail
And User clicks search box 
When User enters valid keyword for checkout
And User click search button
And user verify Product page is displayed
When user clicks particular product
And user verify product details page is displayed 
And user clicks size and quantity
And user cliks Add to Bag functionality
When user clicks View basket button
Then  user verify checkout page is displayed  

