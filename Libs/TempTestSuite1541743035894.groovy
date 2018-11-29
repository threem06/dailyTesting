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


suiteProperties.put('id', 'Test Suites/dailyTesting/betting/testing')

suiteProperties.put('name', 'testing')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\ops.02\\git\\UCF\\Reports\\dailyTesting\\betting\\testing\\20181109_135715\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/dailyTesting/betting/testing', suiteProperties, [new TestCaseBinding('Test Cases/dailyTesting/login/backofficeLogin', 'Test Cases/dailyTesting/login/backofficeLogin',  null), new TestCaseBinding('Test Cases/dailyTesting/arenaCreation/createArena - Iteration 1', 'Test Cases/dailyTesting/arenaCreation/createArena',  [ 'pendingBetDelay' : '3' , 'eventName' : 'Tournament' , 'profitMargin' : '12' , 'acronym' : 'QZ' , 'name' : 'Quezon' , 'videoURL' : 'https://www.youtube.com/watch?v=1SpSfc19qkM' ,  ]), new TestCaseBinding('Test Cases/dailyTesting/arenaCreation/createArena - Iteration 2', 'Test Cases/dailyTesting/arenaCreation/createArena',  [ 'pendingBetDelay' : '3' , 'eventName' : 'Championship' , 'profitMargin' : '20' , 'acronym' : 'PY' , 'name' : 'Pasay' , 'videoURL' : 'https://www.youtube.com/watch?v=f5ng2sb-CBo' ,  ]), new TestCaseBinding('Test Cases/dailyTesting/arenaCreation/createArena - Iteration 3', 'Test Cases/dailyTesting/arenaCreation/createArena',  [ 'pendingBetDelay' : '3' , 'eventName' : 'WinLose' , 'profitMargin' : '15' , 'acronym' : 'PG' , 'name' : 'Pasig' , 'videoURL' : 'https://www.youtube.com/watch?v=7G9arHa4zcc' ,  ]), new TestCaseBinding('Test Cases/dailyTesting/arenaCreation/createArena - Iteration 4', 'Test Cases/dailyTesting/arenaCreation/createArena',  [ 'pendingBetDelay' : '3' , 'eventName' : 'WinWin' , 'profitMargin' : '10' , 'acronym' : 'SJ' , 'name' : 'San Juan' , 'videoURL' : 'https://www.youtube.com/watch?v=pjmGk9_rdpI' ,  ])])
