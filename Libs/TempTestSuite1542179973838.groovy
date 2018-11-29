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


suiteProperties.put('id', 'Test Suites/dailyTesting/3.arenaCreation/createArena')

suiteProperties.put('name', 'createArena')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\ops.02\\git\\UCF\\Reports\\dailyTesting\\3.arenaCreation\\createArena\\20181114_151933\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/dailyTesting/3.arenaCreation/createArena', suiteProperties, [new TestCaseBinding('Test Cases/dailyTesting/2.login/backofficeLogin', 'Test Cases/dailyTesting/2.login/backofficeLogin',  null), new TestCaseBinding('Test Cases/dailyTesting/4.arenaCreation/createArena', 'Test Cases/dailyTesting/4.arenaCreation/createArena',  [ 'pendingBetDelay' : '3' , 'eventName' : 'Araw' , 'profitMargin' : '12' , 'acronym' : 'Day' , 'name' : 'DailyTest' , 'videoURL' : 'https://www.youtube.com/watch?v=1SpSfc19qkM' ,  ])])
