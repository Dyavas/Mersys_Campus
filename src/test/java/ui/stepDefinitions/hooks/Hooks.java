package ui.stepDefinitions.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtilities;
import utils.Driver;
import java.io.File;
import java.time.Duration;

public class Hooks {
//    public static WebDriver driver;

    @Before // burda kütüphane olarak cucumber secilmeli
    public void setup() {
//        driver = Driver.getDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().manage().window().maximize();
    }

    @After // burda kütüphane olarak cucumber secilmeli
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName() + "_screenshot");
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            File source = ts.getScreenshotAs(OutputType.FILE);
            // full path to the screenshot location
            String target = System.getProperty("user.dir") + "/US_148.feature-output/Screenshots/" + source.getName() + ".png";
            File finalDestination = new File(target);
        }
        BrowserUtilities.waitFor(3);
        Driver.closeDriver();
    }
}
