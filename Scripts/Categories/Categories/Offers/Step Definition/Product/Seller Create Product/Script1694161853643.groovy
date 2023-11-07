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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey

Mobile.waitForElementPresent(findTestObject('Offers/Product/btnTambahProduk'), 3)

Mobile.tap(findTestObject('Offers/Product/btnTambahProduk'), 0)

Mobile.verifyElementVisible(findTestObject('Offers/Product/fieldNamaProduk'), 0)

Mobile.setText(findTestObject('Offers/Product/fieldNamaProduk'), 'FunkoPOP! Deadpool', 0)

Mobile.setText(findTestObject('Offers/Product/fieldHargaProduk'), '275000', 0)

Mobile.tap(findTestObject('Offers/Product/dropdownKategoriProduct'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN))

driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN))

driver.pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.waitForElementPresent(findTestObject('Offers/Product/selectedCategoriesProduct'), 3)

Mobile.setText(findTestObject('Offers/Product/fieldLokasiProduk'), 'Solo', 0)

Mobile.setText(findTestObject('Offers/Product/fieldDeskripsiProduk'), 'Funko POP! MARVEL DEADPOOL', 0)

Mobile.tap(findTestObject('Offers/Product/btnFotoProduk'), 0)

Mobile.tap(findTestObject('Offers/Product/btnGaleriProduk'), 0)

Mobile.tap(findTestObject('Offers/Product/selectedImage'), 0)

Mobile.tap(findTestObject('Offers/Product/btnTerbitkanProduk'), 0)

