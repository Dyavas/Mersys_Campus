package utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

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
//Zehra
    /**
     * given menu name user can navigate the admin menu
     *
     * @param menu
     */
    public static void adminMenuNavigate(String menu, String tabName) {
        Driver.getDriver().findElement(By.xpath("//*[@class='username mr-12']")).click();
        Driver.getDriver().findElement(By.xpath("//span[normalize-space()='" + menu + "']")).click();
        //BrowserUtils.clickWithJS(Driver.getDriver().findElement(By.xpath("//input[@id='mat-radio-19-input']")));


    }

    /**
     * (//*[@class='ng-tns-c189-42']//..//input)[2]
     * given language name user can switch the language
     *
     * @param lang
     */
    public static void changeLanguage(String lang) {
        Driver.getDriver().findElement(By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger language-button mat-button mat-button-base ng-star-inserted']")).click();
        Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + lang + "')]")).click();
        //BrowserUtils.clickWithJS(Driver.getDriver().findElement(By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger language-button mat-button mat-button-base ng-star-inserted']")));

    }


    /**
     * user can navigate modul and tab modul by giving its names as parameters
     *
     * @param modulName
     * @param tabModul
     */
    public static void navigateTo(String modulName, String tabModul)  {
        // BrowserUtils.waitForClickablility(Driver.getDriver().findElement(By.xpath("//input[@id='mat-radio-19-input']")),2);

        clickWithJs(Driver.getDriver().findElement(By.xpath("(//label[@class='mat-radio-label'])[2]")));
        // Driver.getDriver().findElement(By.xpath("//*[@id='mat-radio-20-input']")).sendKeys();
        //System.out.println(Driver.getDriver().findElement(By.xpath("//input[@id='mat-radio-20-input']")).isSelected());
        //System.out.println(Driver.getDriver().findElement(By.xpath("//input[@id='mat-radio-19-input']")).isSelected());
        waitFor(2);
        Assert.assertTrue(Driver.getDriver().findElement(By.cssSelector(".mat-tooltip-trigger.logo-text")).isDisplayed());
        //BrowserUtils.waitFor(3);
        clickWithJs(Driver.getDriver().findElement(By.xpath("//button[@class='mat-focus-indicator navbar-toggle-button mat-icon-button mat-button-base ng-star-inserted']")));
        if (!Objects.equals(modulName, "Setup")) {
            Driver.getDriver().findElement(By.tagName("//span[text()='" + modulName + "']")).click();
            Driver.getDriver().findElement(By.tagName("//span[text()='" + tabModul + "']")).click();

        } else {
            clickWithJs(Driver.getDriver().findElement(By.xpath("(//span[text()='" + modulName + "'])[1]")));
            clickWithJs(Driver.getDriver().findElement(By.xpath("//span[text()='" + tabModul + "']")));
        }


    }
    /**
     * user can click "+" button on the any page
     */
    public static void clickAddButton() {
        waitFor(2);
        clickWithJs(Driver.getDriver().findElement(By.cssSelector("button[matbadgecolor='accent']")));
    }
    //button//*[@data-icon='plus']
//button[matbadgecolor='accent']
    public static void navigatePageLink(String pageName) {
        Driver.getDriver().findElement(By.xpath("//a/..//span[text()='" + pageName + "']")).click();
    }

}
