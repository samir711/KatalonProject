import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.openBrowser('https://anyaut.com/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

//WebUI.waitForImagePresent(findTestObject('AnyAut/Page_anyAUT - AUTOMATE ANY APPLICAT/img'), 5)
WebUI.waitForElementPresent(findTestObject('AnyAut/Page_anyAUT - AUTOMATE ANY APPLICAT/img'), 20)

WebUI.click(findTestObject('AnyAut/Page_anyAUT - AUTOMATE ANY APPLICAT/a_Login'))

// WebUI.switchToWindowIndex(1)
WebUI.waitForPageLoad(30)

WebUI.switchToWindowUrl('https://anyaut.com/orange/')

String title = WebUI.getWindowTitle()

println(title)

WebUI.verifyTextPresent('Sign In', false)

WebUI.setText(findTestObject('AnyAut/Page_Login  AnyAut/input_Username_login_username'), 'samirdoc1@gmail.com')

WebUI.switchToWindowIndex(0)

WebUI.closeWindowIndex(1)

