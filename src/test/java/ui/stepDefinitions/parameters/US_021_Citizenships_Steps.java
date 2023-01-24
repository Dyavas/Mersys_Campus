package ui.stepDefinitions.parameters;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import ui.pages.parametersPage.ParametersPage;
import utils.BrowserUtilities;

public class US_021_Citizenships_Steps {

    ParametersPage parametersPage = new ParametersPage();

    @And("the user click on Citizenships button")
    public void theUserClickOnCitizenshipsButton() {
        parametersPage.citizenshipsButton.click();
    }

    @And("the user should be able to input an existant Citizenships name {string} in name box")
    public void theUserShouldBeAbleToInputAnExistantCitizenshipsNameInNameBox(String name) {
        parametersPage.nameInput.sendKeys(name);
    }


    @And("the user should be able to input an existant Citizenships Short name {string} in name box")
    public void theUserShouldBeAbleToInputAnExistantCitizenshipsShortNameInNameBox(String shortname) {
        parametersPage.shortName.sendKeys(shortname);

    }

    @Then("the user should be able to click the Save button.")
    public void theUserShouldBeAbleToClickTheSaveButton() {
        parametersPage.saveButton.click();
    }

    @Then("User should be able to see „Citizenship successfully updated“ message in message box")
    public void userShouldBeAbleToSeeCitizenshipSuccessfullyUpdatedMessageInMessageBox() {
        BrowserUtilities.waitFor(1);
        String actualMessage = parametersPage.messagebox.getText();

        Assert.assertEquals("Citizenship successfully updated", actualMessage);

    }


    @And("the user should be able to input an existant Citizenships name {string} in seach name box")
    public void theUserShouldBeAbleToInputAnExistantCitizenshipsNameInSeachNameBox(String name) {
        parametersPage.searchNameInput.sendKeys(name);


    }

    @And("the user should be able to input an existant Citizenships Short name {string} in search name box")
    public void theUserShouldBeAbleToInputAnExistantCitizenshipsShortNameInSearchNameBox(String shortName) {
        parametersPage.searchShortName.sendKeys(shortName);

    }

    @And("the user should be able to input an existant Citizenships new name {string} in name box")
    public void theUserShouldBeAbleToInputAnExistantCitizenshipsNewNameInNameBox(String name) {
        parametersPage.nameInput.clear();
        parametersPage.nameInput.sendKeys(name);
    }

    @And("the user should be able to input an existant Citizenships new Short name {string} in name box")
    public void theUserShouldBeAbleToInputAnExistantCitizenshipsNewShortNameInNameBox(String ShortName) {
        parametersPage.shortName.clear();
        parametersPage.shortName.sendKeys(ShortName);

    }

    @Then("User should be able to see „Citizenship successfully created“ message in message box")
    public void userShouldBeAbleToSeeCitizenshipSuccessfullyCreatedMessageInMessageBox() {

        BrowserUtilities.waitFor(1);
        String actualMessage = parametersPage.messagebox.getText();

        Assert.assertEquals("Citizenship successfully created", actualMessage);
    }


    @Then("User should be able to see „Citizenship successfully deleted\" message in message box")
    public void userShouldBeAbleToSeeCitizenshipSuccessfullyDeletedMessageInMessageBox() {
        BrowserUtilities.waitFor(1);
        String actualMessage = parametersPage.messagebox.getText();

        Assert.assertEquals("Citizenship successfully deleted", actualMessage);

    }

    @Then("User should be able to see „There is no data to display“ message")
    public void userShouldBeAbleToSeeThereIsNoDataToDisplayMessage() {
        String noData = parametersPage.noDataMessage.getText();
        BrowserUtilities.waitFor(2);

        Assert.assertTrue(noData.contains("There is no data to display"));


    }
}
