Feature: validation of booking   in adactinhotel Web Application
   
     
   
Scenario: TC01_validation of booking with valid details
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
  When user enters valid first name and last name
  When user enters valid billing address
  When user enters  valid credit card number 
  When user click Credit Card Type
  When user clicks valid Expiry month,Expiry year
  When user enters valid cvv number
  And user select book now button
  Then user should get order number
  
    


   
   
  
   
   

  
   

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   