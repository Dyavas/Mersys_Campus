package ui.stepDefinitions.loginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BrowserUtilities;
import utils.ConfigurationReader;
import utils.Driver;

//import static utils.Driver.driver;// Manuel ekledim.


public class US_001_HomePageStepD {


    @Then("the user verifies that the url is {string}")
    public void theUserVerifiesThatTheUrlIs(String url) {
        assertEquals(url, Driver.getDriver().getCurrentUrl());

    }


    @And("the user accepts the cookies")
    public void theUserAcceptsTheCookies() {
        try {
            BrowserUtilities.waitForPageLoad(5);
            WebElement acceptButton = Driver.getDriver().findElement(By.xpath("//button[text()='Accept all cookies']"));
            acceptButton.click();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Then("the user verifies that the title {string}")
    public void theUserVerifiesThatTheTitle(String title) {

        assertEquals(title, Driver.getDriver().getTitle());
    }

    @Given("the user goes to home page")
    public void theUserGoesToHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url_test"));
    }
}
