package ui.stepDefinitions.parameters;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import ui.pages.parametersPage.ParametersPage;
import utils.BrowserUtilities;


import static utils.BrowserUtilities.navigatePageLink;
import static utils.BrowserUtilities.*;


public class US_019_BankAccountStepD {
    ParametersPage parametersPage = new ParametersPage();

    @Given("User is navigate to {string} {string} module then click {string} page")
    public void userIsNavigateToModuleThenClick(String modul, String tab, String pageName) {
        navigateTo(modul, tab);
        navigatePageLink(pageName);


    }

    @When("User should be able to click on add button")
    public void userShouldBeAbleToClickOnAddButton() {
        clickAddButton();

    }

    @And("User should be able to enter a Name {string} to the relevant field")
    public void userShouldBeAbleToEnterAToTheRelevantField(String name) {

        parametersPage.name_Input.sendKeys(name);
    }

    @And("User should be able to enter a valid IBAN {string} to the relevant field")
    public void userShouldBeAbleToEnterAValidToTheRelevantField(String IBAN) {
        parametersPage.IBANInput.sendKeys(IBAN);
    }


    @And("User should be able to select Currency {string}")
    public void userShouldBeAbleToSelect(String cur) {
        if (!cur.isBlank()) {
            parametersPage.selectCurrency(cur);
        }
    }

    @And("User should be able to enter Integration Code {string}")
    public void userShouldBeAbleToEnter(String intCode) {

        parametersPage.IntCodeInput.sendKeys(intCode);
    }

    @And("User should be able to switch status to actieve and click on Save button")
    public void userShouldBeAbleToSwitchStatusToActieveAndClickOnSaveButton() {
        parametersPage.clickSaveButton();

    }

    @Then("User should be able to see the {string} message")
    public void userShouldBeAbleToSeeTheMessage(String expectedMessage) {
        waitFor(1);
        String actualMessage = parametersPage.message.getText();
        waitFor(2);
        Assert.assertEquals(expectedMessage, actualMessage);
    }


    @And("User should be able to enter a IBAN {string} to the relevant field")
    public void userShouldBeAbleToEnterAIBANToTheRelevantField(String IBAN) {
        parametersPage.IBANInput.sendKeys(IBAN);
    }

    @Then("User should be able to see that save button is not clickable")
    public void userShouldBeAbleToSeeThatSaveButtonIsNotClickable() {
        parametersPage.verifySaveButtonIsNotClickable();
    }


    @Then("User should be able to see the already exist {string} message")
    public void userShouldBeAbleToSeeTheAlreadyExistMessage(String expectedMessage) {
        waitFor(1);
        String actualMessage = parametersPage.message.getText();
        waitFor(2);
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }


    @When("User should be able to enter a Bank Acc. {string} to search box")
    public void userShouldBeAbleToEnterABankAccToSearchBox(String name) {
        parametersPage.nameInputSearchBox.sendKeys(name);
    }

    @And("User should be able to click search button")
    public void userShouldBeAbleToClickSearchButton() {
        parametersPage.searchButton.click();
    }

    @Then("User should be able see {string} the Bank account on list")
    public void userShouldBeAbleSeeTheBankAccountOnList(String name) {
        parametersPage.verfyBankAccOnPage(name);


    }


    @Then("User should be able to check {string} IBAN")
    public void userShouldBeAbleToCheck(String IBAN) {
        parametersPage.verfyIban(IBAN);
    }

    @And("User should be able click delete button and delete {string} from the Bank account on list")
    public void userShouldBeAbleClickDeleteButtonAndDeleteFromTheBankAccountOnList(String IBAN) {
        parametersPage.deleteBankAccFromList(IBAN);
    }


    @When("User should be able to click on edit button for {string}")
    public void userShouldBeAbleToClickOnEditButton(String IBAN) {
        parametersPage.editButton(IBAN);
    }

    @When("User should be able to select Currency {string} from search dropdown box")
    public void user_should_be_able_to_select_currency_from_search_dropdown_box(String currency) {
        parametersPage.selectCurrencyDropdownBox(currency);
    }
    @And("the user should be able to select a school")
    public void theUserShouldBeAbleToSelectASchool() {
       waitFor(2);
        BrowserUtilities.adminMenuNavigate("Schools", "BC");
    }
}
