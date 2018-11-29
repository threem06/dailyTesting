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


suiteProperties.put('id', 'Test Suites/dailyTesting/6.betting/submitOneBet')

suiteProperties.put('name', 'submitOneBet')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\ops.02\\git\\UCF\\Reports\\dailyTesting\\6.betting\\submitOneBet\\20181122_132942\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/dailyTesting/6.betting/submitOneBet', suiteProperties, [new TestCaseBinding('Test Cases/dailyTesting/2.login/backofficeLogin', 'Test Cases/dailyTesting/2.login/backofficeLogin',  null), new TestCaseBinding('Test Cases/dailyTesting/6.betting/openBetting', 'Test Cases/dailyTesting/6.betting/openBetting',  [ 'arenaName' : 'DailyTest' ,  ]), new TestCaseBinding('Test Cases/dailyTesting/2.login/openBrowserFrontend', 'Test Cases/dailyTesting/2.login/openBrowserFrontend',  null), new TestCaseBinding('Test Cases/dailyTesting/2.login/frontendLogin', 'Test Cases/dailyTesting/2.login/frontendLogin',  [ 'password' : '123123' , 'username' : 'testDaily' ,  ]), new TestCaseBinding('Test Cases/dailyTesting/6.betting/submitBet', 'Test Cases/dailyTesting/6.betting/submitBet',  [ 'acronym' : 'Day' ,  ]), new TestCaseBinding('Test Cases/dailyTesting/6.betting/statement', 'Test Cases/dailyTesting/6.betting/statement',  [ 'betAmount' : '150.00' , 'balBefore' : '19,100.00' , 'balAfter' : '18,950.00' ,  ])])
