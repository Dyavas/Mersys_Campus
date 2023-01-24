package ui.stepDefinitions.parameters;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import ui.pages.parametersPage.ParametersPage;
import utils.BrowserUtilities;
import utils.Driver;

public class US_020_FieldSettingsPage_StepD {
    ParametersPage parametersPage = new ParametersPage();

    @When("the user should be able to click on Fields settings Page")
    public void theUserShouldBeAbleToClickOnFieldsSettingsPage() {
        BrowserUtilities.clickWithJs(parametersPage.fieldSettingsButton);
    }

    @And("the user should be able to selectable {string} on EntetyDropdown menu")
    public void theUserShouldBeAbleToSelectableOnEntetyDropdownMenu(String name) {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clickWithJs(parametersPage.entetyType_Combobox);
        BrowserUtilities.waitFor(2);
        Driver.getDriver().findElement(By.xpath("//mat-option/span[contains(text(),'" + name + "')]")).click();
    }


    @When("the user should be able to click on edit button on Fields setting page")
    public void theUserShouldBeAbleToClickOnEditButtonOnFieldsSettingPage() {
        BrowserUtilities.clickWithJs(Driver.getDriver().findElement(By.xpath(("(//input)[8]"))));
    }

   

    @And("the user inputs a valid {string}")
    public void theUserInputsAValid(String nummer) {

        BrowserUtilities.waitForVisible(parametersPage.ordner_Input, 5);
        parametersPage.ordner_Input.clear();
        BrowserUtilities.waitFor(2);
        parametersPage.ordner_Input.sendKeys(nummer);
    }

    @When("the user should be able to click on RequiredRadioButton of Fields settings Page")
    public void theUserShouldBeAbleToClickOnRequiredRadioButtonOfFieldsSettingsPage() {
        if (!parametersPage.requiredButton.isDisplayed()) {
            BrowserUtilities.clickWithJs(parametersPage.requiredButton);
            BrowserUtilities.waitFor(2);
        }
    }

    @When("the user should be able to click on EnabledRadioButton of  Fields settings Page")
    public void theUserShouldBeAbleToClickOnEnabledRadioButtonOfFieldsSettingsPage() {
        if (!parametersPage.enabledButton.isEnabled())
            BrowserUtilities.clickWithJs(parametersPage.enabledButton);
        BrowserUtilities.waitFor(2);
    }

    @When("the user should be able to click on ArrayRadioButton of  Fields settings Page")
    public void theUserShouldBeAbleToClickOnArrayRadioButtonOfFieldsSettingsPage() {
        if (!parametersPage.arrayButton.isEnabled()) {
            BrowserUtilities.clickWithJs(parametersPage.arrayButton);
            BrowserUtilities.waitFor(2);

        }
    }

    @And("the user inputs a valid {string} numberOfValues")
    public void theUserInputsAValidNumberOfValues(String nummer) {
        if (!parametersPage.numberOfValues_Input.isEnabled()) {
            BrowserUtilities.waitForVisible(parametersPage.numberOfValues_Input, 5);
            parametersPage.numberOfValues_Input.clear();
            parametersPage.numberOfValues_Input.sendKeys(nummer);
        }
    }

    @When("the user should be able to click on RequiredRadioButton")
    public void theUserShouldBeAbleToClickOnRequiredRadioButton() {
        BrowserUtilities.clickWithJs(parametersPage.requiredButton);

    }

    @When("the user should be able to click on EnabledRadioButton")
    public void theUserShouldBeAbleToClickOnEnabledRadioButton() {
        BrowserUtilities.clickWithJs(parametersPage.enabledButton);
    }

    @When("the user should be able to click on EditButton")
    public void theUserShouldBeAbleToClickOnEditButton() {
        BrowserUtilities.clickWithJs(parametersPage.editButton);
    }
}
