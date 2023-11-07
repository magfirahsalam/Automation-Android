@Editprofile
Feature: Edit profile

@EP01
Scenario: Edit info profile with valid data
Given User has been login and open profile page
When user click button pencil
And User input name
And User input phone number
And User input city
And User input address
And  user input email
Then Profile updated and pop up succesfull saving data




@EP02
Scenario: view profile
Given USER has been login and open profile
And USER click pencil icon
Then PROFILE update and pop up successfully 








