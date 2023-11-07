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

public class register {

	@Given("User successful install the app and open sign up page")
	public void user_successful_install_the_app_and_open_sign_up_page() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Login/Step Definition/001 User open apps'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Login/Step Definition/002 User click btn akun'), [:], FailureHandling.STOP_ON_FAILURE)

	}

	@When("User click MAsuk")
	public void user_click_MAsuk(){
		Mobile.callTestCase(findTestCase('Login/Step Definition/003 User click btn masuk pageAkunsaya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click Daftar")
	public void user_click_Daftar() {
		Mobile.callTestCase(findTestCase('Register/Step Denifition/001 User Click label daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input name")
	public void user_input_name() {
		Mobile.callTestCase(findTestCase('Register/Step Denifition/002 User input nama'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input email")
	public void user_input_email() {
		Mobile.callTestCase(findTestCase('Register/Step Denifition/003 User input email'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input password")
	public void user_input_password() {
		Mobile.callTestCase(findTestCase('Register/Step Denifition/004 User input password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input phone number")
	public void user_input_phone_number() {
		Mobile.callTestCase(findTestCase('Register/Step Denifition/005 User input noHP'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input city")
	public void user_input_city() {
		Mobile.callTestCase(findTestCase('Register/Step Denifition/006 User input kota'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input address")
	public void user_input_address() {
		Mobile.callTestCase(findTestCase('Register/Step Denifition/007 User input alamat'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@Then("User click btn Daftar success")
	public void User_click_btn_Daftar_success() {
		Mobile.callTestCase(findTestCase('Register/Step Denifition/008 User click btn Daftar success'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
