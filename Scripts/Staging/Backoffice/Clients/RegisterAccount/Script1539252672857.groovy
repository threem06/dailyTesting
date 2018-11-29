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

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl('http://dev-admin.ucf88.com/login')
//
//WebUI.setText(findTestObject('Backoffice/Login/input_Username'), 'admin')
//
//WebUI.setEncryptedText(findTestObject('Backoffice/Login/input_Password'), 'SFTQUhjBfIY=')
//
//WebUI.click(findTestObject('Backoffice/Login/button_Login'))
//
//WebUI.waitForElementVisible(findTestObject('Backoffice/Login/adminuser'), 5)
WebUI.focus(findTestObject('Backoffice/Clients/Clients'))

WebUI.verifyElementPresent(findTestObject('Backoffice/Clients/Client Registration'), 5)

WebUI.click(findTestObject('Backoffice/Clients/Client Registration'))

WebUI.setText(findTestObject('Backoffice/Clients/Registration/input_username'), Username)

WebUI.setText(findTestObject('Backoffice/Clients/Registration/input_password'), '123123')

WebUI.setText(findTestObject('Backoffice/Clients/Registration/input_confirmp'), '123123')

WebUI.selectOptionByValue(findTestObject('Backoffice/Clients/Registration/select_operatorcode'), 'test', false)

WebUI.selectOptionByValue(findTestObject('Backoffice/Clients/Registration/select_status'), '1', false)

WebUI.delay(2)

WebUI.click(findTestObject('Backoffice/Clients/Registration/button_Submit'))

WebUI.delay(2)

