Feature: Tek School Scenarios

Background: 
Given User is on TekSchool page
And User Click on Test Environment link
And User should see Test Environment page

@SDET_003
Scenario: SDET2019AUG_SDET_003_Execution
When User click on my account menu on top of the page
And User click on login on my account menu
And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
And User click on login button
Then User should be logged in

