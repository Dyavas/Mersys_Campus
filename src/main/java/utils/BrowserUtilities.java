package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtilities {

    // todo Standart Bekleme Metodu
    public static void waitFor(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // todo Click Metodu Javascript ile
    public static void clickWithJs(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    // todo Element görünür olana kadar bekleme metodu
    public static WebElement waitForVisible(WebElement webElement, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    // todo Element clicklenebilir olana kadar bekle metodu
    public static WebElement waitForClickability(WebElement webElement, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        return wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    //todo Sayfa yüklenene kadar bekle metodu
    public static void waitForPageLoad(long timeOutInSec) {
        ExpectedCondition<Boolean> expectation = webDriver -> {
            assert Driver.getDriver() != null;
            return ((JavascriptExecutor) Driver.getDriver()).executeScript("return document.readyState").equals("complete");
        };
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeOutInSec));
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }

}
