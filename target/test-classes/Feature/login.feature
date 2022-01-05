Feature: Verifying AdactingHotel login details
Scenario: Verifying AdactingHotel login with valid Credentials
Given User is on the AdactingHotel page
When User should enter Username and Password and Click login button
|vijay548454|
|9094455484|
And User should click on login Button 
Then User should verify the Success message
