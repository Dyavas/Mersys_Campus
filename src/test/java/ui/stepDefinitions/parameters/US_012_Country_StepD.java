package ui.stepDefinitions.parameters;

import io.cucumber.java.en.*;

import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.pages.loginPage.LoginPage;
import ui.pages.parametersPage.ParametersPage;
import utils.BrowserUtilities;
import utils.ConfigurationReader;
import utils.Driver;

import java.time.Duration;

public class US_012_Country_StepD {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    ParametersPage parametersPage = new ParametersPage();
    LoginPage loginPage = new LoginPage();

    @Given("The user clicks add button")
    public void the_user_clicks_add_button() {
        BrowserUtilities.waitForVisible(parametersPage.addButton,5).click();
    }

    @And("The user enters {string} and {string}")
    public void theUserEntersAnd(String Name, String Code) {
        BrowserUtilities.waitForVisible(parametersPage.nameInput,5).sendKeys(Name);
        BrowserUtilities.waitForVisible(parametersPage.codeInput,5).sendKeys(Code);
        BrowserUtilities.waitForClickability(parametersPage.stateExitsButton,5).click();
    }

    @When("The user clicks save button")
    public void the_user_clicks_save_button() {
        BrowserUtilities.waitForVisible(parametersPage.saveButton,5).click();

    }
    @Then("The user sees success message")
    public void the_user_sees_success_message() {
        BrowserUtilities.waitForVisible(parametersPage.successMessage,5);
        assertTrue(parametersPage.successMessage.isDisplayed());
    }

    @And("The user clicks radio button")
    public void theUserClicksRadioButton() {
        BrowserUtilities.waitForVisible(parametersPage.stateExitsButton,5).click();
    }

    @Given("The user goes to Test Home Page")
    public void theUserGoesToTestHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url_test"));
    }


    @Given("The user goes to country page")
    public void theUserGoesToCountryPage(){
        BrowserUtilities.waitForVisible(parametersPage.countriesButton,5);
        BrowserUtilities.clickWithJs(parametersPage.countriesButton);
    }

 

    @When("The user searches {string}")
    public void theUserSearches(String Name) {
        BrowserUtilities.waitForVisible(parametersPage.searchNameInput,5).sendKeys(Name);
        BrowserUtilities.waitForClickability(parametersPage.searchButton,5).click();
    }

    @When("The user searches {string} country")
    public void theUserSearchesCountry(String NewName) {
        BrowserUtilities.waitForVisible(parametersPage.searchNameInput,5).sendKeys(NewName);
        BrowserUtilities.waitForClickability(parametersPage.searchButton,5).click();
    }

    @And("The user clicks country edit button")
    public void theUserClicksCountryEditButton() {
        BrowserUtilities.waitForClickability(parametersPage.editButton,5).click();
    }

    @And("The user clicks country delete button")
    public void theUserClicksCountryDeleteButton() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.waitForClickability(parametersPage.deleteButton,5).click();
        BrowserUtilities.waitForClickability(parametersPage.deleteConfirmationButton,5).click();
    }

    @Then("The user should login successfully")
    public void theUserShouldLoginSuccessfully() {
        assertTrue(parametersPage.dashboard.isDisplayed());
    }

    @Then("The user sees no data message")
    public void theUserSeesNoDataMessage() {
        assertTrue(parametersPage.noDataMessage.isDisplayed());
    }

    @When("The user reenters {string} and {string}")
    public void theUserReentersAnd(String NewName, String NewCode) {
        BrowserUtilities.waitForVisible(parametersPage.nameInput,5);
        parametersPage.nameInput.clear();
        parametersPage.nameInput.sendKeys(NewName);
        BrowserUtilities.waitForVisible(parametersPage.codeInput,5);
        parametersPage.codeInput.clear();
        parametersPage.codeInput.sendKeys(NewCode);
    }

}
