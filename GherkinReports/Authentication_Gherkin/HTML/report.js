$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/login.feature");
formatter.feature({
  "name": "login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "Login with registered credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LGN01"
    }
  ]
});
formatter.step({
  "name": "user already open apps",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_already_open_apps()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click akun",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_click_akun()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click btn masuk pageAkunsaya",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_btn_masuk_pageAkunsaya()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input email",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_input_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input password",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_input_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click button masuk",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_button_masuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user succesful login and directed to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_succesful_login_and_directed_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with one null field data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LGN02"
    }
  ]
});
formatter.step({
  "name": "User already open login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_already_open_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click account",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_click_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click btn masuk page akunsaya",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_btn_masuk_page_akunsaya()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Email",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_input_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User button Masuk",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_button_Masuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can not login and pop up warning password",
  "keyword": "Then "
});
formatter.match({
  "location": "login.User_can_not_login_and_pop_up_warning_password()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login without input all data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LGN03"
    }
  ]
});
formatter.step({
  "name": "User already open loginPage",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_already_open_loginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click btnMasuk pageAkunsaya",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_click_btnMasuk_pageAkunsaya()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Masuk",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_Masuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click btnMasuk",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_btnMasuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can not login and pop up warning text email tidak boleh kosong",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_can_not_login_and_pop_up_warning_text_email_tidak_boleh_kosong()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with unregistered credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LGN04"
    }
  ]
});
formatter.step({
  "name": "User ready open login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_ready_open_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click BtnAkun",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_click_BtnAkun()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click BTNMasuk",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_BTNMasuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input EMail",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_input_EMail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input PassWord",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_input_PassWord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click bTnMasuk",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_bTnMasuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user failed login",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_failed_login()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/register.feature");
formatter.feature({
  "name": "User Sign Up",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.scenario({
  "name": "Sign Up with correct data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    },
    {
      "name": "@RGS01"
    }
  ]
});
formatter.step({
  "name": "User successful install the app and open sign up page",
  "keyword": "Given "
});
formatter.match({
  "location": "register.user_successful_install_the_app_and_open_sign_up_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click MAsuk",
  "keyword": "When "
});
formatter.match({
  "location": "register.user_click_MAsuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Daftar",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_click_Daftar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input name",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input email",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input password",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input phone number",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_phone_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input city",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input address",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click btn Daftar success",
  "keyword": "Then "
});
formatter.match({
  "location": "register.User_click_btn_Daftar_success()"
});
formatter.result({
  "status": "passed"
});
});