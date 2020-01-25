Feature: Tek School Scenarios3

Background: 
Given User is on TekSchool page
And User Click on Test Environment link
And User should see Test Environment page


#Scenario: SDET2019AUG_SDET_003_Execution
When User click on my account menu on top of the page
And User click on login on my account menu
And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
And User click on login button
Then User should be logged in

@SDET_09
Scenario: SDET_O9_Currency
When User ckics on currensy tap on the lefy top of the page
Then tree currensies are displayed
Then User can click on different currency
Then choosen currency is displayed under the products
And user clicks on phones and PDAs
And user clicks on spesific pruduct
Then User should see the chosen currency is displayed on the product ditails page
Then User clicks on Add to Cart Button
And User sees the chesen currensy is displayed
And User clicks on my account Button
Then User clicks on log out Button
And user clicks on my account menu
And User click on login on my account menu1
And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
And User click on login button
Then User should be logged in
#And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu1
#And User click on login button1
#And User see the same currency is saved

