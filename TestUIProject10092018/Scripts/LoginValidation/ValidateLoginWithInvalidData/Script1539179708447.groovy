import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

KeywordLogger mylogger = new KeywordLogger()

WebUI.openBrowser('http://demoaut.katalon.com/')

WebUI.waitForPageLoad(60)

String appURL = WebUI.getUrl()

println('The app url is : ' + appURL)

WebUI.waitForPageLoad(60)

WebUI.refresh()

WebUI.navigateToUrl('http://google.com')

WebUI.back()

WebUI.waitForPageLoad(60)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'), 30)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Login/p_Please login to make appoint'), 15)

WebUI.verifyTextPresent('Please login to make appointment.', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Login/h2_Login'), 15)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_username'), UserName)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password_password'), Pasword)

String attribValue = WebUI.getAttribute(findTestObject('Page_Login/button_Login'), 'id')

println('The attribute value is : ' + attribValue)

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

typeValue = WebUI.getAttribute(findTestObject('Page_Login/button_Login'), 'type')

println('The attribute value is : ' + typeValue)
if(typeValue.equalsIgnoreCase('sumbit')){
	println('The attribute value is : ' + typeValue)
}

WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)


WebUI.delay(5)

Boolean errorDisplay = WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Login/p_Login failed Please ensure'))

if (errorDisplay) {
    String expMessage = 'Login failed! Please ensure the username and password are valid.'

    String actMessage = WebUI.getText(findTestObject('Object Repository/Page_Login/p_Login failed Please ensure'))

    if (expMessage.equalsIgnoreCase(actMessage)) {
        println('Test is passed')

        mylogger.logInfo('Test is passed')
    } else {
        println('Test is Failed')

        mylogger.logFailed('Test is failed')
    }
}

WebUI.closeBrowser()

