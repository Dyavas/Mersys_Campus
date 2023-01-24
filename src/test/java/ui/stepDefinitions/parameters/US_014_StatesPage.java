package ui.stepDefinitions.parameters;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ui.pages.dashboardPage.DashboardPage;
import ui.pages.parametersPage.ParametersPage;
import utils.BrowserUtilities;

public class US_014_StatesPage {

    ParametersPage parametersPage = new ParametersPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user should be able choose a Language English")
    public void userShouldBeAbleChooseALanguageEnglish() {

        BrowserUtilities.clickWithJs(parametersPage.flag);
        parametersPage.english.click();

    }


    @When("user should be able choose to School")
    public void userShouldBeAbleChooseToSchool() {

        parametersPage.iAdmin.click();
        parametersPage.schools.click();
        parametersPage.iYSSchool.click();

    }

    @Then("user should be able see States Page")
    public void userShouldBeAbleSeeStatesPage() {

        dashboardPage.setupOne.click();
        dashboardPage.parameters.click();
        dashboardPage.states.click();

    }

    @When("user should be able to click on + button")
    public void userShouldBeAbleToClickOnButton() {

        parametersPage.addButton.click();

    }

    @Then("user should be able click to country section and to select country")
    public void userShouldBeAbleClickToCountrySectionAndToSelectCountry() {

        parametersPage.CountryClick1.click();
        parametersPage.australia.click();

    }

    @Given("user should be able to enter a name to the Name and Short Name fields")
    public void userShouldBeAbleToEnterANameToTheAndFields() {

        parametersPage.nameInput.sendKeys("Sydney");
        parametersPage.shortName.sendKeys("SY");

    }

    @Then("user should be able to click Save button")
    public void userShouldBeAbleToClickButton() {

        parametersPage.saveButton.click();

    }

    @Then("user should be able to see successfully message")
    public void userShouldBeAbleToSee() {

        Assert.assertTrue(parametersPage.msjContainer.isDisplayed());


    }

    @Then("user should be able to select All option from Country")
    public void userShouldBeAbleToSelectAllOptionFromCountry() {

        parametersPage.CountryClick.click();
        parametersPage.CountryAll.click();


    }

    @Given("user should be able enter a Name in Name input")
    public void userShouldBeAbleEnterANameInNameInput() {

        parametersPage.searchNameInput.clear();
        parametersPage.searchNameInput.sendKeys("Sydney");

    }

    @Then("user should be able to click Search button")
    public void userShouldBeAbleClickSearchButton() {

        parametersPage.searchButton.click();

    }

    @And("user should be able to click Edit icon")
    public void userShouldBeAbleToClickEditIcon() {

        parametersPage.editButton.click();

    }

    @Given("user should be able to change Name and Short Name input")
    public void userShouldBeAbleToChangeNameAndShortNameInput() {


        parametersPage.nameInput.clear();
        parametersPage.nameInput.sendKeys("Brisbane");
        parametersPage.shortName.clear();
        parametersPage.shortName.sendKeys("BE");

    }

    @Given("user should be able enter {string} in Name input")
    public void userShouldBeAbleEnterInNameInput(String arg0) {

        parametersPage.searchNameInput.sendKeys("Brisbane");

    }

    @And("user should be able to click Delete icon")
    public void userShouldBeAbleToClickDeleteIcon() {

        parametersPage.deleteButton.click();

    }

    @Then("user should be able to click Delete button")
    public void userShouldBeAbleToClickDeleteButton() {

        parametersPage.deleteButton.click();

    }

    @Then("user should be able to see There is no data to display")
    public void userShouldBeAbleToSeeThereIsNoDataToDisplay() {

        String noDataMessage = parametersPage.noDataMessage.getText();
        System.out.println(noDataMessage);

        Assert.assertEquals("There is no data to display", noDataMessage);
    }
}
