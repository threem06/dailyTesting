import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/dailyTesting/1.accountCreation/createAccount')

suiteProperties.put('name', 'createAccount')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\ops.02\\git\\UCF\\Reports\\dailyTesting\\1.accountCreation\\createAccount\\20181114_113937\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/dailyTesting/1.accountCreation/createAccount', suiteProperties, [new TestCaseBinding('Test Cases/dailyTesting/2.login/openBrowserFrontend', 'Test Cases/dailyTesting/2.login/openBrowserFrontend',  null), new TestCaseBinding('Test Cases/dailyTesting/1.accountCreation/signUp', 'Test Cases/dailyTesting/1.accountCreation/signUp',  [ 'email' : 'dailytesting@gmail.com' , 'password' : '123123' , 'username' : 'dailyTest' , 'name' : 'daily' ,  ]), new TestCaseBinding('Test Cases/dailyTesting/2.login/frontendLogin', 'Test Cases/dailyTesting/2.login/frontendLogin',  [ 'password' : '123123' , 'username' : 'dailyTest' ,  ]), new TestCaseBinding('Test Cases/dailyTesting/2.login/backofficeLogin', 'Test Cases/dailyTesting/2.login/backofficeLogin',  null), new TestCaseBinding('Test Cases/dailyTesting/1.accountCreation/playerList', 'Test Cases/dailyTesting/1.accountCreation/playerList',  [ 'username' : 'dailyTest' ,  ])])
