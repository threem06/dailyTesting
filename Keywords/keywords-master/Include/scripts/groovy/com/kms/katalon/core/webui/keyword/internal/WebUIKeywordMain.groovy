package com.kms.katalon.core.webui.keyword.internal;

import groovy.transform.CompileStatic

import org.openqa.selenium.TimeoutException

import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.keyword.internal.KeywordMain
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.internal.ExceptionsUtil
import com.kms.katalon.core.webui.driver.DriverFactory;
import com.kms.katalon.core.webui.helper.screenshot.WebUIScreenCaptor

public class WebUIKeywordMain {

    private static final String TIMED_OUT_WAITING_FOR_PAGE_LOAD = "Timed out waiting for page load."

    @CompileStatic
    public static runKeyword(Closure closure, FailureHandling flowControl, boolean takeScreenShot, String errorMessage) {
        try {
            return closure.call();
        } catch (Throwable e) {
            if (isPageLoadTimeoutException(e) && DriverFactory.isEnablePageLoadTimeout() && DriverFactory.isIgnorePageLoadTimeoutException()) {
                stepFailed(errorMessage, FailureHandling.OPTIONAL, ExceptionsUtil.getMessageForThrowable(e), takeScreenShot);
                return;
            }
            stepFailed(errorMessage, flowControl, ExceptionsUtil.getMessageForThrowable(e), takeScreenShot);
        }
    }
    
    @CompileStatic
    public static runKeyword(Closure closure, Closure failedClosure, FailureHandling flowControl, boolean takeScreenShot, String errorMessage) {
        try {
            return closure.call();
        } catch (Throwable e) {
            if (isPageLoadTimeoutException(e) && DriverFactory.isEnablePageLoadTimeout() && DriverFactory.isIgnorePageLoadTimeoutException()) {
                stepFailed(errorMessage, FailureHandling.OPTIONAL, ExceptionsUtil.getMessageForThrowable(e), takeScreenShot);
                if (failedClosure != null) {
                    return failedClosure
                }
                return
            }
            stepFailed(errorMessage, flowControl, ExceptionsUtil.getMessageForThrowable(e), takeScreenShot);
        }
    }
    
    // Add this for keywords that need to return int, as Groovy cannot automatically convert null to int
    @CompileStatic
    public static int runKeywordAndReturnInt(Closure closure, FailureHandling flowControl, boolean takeScreenShot, String errorMessage) {
        try {
            return (int) closure.call();
        } catch (Throwable e) {
            if (isPageLoadTimeoutException(e) && DriverFactory.isEnablePageLoadTimeout() && DriverFactory.isIgnorePageLoadTimeoutException()) {
                stepFailed(errorMessage, FailureHandling.OPTIONAL, ExceptionsUtil.getMessageForThrowable(e), takeScreenShot);
                return -1;
            }
            stepFailed(errorMessage, flowControl, ExceptionsUtil.getMessageForThrowable(e), takeScreenShot);
        }
        return -1;
    }

    @CompileStatic
    public static stepFailed(String message, FailureHandling flHandling, String reason, boolean takeScreenShot)
            throws StepFailedException {
        KeywordMain.stepFailed(message, flHandling, reason, new WebUIScreenCaptor().takeScreenshotAndGetAttributes(takeScreenShot));
    }
           
    @CompileStatic
    private static boolean isPageLoadTimeoutException(Throwable e) {
        return (e instanceof TimeoutException) && (e.getMessage().startsWith(TIMED_OUT_WAITING_FOR_PAGE_LOAD));
    }
}
