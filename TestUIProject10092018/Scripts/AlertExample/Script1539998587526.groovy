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

WebUI.openBrowser('http://money.rediff.com/index.html')

WebUI.maximizeWindow()

String windowTitle = WebUI.getWindowTitle()
println "Window tilte is : " + windowTitle

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/RediffObjects/input_rediff_getQuoteButton'))
WebUI.delay(2)

Boolean alertStatus = WebUI.verifyAlertPresent(30)
if(alertStatus) {
	// WebUI.acceptAlert()
	String alertText = WebUI.getAlertText()
	WebUI.verifyMatch("Please enter search keyword", alertText, false)
	if(alertText.equalsIgnoreCase("Please enter search keyword")){
		println("Alert Text is Matching!")
	}
	WebUI.dismissAlert()
	WebUI.verifyAlertNotPresent(10)
}








