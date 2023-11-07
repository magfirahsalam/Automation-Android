import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.Duration as Duration
import com.kms.katalon.core.appium.driver.SwipeableAndroidDriver as SwipeableAndroidDriver
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.touch.WaitOptions as WaitOptions
import io.appium.java_client.touch.offset.PointOption as PointOption

Mobile.tap(findTestObject('Categories/btnPilihCategory'), 5)

Mobile.waitForElementPresent(findTestObject('Categories/cardProductbyCategory'), 3)

Mobile.tap(findTestObject('Categories/cardProductbyCategory'), 3)

Mobile.waitForElementPresent(findTestObject('Categories/btnBid'), 7)

