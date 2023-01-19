package ui.stepDefinitions.countryPage;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.pages.commenPage.CommenPage;
import ui.pages.countryPage.CountryPage;
import utils.BrowserUtilities;
import utils.ConfigurationReader;
import utils.Driver;

import java.time.Duration;

public class US_012_Country_StepD {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    CountryPage countryPage = new CountryPage();

    @Given("The user clicks add button")
    public void the_user_clicks_add_button() {
        BrowserUtilities.waitForVisible(countryPage.addButton,5).click();
    }

    @And("The user enters {string} and {string}")
    public void theUserEntersAnd(String Name, String Code) {
        BrowserUtilities.waitForVisible(countryPage.nameInput,5).sendKeys(Name);
        BrowserUtilities.waitForVisible(countryPage.codeInput,5).sendKeys(Code);
        BrowserUtilities.waitForClickability(countryPage.stateExitsButton,5).click();
    }

    @When("The user clicks save button")
    public void the_user_clicks_save_button() {
        BrowserUtilities.waitForVisible(countryPage.saveButton,5).click();

    }
    @Then("The user sees success message")
    public void the_user_sees_success_message() {
        BrowserUtilities.waitForVisible(countryPage.successMessage,5);
        Assert.assertTrue(countryPage.successMessage.isDisplayed());
    }

    @And("The user clicks radio button")
    public void theUserClicksRadioButton() {
        BrowserUtilities.waitForVisible(countryPage.stateExitsButton,5).click();
    }

    @Given("The user goes to Test Home Page")
    public void theUserGoesToTestHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url_test"));
    }

    @When("The user enters with the right credentials")
    public void theUserEntersWithTheRightCredentials() {

        wait.until(ExpectedConditions.visibilityOf(countryPage.usernameInput)).sendKeys(ConfigurationReader.getProperty("username"));
        wait.until(ExpectedConditions.visibilityOf(countryPage.passwordInput)).sendKeys(ConfigurationReader.getProperty("password"));
        wait.until(ExpectedConditions.visibilityOf(countryPage.loginButton)).click();
    }

//    @Then("The user should login successfully")
//    public void theUserShouldLoginSuccessfully() {
//        wait.until(ExpectedConditions.visibilityOf(countryPage.successMessage));
//        Assert.assertTrue(countryPage.successMessage.isDisplayed());
//    }

    @Given("The user goes to country page")
    public void theUserGoesToCountryPage(){
        BrowserUtilities.waitForVisible(countryPage.languageMenu,5);
        BrowserUtilities.clickWithJs(countryPage.languageMenu);
        //  BrowserUtilities.waitForVisible(countryPage.englishMenu,3);
        BrowserUtilities.clickWithJs(countryPage.englishMenu);

        BrowserUtilities.waitForVisible(countryPage.profileSettingsButton,5);
        BrowserUtilities.clickWithJs(countryPage.profileSettingsButton);

        BrowserUtilities.waitForVisible(countryPage.schoolsButton,5);
        BrowserUtilities.clickWithJs(countryPage.schoolsButton);

        BrowserUtilities.waitForVisible(countryPage.mySchoolButton,5);
        BrowserUtilities.clickWithJs(countryPage.mySchoolButton);

        BrowserUtilities.clickWithJs(countryPage.setupButton);
     //   BrowserUtilities.waitForVisible(countryPage.parametersButton,3);
        BrowserUtilities.clickWithJs(countryPage.parametersButton);
        BrowserUtilities.waitForVisible(countryPage.countriesButton,5);
        BrowserUtilities.clickWithJs(countryPage.countriesButton);
    }

 

    @When("The user searches {string}")
    public void theUserSearches(String Name) {
        BrowserUtilities.waitForVisible(countryPage.searchNameInput,5).sendKeys(Name);
        BrowserUtilities.waitForClickability(countryPage.searchButton,5).click();
    }

    @When("The user searches {string} country")
    public void theUserSearchesCountry(String NewName) {
        BrowserUtilities.waitForVisible(countryPage.searchNameInput,5).sendKeys(NewName);
        BrowserUtilities.waitForClickability(countryPage.searchButton,5).click();
    }

    @And("The user clicks country edit button")
    public void theUserClicksCountryEditButton() {
        BrowserUtilities.waitForClickability(countryPage.editButton,5).click();
    }

    @And("The user clicks country delete button")
    public void theUserClicksCountryDeleteButton() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.waitForClickability(countryPage.deleteButton,5).click();
        BrowserUtilities.waitForClickability(countryPage.deleteConfirmationButton,5).click();
    }

    @Then("The user should login successfully")
    public void theUserShouldLoginSuccessfully() {
        Assert.assertTrue(countryPage.dashboard.isDisplayed());
    }

    @Then("The user sees no data message")
    public void theUserSeesNoDataMessage() {
        Assert.assertTrue(countryPage.noDataMessage.isDisplayed());
    }

    @When("The user reenters {string} and {string}")
    public void theUserReentersAnd(String NewName, String NewCode) {
        BrowserUtilities.waitForVisible(countryPage.nameInput,5);
        countryPage.nameInput.clear();
        countryPage.nameInput.sendKeys(NewName);
        BrowserUtilities.waitForVisible(countryPage.codeInput,5);
        countryPage.codeInput.clear();
        countryPage.codeInput.sendKeys(NewCode);
    }

}
