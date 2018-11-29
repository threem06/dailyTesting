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

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl('http://dev-admin.ucf88.com/login')
//
//WebUI.setText(findTestObject('Backoffice/Login/input_Username'), 'admin')
//
//WebUI.setEncryptedText(findTestObject('Backoffice/Login/input_Password'), 'SFTQUhjBfIY=')
//
//WebUI.click(findTestObject('Backoffice/Login/button_Login'))
//
//WebUI.waitForElementVisible(findTestObject('Backoffice/Login/adminuser'), 5)
WebUI.focus(findTestObject('Backoffice/Betting/Betting_header'))

WebUI.verifyElementPresent(findTestObject('Backoffice/Betting/Arena_header'), 5)

WebUI.click(findTestObject('Backoffice/Betting/Arena_header'))

WebUI.click(findTestObject('Backoffice/Betting/Arena/button_Create_arena'))

WebUI.getWindowIndex()

WebUI.waitForElementVisible(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputEventName'), 5)

WebUI.switchToWindowIndex(0)

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputName'), Name)

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputEventName'), EventName)

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputAcronym'), Acronym)

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputVideoUrl'), Videourl)

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputProfitMargin'), Profitm)

WebUI.sendKeys(findTestObject('Backoffice/Betting/Arena/Create_arena/input_max_market'), MaxMarket)

WebUI.sendKeys(findTestObject('Backoffice/Betting/Arena/Create_arena/input_min_single'), MinSingleBet)

WebUI.sendKeys(findTestObject('Backoffice/Betting/Arena/Create_arena/input_max_single'), MaxSingleBet)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputPendingBetDelay'), PendingDelay)

WebUI.click(findTestObject('Backoffice/Betting/Arena/Create_arena/add_arena'))

WebUI.delay(2)

