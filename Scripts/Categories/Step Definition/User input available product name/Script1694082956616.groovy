import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.tap(findTestObject('Categories/fieldsearch'), 5)

Mobile.setText(findTestObject('Categories/fieldsearch'), availableproduct, 15)


Mobile.waitForElementPresent(findTestObject('Categories/btnProductTyped'), 10)

Mobile.tap(findTestObject('Categories/btnProductTyped'), 5)

