package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class offers {

	@Given("Seller already login and on the homepage")
	public void seller_already_login_and_on_the_homepage() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Start Application'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Login as Seller'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller create the product")
	public void seller_create_the_product() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Product/Seller Create Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Product is created and ready to be offered")
	public void product_is_created_and_ready_to_be_offered() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Product/Verify product successfully created'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Buyer sucessfully login and landed on homepage")
	public void buyer_sucessfully_login_and_landed_on_homepage() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Start Application'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Login as Buyer'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User search product")
	public void user_search_product() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Buyer/01 User search desired product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select product")
	public void user_select_product() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Buyer/02 User select desired product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click tertarik button")
	public void user_click_tertarik_button() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Buyer/03 User tap tertarik button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input harga tawar")
	public void user_input_harga_tawar() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Buyer/04 User input harga tawar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click kirim button")
	public void user_click_kirim_button() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Buyer/05 User tap kirim button to send offer'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("offer submitted awaiting seller respond")
	public void offer_submitted_awaiting_seller_respond() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Buyer/06 Verify offer is sent awaiting seller respond'),
				[:], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Buyer offer product")
	public void buyer_offer_product() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Start Application'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Login as Seller'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap acount icon")
	public void user_tap_account_icon() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/01 User tap the account icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap product list icon")
	public void user_tap_product_list_icon() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/02 User tap Daftar Jual text'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap Diminati tab")
	public void user_tap_diminati_tab() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/03 User tap Diminati tab'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Select offer notification from buyer")
	public void select_offer_notification_from_buyer() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/04 User select offer from buyer'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click Terima button")
	public void user_click_Terima_button() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/05 User tap terima button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Offer status become accepted")
	public void offer_status_become_accepted() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/06 Verify offer status become accepted'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Buyer offered a product")
	public void buyer_offered_a_product() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Start Application'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Login as Seller'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap navbar acount icon")
	public void user_tap_navbar_account_icon() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/01 User tap the account icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap the product list icon")
	public void user_tap_the_product_list_icon() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/02 User tap Daftar Jual text'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap Diminati to switch tab")
	public void user_tap_diminati_to_switch_tab() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/03 User tap Diminati tab'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Select the offer notification from buyer")
	public void select_the_offer_notification_from_buyer() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/04 User select offer from buyer'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click on Tolak button")
	public void user_click_on_Tolak_button() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/05 User tap tolak button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Offer status become rejected")
	public void offer_status_become_rejected() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/06 Verify offer status become rejected'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Seller accept buyer offer")
	public void seller_accept_buyer_offer() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User click status button")
	public void user_click_status_button() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/07 User tap status button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select finished status")
	public void user_select_finished_status() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/08 User select finished status'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click the kirim button")
	public void user_click_the_kirim_button() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/09 User tap simpan button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Offer status changed to sold")
	public void offer_status_changed_to_sold() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/10 Verify offer status become finished'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Seller accepted buyer offer")
	public void seller_accepted_buyer_offer() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User click on status button")
	public void user_click_on_status_button() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/07 User tap status button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select cancel transaction status")
	public void user_select_cancel_transaction_status() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/08 User select cancelled status'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click button kirim")
	public void user_click_button_kirim() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/09 User tap simpan button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Offer status changed to cancelled")
	public void offer_status_changed_to_cancelled() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Seller/10 Verify offer status become cancelled'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}