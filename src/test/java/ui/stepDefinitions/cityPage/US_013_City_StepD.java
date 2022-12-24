package ui.stepDefinitions.cityPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ui.pages.cityPage.CityPage;
import ui.pages.countryPage.CountryPage;
import utils.BrowserUtilities;
import utils.Driver;

import java.util.List;

public class US_013_City_StepD {

    CityPage cityPage = new CityPage();
    CountryPage countryPage = new CountryPage();

    @Given("The user goes to city page")
    public void theUserGoesToCityPage() {
        BrowserUtilities.waitForVisible(countryPage.languageMenu, 5);
        BrowserUtilities.clickWithJs(countryPage.languageMenu);
        //  BrowserUtilities.waitForVisible(countryPage.englishMenu,3);
        BrowserUtilities.clickWithJs(countryPage.englishMenu);

        BrowserUtilities.waitForVisible(countryPage.profileSettingsButton, 5);
        BrowserUtilities.clickWithJs(countryPage.profileSettingsButton);

        BrowserUtilities.waitForVisible(countryPage.schoolsButton, 5);
        BrowserUtilities.clickWithJs(countryPage.schoolsButton);

        BrowserUtilities.waitForVisible(countryPage.mySchoolButton, 5);
        BrowserUtilities.clickWithJs(countryPage.mySchoolButton);

        BrowserUtilities.clickWithJs(countryPage.setupButton);
        BrowserUtilities.clickWithJs(countryPage.parametersButton);
        BrowserUtilities.waitForVisible(cityPage.citiesButton, 5);
        BrowserUtilities.clickWithJs(cityPage.citiesButton);
    }

    @Given("The user clicks add city button")
    public void the_user_clicks_add_city_button() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.waitForVisible(cityPage.addButton,5);
        BrowserUtilities.waitForClickability(cityPage.addButton, 5).click();
    }

    @When("The user clicks save city button")
    public void the_user_clicks_save_city_button() {
        BrowserUtilities.waitForVisible(cityPage.saveButton, 5).click();
    }

    @Then("The user sees success city message")
    public void the_user_sees_success_city_message() {
        BrowserUtilities.waitForVisible(cityPage.successMessage,5);
        Assert.assertTrue(cityPage.successMessage.isDisplayed());
    }

    @And("The user selects country {string}")
    public void theUserSelectsCountry(String country) {
        BrowserUtilities.waitFor(1);
        cityPage.countryDropdown.click();
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
        cityPage.editButton.click();
    }

    @When("The user reenters city Name")
    public void theUserReentersCityName() {
        cityPage.editNameInput.clear();
        cityPage.editNameInput.sendKeys("NewDarmstadt");
        cityPage.saveButton.click();
    }

    @And("The user clicks city delete button")
    public void theUserClicksCityDeleteButton() {
        BrowserUtilities.waitForClickability(cityPage.deleteButton,5).click();
        BrowserUtilities.waitForClickability(cityPage.deleteConfirmationButton,5).click();
    }

    @And("The user enters {string} Name")
    public void theUserEntersName(String city) {
        BrowserUtilities.waitForVisible(cityPage.nameInput, 5).sendKeys(city);
    }

    @When("The user searches {string} Name")
    public void theUserSearchesName(String oldcity) {
        cityPage.searchNameInput.sendKeys(oldcity);
        cityPage.searchButton.click();
    }

    @When("The user reenters {string} Name")
    public void theUserReentersName(String newcity) {

        cityPage.editNameInput.clear();
        cityPage.editNameInput.sendKeys(newcity);
        cityPage.saveButton.click();
    }

    @When("The user searches {string} city")
    public void theUserSearchesCity(String lastcity) {
        cityPage.searchNameInput.sendKeys(lastcity);
        cityPage.searchButton.click();
    }
}
