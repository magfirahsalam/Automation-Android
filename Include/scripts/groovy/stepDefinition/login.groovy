package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class login {

	@Given("user already open apps")
	public void user_already_open_apps() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/001 User open apps'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click akun")
	public void user_click_akun() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/002 User click btn akun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click btn masuk pageAkunsaya")
	public void user_click_btn_masuk_pageAkunsaya() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/003 User click btn masuk pageAkunsaya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input email")
	public void user_input_email() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/004 User input email'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input password")
	public void user_input_password() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/005 User input password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click button masuk")
	public void user_click_button_masuk() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/006 User click btn masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user succesful login and directed to home page")
	public void user_succesful_login_and_directed_to_home_page() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/Verify Login success'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	//lGN02

	@Given("User already open login page")
	public void user_already_open_login_page() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/001 User open apps'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click account")
	public void user_click_account() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/002 User click btn akun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click btn masuk page akunsaya")
	public void user_click_btn_masuk_page_akunsaya() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/003 User click btn masuk pageAkunsaya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input Email")
	public void user_input_Email() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/004 User input email'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User button Masuk")
	public void user_button_Masuk() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/006 User click btn masuk'), [:], FailureHandling.STOP_ON_FAILURE)

	}

	@Then("User can not login and pop up warning password")
	public void User_can_not_login_and_pop_up_warning_password() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/Warning Text Password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	//LGN03
	@Given("User already open loginPage")
	public void user_already_open_loginPage() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/001 User open apps'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click btnMasuk pageAkunsaya")
	public void user_click_btnMasuk_pageAkunsaya() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/002 User click btn akun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click Masuk")
	public void user_click_Masuk() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/006 User click btn masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click btnMasuk")
	public void user_click_btnMasuk() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/006 User click btn masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User can not login and pop up warning text email tidak boleh kosong")
	public void user_can_not_login_and_pop_up_warning_text_email_tidak_boleh_kosong() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/Verify Email tidak boleh kosong'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	//LGN004
	@Given("User ready open login page")
	public void user_ready_open_login_page() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/001 User open apps'), [:], FailureHandling.STOP_ON_FAILURE)

	}

	@When("User click BtnAkun")
	public void user_click_BtnAkun() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/002 User click btn akun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click BTNMasuk")
	public void user_click_BTNMasuk() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/006 User click btn masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}



	@When("User input EMail")
	public void user_input_EMail() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/004 User input email'), [:], FailureHandling.STOP_ON_FAILURE)

	}

	@When("User input PassWord")
	public void user_input_PassWord() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/005 User input password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click bTnMasuk")
	public void user_click_bTnMasuk() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/006 User click btn masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user failed login")
	public void user_failed_login() {
		Mobile.callTestCase(findTestCase('Login/Step Definition/verify failed login'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
