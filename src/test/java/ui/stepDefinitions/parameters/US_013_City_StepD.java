package ui.stepDefinitions.parameters;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.pages.parametersPage.ParametersPage;
import utils.BrowserUtilities;
import utils.Driver;

import java.util.List;

public class US_013_City_StepD {

    ParametersPage parametersPage = new ParametersPage();

    @Given("The user goes to city page")
    public void theUserGoesToCityPage() {

        BrowserUtilities.waitForVisible(parametersPage.citiesButton, 5);
        BrowserUtilities.clickWithJs(parametersPage.citiesButton);
    }

    @Given("The user clicks add city button")
    public void the_user_clicks_add_city_button() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.waitForVisible(parametersPage.addButton,5);
        BrowserUtilities.waitForClickability(parametersPage.addButton, 5).click();
    }

    @When("The user clicks save city button")
    public void the_user_clicks_save_city_button() {
        BrowserUtilities.waitForVisible(parametersPage.saveButton, 5).click();
    }

    @Then("The user sees success city message")
    public void the_user_sees_success_city_message() {
        BrowserUtilities.waitForVisible(parametersPage.successMessage,5);
        Assert.assertTrue(parametersPage.successMessage.isDisplayed());
    }

    @And("The user selects country {string}")
    public void theUserSelectsCountry(String country) {
        BrowserUtilities.waitFor(1);
        parametersPage.countryDropdown.click();
        BrowserUtilities.waitFor(2);
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//div[@role='listbox']/mat-option"));
        int index= 0;
        for (int i = 0; i < elements.size(); i++) {
             if (elements.get(i).getText().equalsIgnoreCase(country)){
             index=i;
             }
        }
        System.out.println(elements.get(index).getText());
        elements.get(index).click();
     }

    @And("The user clicks city edit button")
    public void theUserClicksCityEditButton() {
        parametersPage.editButton.click();
    }

    @When("The user reenters city Name")
    public void theUserReentersCityName() {
        parametersPage.nameInput.clear();
        parametersPage.nameInput.sendKeys("NewDarmstadt");
        parametersPage.saveButton.click();
    }

    @And("The user clicks city delete button")
    public void theUserClicksCityDeleteButton() {
        BrowserUtilities.waitForClickability(parametersPage.deleteButton,5).click();
        BrowserUtilities.waitForClickability(parametersPage.deleteConfirmationButton,5).click();
    }

    @And("The user enters {string} Name")
    public void theUserEntersName(String city) {
        BrowserUtilities.waitForVisible(parametersPage.nameInput, 5).sendKeys(city);
    }

    @When("The user searches {string} Name")
    public void theUserSearchesName(String oldcity) {
        parametersPage.searchNameInput.sendKeys(oldcity);
        parametersPage.searchButton.click();
    }

    @When("The user reenters {string} Name")
    public void theUserReentersName(String newcity) {

        parametersPage.nameInput.clear();
        parametersPage.nameInput.sendKeys(newcity);
        parametersPage.saveButton.click();
    }

    @When("The user searches {string} city")
    public void theUserSearchesCity(String lastcity) {
        parametersPage.searchNameInput.sendKeys(lastcity);
        parametersPage.searchButton.click();
    }

   @When("The user clicks add country button")
    public void theUserClicksAddCountryButton() {
        BrowserUtilities.waitFor(1);
        BrowserUtilities.waitForVisible(parametersPage.addButton,5).click();
    }
  @And("The user enters {string} and {string} city with country")
    public void theUserEntersAndCityWithCountry(String Name, String Code) {
        BrowserUtilities.waitFor(1);
        BrowserUtilities.waitForVisible(parametersPage.nameInput,5).sendKeys(Name);
        BrowserUtilities.waitForVisible(parametersPage.codeInput,5).sendKeys(Code);
        //  BrowserUtilities.waitForClickability(countryPage.stateExitsButton,5).click();
    }
    @And("The user clicks new save button")
    public void theUserClicksNewSaveButton() {
        BrowserUtilities.waitForVisible(parametersPage.saveButton,5).click();
    }
}
