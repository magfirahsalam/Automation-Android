package stepDefinition

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


public class Categories {

	@Given("user open apps")
	public void user_open_apps() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User open apps'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("user input available product name")
	public void user_input_available_product_name() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User input available product name'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("user can find the available product name")
	public void user_can_find_the_available_prodcut_name() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User can find the available product'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@Given("user already open application")
	public void user_already_open_application() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User open apps'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("user input unavailable product name")
	public void user_input_unavailable_product_name() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User input unavailable product name'), [('unavailableproduct') : 'kacang goreng pahit'],
		FailureHandling.STOP_ON_FAILURE)
	}
	@Then("user cannot find the unavailable product")
	public void user_cannot_find_the_unavailable_product() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User cannot find the unavailable product'), [:], FailureHandling.STOP_ON_FAILURE)
	}



	@Given("user open app")
	public void user_open_app() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User open apps'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("user does not input product name")
	public void user_does_not_input_product_name() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User not input product name'), [('availableproduct') : 'sepatu kaca'],
		FailureHandling.STOP_ON_FAILURE)
	}
	@Then("user cannot find blank product")
	public void user_cannot_find_blank_product() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User cannot find blank product name'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@Given("user open  application seconhand")
	public void user_open_application_seconhand() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User open apps'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("user  input prodcut name with double space")
	public void user_input_prodcut_name_with_double_space() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User input product only with double space'), [('space') : '  '],
		FailureHandling.STOP_ON_FAILURE)
	}
	@Then("user can find the random product contain double space")
	public void user_can_find_the_random_product_contain_double_space() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User can find random product contain space only'), [:], FailureHandling.STOP_ON_FAILURE)
	}




	@Given("user already open app secondhand")
	public void user_already_open_app_secondhand() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User open apps'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("user select category")
	public void user_select_category() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User select category'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("user can find the product by the category")
	public void user_can_find_the_product_by_the_category() {
		Mobile.callTestCase(findTestCase('Categories/Step Definition/User can find the product by category'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
