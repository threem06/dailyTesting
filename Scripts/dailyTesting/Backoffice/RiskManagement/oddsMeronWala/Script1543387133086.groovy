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

CustomKeywords.'backoffice.backofficeLogin.backofficelogin'()

CustomKeywords.'backoffice.bettingMatch.match'()

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/span_Select Arena'))

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputArenaName'), arenaName)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputArenaName'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/buttonMatchDetails'), 
    3)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/buttonMatchDetails'))

WebUI.switchToWindowTitle('ucf88')

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/oddsMeron'), 
    oddsM)

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/riskManagement/riskManagementTable/oddsWala'), 
    oddsW)

