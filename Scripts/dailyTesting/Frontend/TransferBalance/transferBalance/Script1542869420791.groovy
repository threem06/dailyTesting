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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

WebUI.verifyElementPresent(findTestObject('dailyTesting/Frontend/TransferBalance/buttonTransferBalance'), 3)

WebUI.click(findTestObject('dailyTesting/Frontend/TransferBalance/buttonTransferBalance'))

WebUI.setText(findTestObject('dailyTesting/Frontend/TransferBalance/inputBalance'), transferBalance,FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

balance = transferBalance

log.logInfo('USERS BALANCE ' + balance)

int balance

if (balance <= 10000) {
    WebUI.click(findTestObject('dailyTesting/Frontend/TransferBalance/buttonTransfer'))

    WebUI.verifyElementPresent(findTestObject('dailyTesting/Frontend/TransferBalance/labelAlertSuccess'), 2)

    WebUI.click(findTestObject('dailyTesting/Frontend/TransferBalance/buttonClose'))
} else {
    System.out.println('No balance has been transferred.')
}

