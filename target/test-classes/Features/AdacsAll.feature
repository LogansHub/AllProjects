Feature: validation of booking   in adactinhotel Web Application
   
     
   
Scenario Outline: TC01_validation of booking with valid details
  Given User launch Adactinhotel Web Application
  When User entres valid username and valid password
  When User clicks Login Button
  
  Then user verify Home page is displayed
  Then user click valid location,hotelname,roomtype,roomnumber,checkindate,checkoutdate,adultsandchlidcountperroom
  Then user click search button
  Then user  verify price page is displayed
  
  When user selects select radio button
  When user click contine button
  Then user  verify booking page is displayed
  
  When user enters valid "<firstname>" and "<lastname>" and "<billingaddress>" and "<ccnum>" and "<cvvnumber>"
  When user click Credit Card Type
  When user clicks valid Expiry month,Expiry year
  And user select book now button
  Then user should get order number
  Examples: 
      | firstname | lastname | billingaddress | ccnum            | cvvnumber |
      | kumar     | logan    | coimabtore     | 1234567891011145 |       123 |
      | kumaran   | logan    | vellakovil     | 1234567891011146 |       124 |
      | arun      | kumar    | chennai        | 1234567891011147 |       125 |
      | kumarans  | logans   | tiruppur       | 1234567891011148 |       126 |
    


   
   
  
   
   

  
   

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   