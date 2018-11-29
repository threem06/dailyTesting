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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://dev-operator.ucf88.com/#/')

WebUI.setText(findTestObject('Frontend/Login/OperatorFrontendLogin/input_Login_username'), 'blaze06')

WebUI.setEncryptedText(findTestObject('Frontend/Login/OperatorFrontendLogin/input_Login_password'), 'CSt51UwWECc=')

WebUI.delay(2)

WebUI.click(findTestObject('Frontend/Login/OperatorFrontendLogin/button_Login'))

WebUI.waitForElementPresent(findTestObject('Frontend/Login/OperatorFrontendLogin/username'), 3)

