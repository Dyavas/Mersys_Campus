package ui.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import ui.pages.US_021_Citizenships_Page;
import utils.BrowserUtilities;

public class US_021_Citizenships_Steps {

    US_021_Citizenships_Page us_021_citizenships_page=new US_021_Citizenships_Page();

    @And("the user click on Citizenships button")
    public void theUserClickOnCitizenshipsButton() {
        us_021_citizenships_page.citizenshipsButton.click();
    }

    @And("the user should be able to input an existant Citizenships name {string} in name box")
    public void theUserShouldBeAbleToInputAnExistantCitizenshipsNameInNameBox(String name) {
        us_021_citizenships_page.citizenshipsNameInput.sendKeys(name);
    }


    @And("the user should be able to input an existant Citizenships Short name {string} in name box")
    public void theUserShouldBeAbleToInputAnExistantCitizenshipsShortNameInNameBox(String shortname) {
        us_021_citizenships_page.citizenshipsShortnameInput.sendKeys(shortname);

    }

    @Then("the user should be able to click the Save button.")
    public void theUserShouldBeAbleToClickTheSaveButton() {
        us_021_citizenships_page.citizenshipsSaveButton.click();
    }

    @Then("User should be able to see „Citizenship successfully updated“ message in message box")
    public void userShouldBeAbleToSeeCitizenshipSuccessfullyUpdatedMessageInMessageBox() {
        BrowserUtilities.waitFor(1);
        String actualMessage=us_021_citizenships_page.messagebox.getText();

        Assert.assertEquals("Citizenship successfully updated",actualMessage);

    }


    @And("the user should be able to input an existant Citizenships name {string} in seach name box")
    public void theUserShouldBeAbleToInputAnExistantCitizenshipsNameInSeachNameBox(String name) {
        us_021_citizenships_page.citizenshipsSearchNameInput.sendKeys(name);


    }

    @And("the user should be able to input an existant Citizenships Short name {string} in search name box")
    public void theUserShouldBeAbleToInputAnExistantCitizenshipsShortNameInSearchNameBox(String shortName) {
        us_021_citizenships_page.citizenshipSearchShortNameInput.sendKeys(shortName);

    }

    @And("the user should be able to input an existant Citizenships new name {string} in name box")
    public void theUserShouldBeAbleToInputAnExistantCitizenshipsNewNameInNameBox(String name) {
        us_021_citizenships_page.citizenshipsNameInput.clear();
        us_021_citizenships_page.citizenshipsNameInput.sendKeys(name);
    }

    @And("the user should be able to input an existant Citizenships new Short name {string} in name box")
    public void theUserShouldBeAbleToInputAnExistantCitizenshipsNewShortNameInNameBox(String ShortName) {
        us_021_citizenships_page.citizenshipsShortnameInput.clear();
        us_021_citizenships_page.citizenshipsShortnameInput.sendKeys(ShortName);

    }

    @Then("User should be able to see „Citizenship successfully created“ message in message box")
    public void userShouldBeAbleToSeeCitizenshipSuccessfullyCreatedMessageInMessageBox() {

        BrowserUtilities.waitFor(1);
        String actualMessage=us_021_citizenships_page.messagebox.getText();

        Assert.assertEquals("Citizenship successfully created",actualMessage);
    }



    @Then("User should be able to see „Citizenship successfully deleted\" message in message box")
    public void userShouldBeAbleToSeeCitizenshipSuccessfullyDeletedMessageInMessageBox() {
        BrowserUtilities.waitFor(1);
        String actualMessage=us_021_citizenships_page.messagebox.getText();

        Assert.assertEquals("Citizenship successfully deleted",actualMessage);

}

    @Then("User should be able to see „There is no data to display“ message")
    public void userShouldBeAbleToSeeThereIsNoDataToDisplayMessage() {
        String noData=us_021_citizenships_page.noDataMessage.getText();

        Assert.assertTrue(noData.contains("There is no data to display"));


    }
}
