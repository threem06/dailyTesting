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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://staging.ucf88.com/#/')

WebUI.setText(findTestObject('Object Repository/Frontend/Login/input_Sports_username'), Username)

WebUI.setText(findTestObject('Object Repository/Frontend/Login/input_Sports_password'), Password)

WebUI.click(findTestObject('Object Repository/Frontend/Login/button_Login'))

WebUI.waitForElementPresent(findTestObject('Frontend/Login/span_Logout'), 5)

meron = findTestObject('Frontend/MatchBetting/button_Meronodds')

//draw = findTestObject('Frontend/MatchBetting/button_Drawodds')

//ftd = findTestObject('Frontend/MatchBetting/button_FTDodds')

wala = findTestObject('Frontend/MatchBetting/button_Walaodds')

WebUI.waitForElementClickable(meron, 99999999, FailureHandling.CONTINUE_ON_FAILURE)

String balance = WebUI.getText(findTestObject('Frontend/MatchBetting/Balance'), FailureHandling.CONTINUE_ON_FAILURE)

log.logInfo('User balance ' + balance)

while (balance != 0) {
    log.logInfo('User balance ' + balance)

    List<String> odds = new ArrayList()

    odds.addAll(Arrays.asList(meron, wala))

    Random rand = new Random()

    int randodds = rand.nextInt(odds.size())

    log.logInfo(' meron[0] draw[1] ftd[2] wala[3] ::' + randodds)

    log.logInfo('Odds Selected = ' + odds.get(randodds))
	
	WebUI.waitForElementClickable(meron, 99999999, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(odds.get(randodds))

    WebUI.verifyElementPresent(findTestObject('Frontend/MatchBetting/span_Possiblewinning'), 5, FailureHandling.CONTINUE_ON_FAILURE)

    int RA

    RA = ((Math.random() * 20) as int)

    log.logInfo('Random amount = ' + RA)
	
	WebUI.waitForElementClickable(meron, 99999999, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Frontend/MatchBetting/input_stake'), RA + '00', FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2)
	
	WebUI.waitForElementClickable(meron, 99999999, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Frontend/MatchBetting/button_Bet'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementPresent(findTestObject('Frontend/MatchBetting/BetslipAdded'), 5, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(3)
}

WebUI.acceptAlert()

