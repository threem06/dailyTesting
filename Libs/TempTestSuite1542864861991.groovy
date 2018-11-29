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


suiteProperties.put('id', 'Test Suites/dailyTesting/5.matchCreation/createMatch')

suiteProperties.put('name', 'createMatch')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\ops.02\\git\\UCF\\Reports\\dailyTesting\\5.matchCreation\\createMatch\\20181122_133421\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/dailyTesting/5.matchCreation/createMatch', suiteProperties, [new TestCaseBinding('Test Cases/dailyTesting/2.login/backofficeLogin', 'Test Cases/dailyTesting/2.login/backofficeLogin',  null), new TestCaseBinding('Test Cases/dailyTesting/5.matchCreation/createMatch', 'Test Cases/dailyTesting/5.matchCreation/createMatch',  [ 'eventName' : 'Araw' , 'walaBreed' : 'breed' , 'matchNumber' : '1' , 'profitMargin' : '12.00' , 'walaName' : 'game2' , 'meronWeight' : '20' , 'meronName' : 'match2' , 'walaFarm' : 'farm' , 'walaWeight' : '12' , 'arenaName' : 'DailyTest' , 'meronFarm' : 'farmer' , 'meronBreed' : 'breeder' ,  ])])
