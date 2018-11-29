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
import com.sun.jndi.toolkit.ctx.Continuation as Continuation
import internal.GlobalVariable as GlobalVariable

WebUI.focus(findTestObject('Backoffice/Betting/Betting_header'))

WebUI.click(findTestObject('Backoffice/Betting/Match_header'))

WebUI.click(findTestObject('Backoffice/Betting/Match/Create_match/button_Create Match'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Backoffice/Betting/Match/Create_match/Pop up Add match/select_arena'), 3)

WebUI.selectOptionByLabel(findTestObject('Backoffice/Betting/Match/Create_match/Pop up Add match/select_arena'), 'CVCC3 - 10', 
    false)

WebUI.sendKeys(findTestObject('Backoffice/Betting/Match/Create_match/Pop up Add match/input_Event Name_match_name'), MatchEventName)

WebUI.sendKeys(findTestObject('Backoffice/Betting/Match/Create_match/Pop up Add match/input_Profit Margin ()_match_p'), 
    MatchProfitM)

WebUI.sendKeys(findTestObject('Backoffice/Betting/Match/Create_match/Pop up Add match/input_Name_banker_name'), MeronName)

WebUI.sendKeys(findTestObject('Backoffice/Betting/Match/Create_match/Pop up Add match/input_Name_player_name'), WalaName)

WebUI.delay(3)

WebUI.click(findTestObject('Backoffice/Betting/Match/Create_match/Pop up Add match/input_Close_add_match'))

WebUI.waitForElementVisible(findTestObject('Backoffice/Betting/Match/span_Clickmatch'), 5)

WebUI.click(findTestObject('Backoffice/Betting/Match/span_Clickmatch'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Backoffice/Betting/Match/button_OpenMatch'), 5)

WebUI.click(findTestObject('Backoffice/Betting/Match/button_OpenMatch'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Yes I agree'), 3)

WebUI.click(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Yes I agree'))

WebUI.delay(2)

WebUI.closeWindowIndex(1)

WebUI.delay(2)

WebUI.switchToWindowIndex(0)

