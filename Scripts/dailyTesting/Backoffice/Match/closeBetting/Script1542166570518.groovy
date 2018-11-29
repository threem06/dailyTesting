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

CustomKeywords.'backoffice.bettingMatch.match'()

WebUI.selectOptionByLabel(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchDetails/select_ClosedOpenCancelledFini'), 
    'Open', true)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/buttonMatchDetails'), 3)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/buttonMatchDetails'))

WebUI.switchToWindowTitle('ucf88')

WebUI.verifyElementPresent(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/matchStatus/button_Closed'), 
    3)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/matchStatus/button_Closed'))

WebUI.delay(2)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/matchStatus/buttonYes'))

