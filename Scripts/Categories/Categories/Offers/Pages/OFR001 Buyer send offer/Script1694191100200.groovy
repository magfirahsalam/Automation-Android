import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Start Application'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Login as Buyer'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Buyer/01 User search desired product'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Buyer/02 User select desired product'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Buyer/03 User tap tertarik button'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Buyer/04 User input harga tawar'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Buyer/05 User tap kirim button to send offer'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Offers/Step Definition/Offers/Buyer/06 Verify offer is sent awaiting seller respond'), 
    [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Offers/Step Definition/Login/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

