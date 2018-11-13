package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object UserName
     
    /**
     * <p>Profile default : password</p>
     */
    public static Object Password
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['UserName' : 'Samir', 'Password' : 'password'])
        allVariables.put('QA', allVariables['default'] + ['UserName' : 'Shanker', 'Password' : 'Password@@'])
        allVariables.put('UAT', allVariables['default'] + ['Password' : 'vijay1980'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        UserName = selectedVariables['UserName']
        Password = selectedVariables['Password']
        
    }
}
