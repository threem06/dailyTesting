package com.kms.katalon.core.webui.keyword.builtin

import groovy.transform.CompileStatic

import java.text.MessageFormat
import java.util.concurrent.TimeUnit

import org.apache.commons.io.FileUtils
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import org.openqa.selenium.Dimension
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.NoSuchWindowException
import org.openqa.selenium.TimeoutException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebDriverException
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.FluentWait
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.support.ui.Wait
import org.openqa.selenium.support.ui.WebDriverWait

import com.google.common.base.Function
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.annotation.internal.Action
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.keyword.BuiltinKeywords
import com.kms.katalon.core.keyword.internal.KeywordExecutor
import com.kms.katalon.core.keyword.internal.SupportLevel
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.util.internal.ExceptionsUtil
import com.kms.katalon.core.util.internal.PathUtil
import com.kms.katalon.core.webui.common.ScreenUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.constants.StringConstants
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType
import com.kms.katalon.core.webui.exception.BrowserNotOpenedException
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain
import com.kms.katalon.core.webui.util.FileUtil

@Action(value = "verifyOptionNotPresentByLabel")
public class VerifyOptionNotPresentByLabelKeyword extends WebUIAbstractKeyword {

    @CompileStatic
    @Override
    public SupportLevel getSupportLevel(Object ...params) {
        return super.getSupportLevel(params)
    }

    @CompileStatic
    @Override
    public Object execute(Object ...params) {
        TestObject to = getTestObject(params[0])
        String label = (String) params[1]
        boolean isRegex = (boolean) params[2]
        int timeOut = (int) params[3]
        FailureHandling flowControl = (FailureHandling)(params.length > 4 && params[4] instanceof FailureHandling ? params[4] : RunConfiguration.getDefaultFailureHandling())
        return verifyOptionNotPresentByLabel(to,label,isRegex,timeOut,flowControl)
    }

    @CompileStatic
    public boolean verifyOptionNotPresentByLabel(TestObject to, String label, boolean isRegex, int timeOut,
            FailureHandling flowControl) throws StepFailedException {
        String regularExpressionLog = ((isRegex) ? " using regular expression" : "")
        return WebUIKeywordMain.runKeyword({
            boolean isSwitchIntoFrame = false
            int numPresent = 0
            try {
                WebUiCommonHelper.checkTestObjectParameter(to)
                logger.logInfo(StringConstants.KW_LOG_INFO_CHECKING_LBL)
                if (label == null) {
                    throw new IllegalArgumentException(StringConstants.KW_EXC_LBL_CANNOT_BE_NULL)
                }
                isSwitchIntoFrame = WebUiCommonHelper.switchToParentFrame(to, timeOut)
                WebElement webElement = WebUIAbstractKeyword.findWebElement(to, timeOut)
                numPresent = WebUiCommonHelper.getNumberOfOptionByLabel(new Select(webElement), label, isRegex,
                        to.getObjectId())
                if (numPresent == 0) {
                    logger.logPassed(MessageFormat.format(StringConstants.KW_LOG_PASSED_THERE_IS_NO_OPT_W_LBL_X_PRESENT_IN_OBJ_Y, label, to.getObjectId(), regularExpressionLog))
                } else {
                    WebUIKeywordMain.stepFailed(MessageFormat.format(StringConstants.KW_MSG_X_OPTS_W_LBL_Y_PRESENTED_IN_OBJ_Z, numPresent, label, to.getObjectId(), regularExpressionLog),
                            flowControl, null, true)
                }
            } finally {
                if (isSwitchIntoFrame) {
                    WebUiCommonHelper.switchToDefaultContent()
                }
                return numPresent == 0
            }
        }, flowControl, true, (to != null && label != null) ? MessageFormat.format(StringConstants.KW_MSG_CANNOT_VERIFY_OPT_IS_NOT_PRESENT_BY_LBL_X_IN_OBJ_Y, label, to.getObjectId(), regularExpressionLog) : MessageFormat.format(StringConstants.KW_MSG_CANNOT_VERIFY_OPT_IS_NOT_PRESENT_BY_LBL_X, regularExpressionLog))
    }
}
