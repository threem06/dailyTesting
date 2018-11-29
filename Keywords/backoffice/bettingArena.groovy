package backoffice

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class bettingArena {

	@Keyword
	public void arena(){
		WebUI.focus(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/Header/bettingHeader'))

		WebUI.verifyElementPresent(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/Header/arenaHeader'), 5)

		WebUI.click(findTestObject('dailyTesting/Backoffice/Betting/Arena/arenaCreation/Header/arenaHeader'))
	}
}
