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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'backoffice.bettingMatch.match'()

WebUI.verifyElementPresent(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/buttonMatchDetails'), 3)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/buttonMatchDetails'))

WebUI.switchToWindowTitle('ucf88')

WebUI.verifyElementPresent(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/Limits/inputOddsPip'), 
    3)

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/Limits/inputOddsPip'), '0.02')

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/buttonSave'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/buttonOddsAddMeron'), 
    3)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/buttonOddsAddMeron'))

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/buttonSave'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/oddsMeron'), 
    '0.96')

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/oddsWala'), 
    '0.92')

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/buttonOddsDeductMeron'))

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/buttonSave'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/oddsMeron'), 
    '0.94')

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/oddsWala'), 
    '0.94')

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/buttonOddsAddWala'))

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/buttonSave'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/oddsMeron'), 
    '0.92')

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/oddsWala'), 
    '0.96')

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/buttonOddsDeductWala'))

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/buttonSave'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/oddsMeron'), 
    '0.94')

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/oddsWala'), 
    '0.94')

