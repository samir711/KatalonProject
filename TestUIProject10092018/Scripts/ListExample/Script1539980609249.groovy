import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

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

//URL - http://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html

WebUI.openBrowser('http://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html')

WebUI.maximizeWindow()

WebUI.clearText(findTestObject('KatalonTestHTML/input_First name'))

WebUI.setText(findTestObject('KatalonTestHTML/input_First name'), 'Samir')

WebUI.setText(findTestObject('KatalonTestHTML/input_Last name'), 'Arora')

WebUI.click(findTestObject('Object Repository/KatalonTestHTML/input_Male_gender'))

WebUI.setEncryptedText(findTestObject('KatalonTestHTML/input_Password_password'), '5DY8gZA4Qx0K4XArT2uE4A==')

WebUI.selectOptionByIndex(findTestObject('Object Repository/KatalonTestHTML/Select_Role'), 4)

//WebUI.delay(1)
//WebUI.deselectOptionByIndex(findTestObject('Object Repository/KatalonTestHTML/Select_Role'),4)
WebUI.selectOptionByLabel(findTestObject('Object Repository/KatalonTestHTML/Select_Role'), 'QA', false)

int optionCount = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/KatalonTestHTML/Select_Role'))

println('Total number of options ' + optionCount)


for (def index : (0..optionCount -1)) {
	
	println(index)
	WebUI.selectOptionByIndex(findTestObject('Object Repository/KatalonTestHTML/Select_Role'), index)
	String selectedValue = WebUI.getText(findTestObject('Object Repository/KatalonTestHTML/Select_Role'))
	if(selectedValue.equalsIgnoreCase('QA')){
		
	}
}

boolean optionCheck = WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/KatalonTestHTML/Select_Role'), 'QA', false, 20)

if(optionCheck) {
	
	println("Option present in the list")
	
}


WebUI.selectAllOption(findTestObject('Object Repository/KatalonTestHTML/select_JobExpectation'))


WebUI.deselectOptionByIndex(findTestObject('Object Repository/KatalonTestHTML/select_JobExpectation'), 2)

WebUI.setText(findTestObject('Object Repository/KatalonTestHTML/input_Date of birth_dob'), '10/103/2018')
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/KatalonTestHTML/label_Last name'))
//WebUI.sendKeys(findTestObject('Object Repository/KatalonTestHTML/input_Date of birth_dob'), Keys.chord(Keys.ESCAPE))
WebUI.verifyElementChecked(findTestObject('Object Repository/KatalonTestHTML/label_Read books'), 5)







