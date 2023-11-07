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

public class updateproduct {
	@Given("user success login")
	public void user_success_login() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/01 User Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click daftar jual")
	public void user_click_daftar_jual() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/02 Click Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user choose product")
	public void user_choose_product() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/03 Choose Product For Update'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user change product name")
	public void user_change_product_name() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/04 update product name'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user change product price")
	public void user_change_product_price() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/05 Update Product Price'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user change product lokasi")
	public void user_change_product_lokasi() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/06 Update Lokasi'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click button perbarui product")
	public void user_click_button_perbarui_product() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/08 Perbarui Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("product is updated")
	public void product_is_updated() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/09 Success Update Product'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/10 Log Out'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("seller has login")
	public void seller_has_login() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/01 User Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user tap daftar jual")
	public void user_tap_daftar_jual() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/02 Click Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("seler choose product")
	public void seler_choose_product() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/03 Choose Product For Update'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user input product name blank")
	public void user_input_product_name_blank() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/04 update product name kosong'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user input product price blank")
	public void user_input_product_price_blank() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/05 Update Product Price Kosong'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user input product location blank")
	public void user_input_product_location_blank() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/06 Update Lokasi Kosong'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click button terbitkan")
	public void user_click_button_terbitkan() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/08 Perbarui Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("product is not update and gave popup failed message")
	public void product_is_not_update_and_gave_popup_failed_message() {
		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/Warning Data Kosong'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Product/Update Product/Step Definition/10 Log Out'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
