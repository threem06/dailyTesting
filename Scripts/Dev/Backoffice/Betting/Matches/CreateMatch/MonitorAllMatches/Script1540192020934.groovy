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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://dev-admin.ucf88.com')

WebUI.setText(findTestObject('Backoffice/Login/input_Username'), 'admin')

WebUI.setEncryptedText(findTestObject('Backoffice/Login/input_Password'), 'SFTQUhjBfIY=')

WebUI.click(findTestObject('Backoffice/Login/button_Login'))

WebUI.waitForElementVisible(findTestObject('Backoffice/Login/adminuser'), 5)

WebUI.focus(findTestObject('Backoffice/Betting/Betting_header'))

WebUI.click(findTestObject('Backoffice/Betting/Arena_header'))

WebUI.delay(1)

myMatchObject = new TestObject('customObject2')

List<TestObjectProperty> properties = new ArrayList<TestObjectProperty>()

properties.add(new TestObjectProperty('tag', ConditionType.EQUALS, 'a'))

properties.add(new TestObjectProperty('text', ConditionType.CONTAINS, 'SAN ROQUE COCKPIT(CAMARINES NORTE)'))

myMatchObject.setProperties(properties)

WebUI.click(myMatchObject)

WebUI.click(findTestObject('Backoffice/Betting/Arena/Match1'))

WebUI.switchToWindowIndex(1)

