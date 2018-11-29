import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.focus(findTestObject('Backoffice/Reports/Bet Report/Reports_header'))

WebUI.click(findTestObject('Backoffice/Reports/Client Report/Client_Report_header'))

WebUI.click(findTestObject('Backoffice/Reports/Client Report/button_generate'))

WebUI.delay(4)

WebUI.setText(findTestObject('Backoffice/Reports/Client Report/input_Date_reportDate'), date)

WebUI.delay(3)

WebUI.submit(findTestObject('Backoffice/Reports/Client Report/form_Generate Data'))

WebUI.delay(3)

WebUI.setText(findTestObject('Backoffice/Reports/Client Report/input_playerId'), ClientID)

WebUI.delay(3)

WebUI.setText(findTestObject('Backoffice/Reports/Client Report/input_clientName'), PlayerName)

WebUI.click(findTestObject('Backoffice/Reports/Client Report/button_search'))

WebUI.delay(3)

WebUI.verifyTextPresent(LastLoginIp, false)

