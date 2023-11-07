@Register


Feature: User Sign Up

@RGS01
Scenario: Sign Up with correct data 
Given  User successful install the app and open sign up page
When   User click MAsuk
And    User click Daftar
And    User input name
And    User input email
And    User input password
And    User input phone number
And    User input city
And    User input address
Then   User click btn Daftar success
