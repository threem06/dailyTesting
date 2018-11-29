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

@Action(value = "switchToWindowTitle")
public class SwitchToWindowTitleKeyword extends WebUIAbstractKeyword {

    @CompileStatic
    @Override
    public SupportLevel getSupportLevel(Object ...params) {
        return super.getSupportLevel(params)
    }

    @CompileStatic
    @Override
    public Object execute(Object ...params) {
        String title = (String) params[0]
        FailureHandling flowControl = (FailureHandling)(params.length > 1 && params[1] instanceof FailureHandling ? params[1] : RunConfiguration.getDefaultFailureHandling())
        switchToWindowTitle(title,flowControl)
    }

    @CompileStatic
    public void switchToWindowTitle(String title, FailureHandling flowControl) throws StepFailedException {
        WebUIKeywordMain.runKeyword({
            logger.logInfo(StringConstants.KW_LOG_INFO_CHECKING_TITLE)
            if (title == null) {
                throw new IllegalArgumentException(StringConstants.KW_EXC_TITLE_IS_NULL)
            }
            logger.logInfo(MessageFormat.format(StringConstants.KW_LOG_INFO_SWITCHING_TO_WINDOW_W_TITLE_X, title))
            boolean switched = WebUiCommonHelper.switchToWindowUsingTitle(DriverFactory.getWebDriver(), title, RunConfiguration.getTimeOut())
            if (switched) {
                logger.logPassed(MessageFormat.format(StringConstants.KW_LOG_PASSED_SWITCHED_TO_WINDOW_W_TITLE_X, title))
            } else {
                WebUIKeywordMain.stepFailed(MessageFormat.format(StringConstants.KW_MSG_CANNOT_FIND_WINDOW_W_TITLE_X, title), flowControl, null, true)
            }
        }, flowControl, true, (title != null) ? MessageFormat.format(StringConstants.KW_MSG_CANNOT_SWITCH_TO_WINDOW_W_TITLE_X, title) : StringConstants.KW_MSG_CANNOT_SWITCH_TO_WINDOW_TITLE)
    }
}
