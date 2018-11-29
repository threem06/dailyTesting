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

WebUI.focus(findTestObject('Backoffice/Reports/Bet Report/Reports_header'))

WebUI.click(findTestObject('Backoffice/Reports/Bet Report/Bet_Report_header'))

WebUI.click(findTestObject('Backoffice/Reports/Bet Report/input_datefilter'))

WebUI.click(findTestObject('Backoffice/Reports/Bet Report/button_Today'))

WebUI.delay(3)

WebUI.setText(findTestObject('Backoffice/Reports/Bet Report/input_playerId'), ClientID)

WebUI.setText(findTestObject('Backoffice/Reports/Bet Report/input_clientName'), PlayerName)

WebUI.delay(3)

WebUI.click(findTestObject('Backoffice/Reports/Bet Report/button_search'))

WebUI.verifyTextPresent(Selection, false)

WebUI.delay(5)

WebUI.verifyTextPresent(Odds, false)

WebUI.verifyTextPresent(Stake, false)

WebUI.verifyTextPresent(PotentialWinning, false)

WebUI.verifyTextPresent(ArenaAcronym, false)

WebUI.verifyTextPresent(EventName, false)

WebUI.verifyTextPresent(MeronVsWala, false)

WebUI.closeBrowser()

