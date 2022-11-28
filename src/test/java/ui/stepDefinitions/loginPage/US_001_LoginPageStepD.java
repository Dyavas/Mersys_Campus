package ui.stepDefinitions.loginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BrowserUtilities;
import utils.ConfigurationReader;
import utils.Driver;

//import static utils.Driver.driver;// Manuel ekledim.


public class US_001_LoginPageStepD {
    @Given("the user goes to Test Home Page")
    public void theUserGoesToHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url_test"));


    }

    @Then("the user verifies that the url is {string}")
    public void theUserVerifiesThatTheUrlIs(String url) {
        Assert.assertEquals(url, Driver.getDriver().getCurrentUrl());

    }


    @And("the user accepts the cookies")
    public void theUserAcceptsTheCookies() {
        try {
            WebElement acceptButton = Driver.getDriver().findElement(By.xpath("//div[@class='ccm__footer']//button[@class='consent-give']"));
            BrowserUtilities.clickWithJs(acceptButton);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Then("the user verifies that the title {string}")
    public void theUserVerifiesThatTheTitle(String title) {
        Assert.assertEquals(title, Driver.getDriver().getTitle());
    }
}
