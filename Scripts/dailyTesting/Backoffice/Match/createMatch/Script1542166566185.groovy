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

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/buttonCreateMatch'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/dropdownArenaName'), 3)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/dropdownArenaName'))

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputArenaName'), arenaName)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputArenaName'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputMeronName'), meronName)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputMeronFarm'), meronFarm)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputMeronBreed'), meronBreed)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputMeronWeight'), meronWeight)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputWalaName'), walaName)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputWalaFarm'), walaFarm)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputWalaBreed'), walaBreed)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/inputWalaWeight'), walaWeight)

WebUI.waitForElementPresent(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/buttonSubmit'), 2)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchCreation/buttonSubmit'))

WebUI.delay(3)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/span_Select Arena'))

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaManagement/inputArenaName'), arenaName)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaManagement/inputArenaName'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchDetails/select_ClosedOpenCancelledFini'), 
    'Closed', true)

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/labelMatchNumber'), 
    matchNumber)

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/labelEventName'), 
    eventName)

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/labelProfitMargin'), 
    profitMargin)

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/labelMeronName'), 
    meronName)

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/labelWalaName'), 
    walaName)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/buttonMatchDetails'), 
    3)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Match/matchManagement/matchManagementTable/buttonMatchDetails'))

