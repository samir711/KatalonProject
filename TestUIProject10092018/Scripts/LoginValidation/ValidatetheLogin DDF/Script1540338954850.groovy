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

WebUI.openBrowser('http://demoaut.katalon.com/', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Login/p_Please login to make appoint'), 15)

WebUI.verifyTextPresent('Please login to make appointment.', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Login/h2_Login'), 15)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_username'), UsrName)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password_password'), Passwrod)

//WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_username'), GlobalVariable.UserName)
//
//WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password_password'), GlobalVariable.Password)
WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)

WebUI.delay(2)

WebUI.closeBrowser()

