Feature: validation of flipkart application

Scenario: validatiion of flipkart with valid details
Given  user launches browser
Then   user verify search functionality is displayed
When   user sends valid keyword  
And    user clicks search button
Then   user verify relevant search results are present
When   user clicks on the desired product 
Then   user verify  add to cart page is displayed
When   user clicks on the add to cart
When   user clicks place order button
Then   user verify payment page is displayed
When   user clicks address option
When   user clicks payment option 
Then   user removes the selected product from the cart


      
