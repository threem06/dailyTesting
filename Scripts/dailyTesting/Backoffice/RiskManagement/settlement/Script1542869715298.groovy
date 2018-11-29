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

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/span_Select Arena'))

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputArenaName'), arenaName)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputArenaName'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchDetails/select_ClosedOpenCancelledFini'), 
    'Open', true)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/buttonMatchDetails'), 3)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/buttonMatchDetails'))

WebUI.switchToWindowTitle('ucf88')

WebUI.verifyElementPresent(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/matchStatus/button_Finished'), 
    3)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/matchStatus/button_Finished'))

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/matchStatus/buttonYes'))

WebUI.delay(3)

if (Result == 'Meron') {
    WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/result/button_Meron'))

    WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/matchStatus/buttonYes'))
} else if (Result == 'Draw') {
    WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/result/button_Draw'))

    WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/matchStatus/buttonYes'))
} else if (Result == 'FTD') {
    WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/result/button_FTD'))

    WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/matchStatus/buttonYes'))
} else if (Result == 'Wala') {
    WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/result/button_Wala'))

    WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/matchStatus/buttonYes'))
} else {
    WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/result/button_Cancel'))

    WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/matchStatus/buttonYes'))
}

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/confirmResult/button_Approve'), 
    3)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/confirmResult/button_Approve'))

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/matchStatus/buttonYes'))

WebUI.delay(3)

