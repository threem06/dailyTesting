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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.jndi.toolkit.ctx.Continuation as Continuation
import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementPresent(findTestObject('Backoffice/Betting/Match/Riskmanagement/NextMatch'))

nxtmtch = WebUI.verifyElementPresent(findTestObject('Backoffice/Betting/Match/Riskmanagement/NextMatch'), true, FailureHandling.CONTINUE_ON_FAILURE)

log.logInfo('NEXT MATCH AVAILABLE ' + nxtmtch)

while (nxtmtch.equals('true')) {
    WebUI.waitForElementVisible(findTestObject('Backoffice/Betting/Match/button_OpenMatch'), 5)

    WebUI.click(findTestObject('Backoffice/Betting/Match/button_OpenMatch'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Yes I agree'), 3)

    WebUI.click(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Yes I agree'))

    //open match
    WebUI.delay(10)

    WebUI.click(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Finished'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Yes I agree'), 3)

    WebUI.click(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Yes I agree'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Meron'), 3)

    WebUI.click(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Meron'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Yes I agree'), 3)

    WebUI.click(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Yes I agree'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Approve'), 3)

    WebUI.click(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Approve'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Yes I agree'), 3)

    WebUI.click(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Yes I agree'))

    WebUI.waitForElementPresent(findTestObject('Backoffice/Betting/Match/Riskmanagement/button_Resettle'), 3)

    WebUI.click(findTestObject('Backoffice/Betting/Match/Riskmanagement/NextMatch'))
}

