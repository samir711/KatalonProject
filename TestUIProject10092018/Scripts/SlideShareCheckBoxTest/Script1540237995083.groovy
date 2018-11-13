import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://slideshare.net/')
WebUI.waitForPageLoad(30)
WebUI.maximizeWindow()
WebUI.waitForPageLoad(30)
WebUI.click(findTestObject('Object Repository/SlideShareRepo/a_Login'))
WebUI.setText(findTestObject('Object Repository/SlideShareRepo/input_slideshare_username'), "samirdoc1")
WebUI.setText(findTestObject('Object Repository/SlideShareRepo/input_slideshare_password'), "vijay1980")
WebUI.delay(5)
WebUI.uncheck(findTestObject('Object Repository/SlideShareRepo/input_slideshare_checkbox'))

WebUI.delay(2)
WebUI.check(findTestObject('Object Repository/SlideShareRepo/input_slideshare_checkbox'))
Boolean chkBoxStatus = WebUI.verifyElementChecked(findTestObject('Object Repository/SlideShareRepo/input_slideshare_checkbox'), 10)

if(chkBoxStatus) {
	println("Check box is selected.")
}

