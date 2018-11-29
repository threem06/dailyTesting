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

WebUI.waitForElementVisible(findTestObject('dailyTesting/Frontend/SignUp/spanSignUp'), 3)

WebUI.click(findTestObject('dailyTesting/Frontend/SignUp/spanSignUp'))

WebUI.setText(findTestObject('dailyTesting/Frontend/SignUp/inputUsername'), username)

WebUI.setText(findTestObject('dailyTesting/Frontend/SignUp/inputEmail'), email)

WebUI.setText(findTestObject('dailyTesting/Frontend/SignUp/inputName'), name)

WebUI.setText(findTestObject('dailyTesting/Frontend/SignUp/inputPassword'), password)

WebUI.click(findTestObject('dailyTesting/Frontend/SignUp/buttonSignUp'))

WebUI.delay(3)

