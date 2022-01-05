
Feature: Verifying AdactingHotel login details
Scenario: Verifying AdactingHotel login with valid Credentials
Given User is on the AdactingHotel page
When User should enter Username and Password and Click login button
|vijay548454|9094455484|
|praba125|praba@78|
|balu48|balu@123|
And User should click on login Button 
Then User should verify the Success message
