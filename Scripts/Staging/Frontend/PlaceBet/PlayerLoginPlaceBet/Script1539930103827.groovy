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

WebUI.navigateToUrl('http://dev.ucf88.com/#/')

WebUI.setText(findTestObject('Object Repository/Frontend/Login/input_Sports_username'), Username)

WebUI.setText(findTestObject('Object Repository/Frontend/Login/input_Sports_password'), Password)

WebUI.click(findTestObject('Object Repository/Frontend/Login/button_Login'))

WebUI.waitForElementPresent(findTestObject('Frontend/Login/span_Logout'), 5)

WebUI.waitForElementPresent(findTestObject('Frontend/MatchBetting/button_Meronodds'), 5)

WebUI.click(findTestObject('Frontend/MatchBetting/button_Meronodds'))

WebUI.verifyElementPresent(findTestObject('Frontend/MatchBetting/span_Possiblewinning'), 5)

WebUI.setText(findTestObject('Frontend/MatchBetting/input_stake'), '100')

WebUI.delay(2)

WebUI.click(findTestObject('Frontend/MatchBetting/button_Bet'))

WebUI.waitForElementPresent(findTestObject('Frontend/MatchBetting/BetslipAdded'), 5)

