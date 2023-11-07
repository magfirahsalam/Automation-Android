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

public class deleteproduct {
	@Given("user ready login")
	public void user_ready_login() {
		Mobile.callTestCase(findTestCase('Product/Delete Product/Step Definition/01 User Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click button daftar jual")
	public void user_click_button_daftar_jual() {
		Mobile.callTestCase(findTestCase('Product/Delete Product/Step Definition/02 Click Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user select product")
	public void user_select_product() {
		Mobile.callTestCase(findTestCase('Product/Delete Product/Step Definition/03 Choose Product For Update'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click button delete")
	public void user_click_button_delete() {
		Mobile.callTestCase(findTestCase('Product/Delete Product/Step Definition/04 Click Button Delete'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click pesan hapus")
	public void user_click_pesan_hapus() {
		Mobile.callTestCase(findTestCase('Product/Delete Product/Step Definition/05 Click Pesan Hapus'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user success delete product")
	public void user_success_delete_product() {
		Mobile.callTestCase(findTestCase('Product/Delete Product/Step Definition/06 Success delete product'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/10 Log Out'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
