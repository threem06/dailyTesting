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

presentArena = WebUI.verifyElementPresent(findTestObject('dailyTesting/Frontend/Betting/button_DAY'), 3)

presentMatch = WebUI.verifyElementPresent(findTestObject('dailyTesting/Frontend/Betting/button_Place Odd'), 3, FailureHandling.OPTIONAL)

if (presentArena && presentMatch) {
    WebUI.click(findTestObject('dailyTesting/Frontend/Betting/button_Place Odd'))

    WebUI.delay(3)

    WebUI.verifyElementPresent(findTestObject('dailyTesting/Frontend/Betting/input_-_match-384-input'), 3)

    WebUI.setText(findTestObject('dailyTesting/Frontend/Betting/input_-_match-384-input'), '6000')

    WebUI.click(findTestObject('dailyTesting/Frontend/Betting/button_Bet'))

    WebUI.delay(2)
} else {
    WebUI.click(findTestObject('dailyTesting/Frontend/Betting/button_DAY'))

    WebUI.click(findTestObject('dailyTesting/Frontend/Betting/button_Place Odd'))

    WebUI.delay(3)

    WebUI.verifyElementPresent(findTestObject('dailyTesting/Frontend/Betting/input_-_match-384-input'), 3)

    WebUI.setText(findTestObject('dailyTesting/Frontend/Betting/input_-_match-384-input'), '6000')

    WebUI.click(findTestObject('dailyTesting/Frontend/Betting/button_Bet'))

    WebUI.delay(4)
}

