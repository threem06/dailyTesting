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

CustomKeywords.'backoffice.bettingArena.arena'()

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/buttonCreateArena'))

WebUI.getWindowIndex()

WebUI.waitForElementVisible(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputName'), 5)

WebUI.switchToWindowIndex(0)

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputName'), name)

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputEventName'), eventName)

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputAcronym'), acronym)

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputVideoUrl'), videoURL)

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputProfitMargin'), profitMargin)

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/inputPendingBetDelay'), pendingBetDelay)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaCreation/buttonSubmit'))

WebUI.delay(2)

WebUI.refresh()

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaManagement/dropdownArenaName'))

WebUI.setText(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaManagement/inputArenaName'), name)

WebUI.sendKeys(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaManagement/inputArenaName'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaManagement/buttonSearch'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/arenaManagement/labelArenaName'), name)


