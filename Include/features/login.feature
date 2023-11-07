@Login 

Feature: login

@LGN01
Scenario: Login with registered credential
Given  user already open apps
When   user click akun
And    user click btn masuk pageAkunsaya
And    user input email
And    user input password
And    user click button masuk 
Then   user succesful login and directed to home page

@LGN02
Scenario: Login with one null field data
Given     User already open login page
When      User click account 
And       User click btn masuk page akunsaya
And       User input Email
And       User button Masuk
Then      User can not login and pop up warning password

@LGN03
Scenario: Login without input all data
Given     User already open loginPage
When      User click btnMasuk pageAkunsaya
And       User click Masuk
And       User click btnMasuk
Then      User can not login and pop up warning text email tidak boleh kosong

@LGN04
Scenario: Login with unregistered credential
Given  User ready open login page
When   User click BtnAkun
And    User click BTNMasuk
And    User input EMail
And    User input PassWord
And    User click bTnMasuk
Then   user failed login

