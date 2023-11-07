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

Mobile.startApplication('D:\\secondhandapps\\Apk\\secondhand-24082023.apk', false)

Mobile.verifyElementVisible(findTestObject('Profile/btnakun'), 3)

Mobile.tap(findTestObject('Profile/btnakun'), 3)

Mobile.verifyElementVisible(findTestObject('login/btnmasuk'), 3)

Mobile.tap(findTestObject('login/btnmasuk'), 3)

Mobile.verifyElementVisible(findTestObject('login/btnemail'), 3)

Mobile.setText(findTestObject('login/btnemail'), 'revimarhaendra22@gmail.com', 3)

Mobile.verifyElementVisible(findTestObject('login/btnpassword'), 3)

Mobile.setText(findTestObject('login/btnpassword'), 'Revivengeance020797', 3)

Mobile.tap(findTestObject('login/btnlogin'), 3)

