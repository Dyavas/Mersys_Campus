package ui.stepDefinitions.statesPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ui.pages.dashboardPage.DashboardPage;
import ui.pages.statesPage.StatesPage;
import utils.BrowserUtilities;

public class US_014_StatesPage {

    StatesPage statesPage = new StatesPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user should be able choose a Language English")
    public void userShouldBeAbleChooseALanguageEnglish() {

        BrowserUtilities.clickWithJs(statesPage.flag);
        statesPage.english.click();

    }


    @When("user should be able choose to School")
    public void userShouldBeAbleChooseToSchool() {

        statesPage.iAdmin.click();
        statesPage.schools.click();
        statesPage.iYSSchool.click();

    }

    @Then("user should be able see States Page")
    public void userShouldBeAbleSeeStatesPage() {

        dashboardPage.setupOne.click();
        dashboardPage.parameters.click();
        dashboardPage.states.click();

    }

    @When("user should be able to click on + button")
    public void userShouldBeAbleToClickOnButton() {

        statesPage.addButton.click();

    }

    @Then("user should be able click to country section and to select country")
    public void userShouldBeAbleClickToCountrySectionAndToSelectCountry() {

        statesPage.CountryClick1.click();
        statesPage.australia.click();

    }

    @Given("user should be able to enter a name to the Name and Short Name fields")
    public void userShouldBeAbleToEnterANameToTheAndFields() {

        statesPage.nameInput.sendKeys("Sydney");
        statesPage.shortName.sendKeys("SY");

    }

    @Then("user should be able to click Save button")
    public void userShouldBeAbleToClickButton() {

        statesPage.saveButton.click();

    }

    @Then("user should be able to see successfully message")
    public void userShouldBeAbleToSee() {

        Assert.assertTrue(statesPage.msjContainer.isDisplayed());


    }

    @Then("user should be able to select All option from Country")
    public void userShouldBeAbleToSelectAllOptionFromCountry() {

        statesPage.CountryClick.click();
        statesPage.CountryAll.click();


    }

    @Given("user should be able enter a Name in Name input")
    public void userShouldBeAbleEnterANameInNameInput() {

        statesPage.searchNameInput.clear();
        statesPage.searchNameInput.sendKeys("Sydney");

    }

    @Then("user should be able to click Search button")
    public void userShouldBeAbleClickSearchButton() {

        statesPage.searchButton.click();

    }

    @And("user should be able to click Edit icon")
    public void userShouldBeAbleToClickEditIcon() {

        statesPage.editIcon.click();

    }

    @Given("user should be able to change Name and Short Name input")
    public void userShouldBeAbleToChangeNameAndShortNameInput() {


        statesPage.nameInput.clear();
        statesPage.nameInput.sendKeys("Brisbane");
        statesPage.shortName.clear();
        statesPage.shortName.sendKeys("BE");

    }

    @Given("user should be able enter {string} in Name input")
    public void userShouldBeAbleEnterInNameInput(String arg0) {

        statesPage.searchNameInput.sendKeys("Brisbane");

    }

    @And("user should be able to click Delete icon")
    public void userShouldBeAbleToClickDeleteIcon() {

        statesPage.deleteIcon.click();

    }

    @Then("user should be able to click Delete button")
    public void userShouldBeAbleToClickDeleteButton() {

        statesPage.deleteButton.click();

    }

    @Then("user should be able to see There is no data to display")
    public void userShouldBeAbleToSeeThereIsNoDataToDisplay() {

        String noDataMessage = statesPage.noDataMessage.getText();
        System.out.println(noDataMessage);

        Assert.assertEquals("There is no data to display", noDataMessage);
    }
}
