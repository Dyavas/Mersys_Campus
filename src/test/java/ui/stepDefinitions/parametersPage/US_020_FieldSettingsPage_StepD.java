package ui.stepDefinitions.parametersPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.pages.parametersPage.FieldsPage;
import utils.BrowserUtilities;
import utils.Driver;

public class US_020_FieldSettingsPage_StepD {
    FieldsPage fieldsPage = new FieldsPage();

    @When("the user should be able to click on Fields settings Page")
    public void theUserShouldBeAbleToClickOnFieldsSettingsPage() {
        BrowserUtilities.clickWithJs(fieldsPage.fieldSettingsButton);
    }

    @And("the user should be able to selectable {string} on EntetyDropdown menu")
    public void theUserShouldBeAbleToSelectableOnEntetyDropdownMenu(String name) {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clickWithJs(fieldsPage.entetyType_Combobox);
        BrowserUtilities.waitFor(2);
        Driver.getDriver().findElement(By.xpath("//mat-option/span[contains(text(),'" + name + "')]")).click();
    }


    @When("the user should be able to click on edit button on Fields setting page")
    public void theUserShouldBeAbleToClickOnEditButtonOnFieldsSettingPage() {
        BrowserUtilities.clickWithJs(Driver.getDriver().findElement(By.xpath(("(//input)[8]"))));
    }

   

    @And("the user inputs a valid {string}")
    public void theUserInputsAValid(String nummer) {

        BrowserUtilities.waitForVisible(fieldsPage.ordner_Input, 5);
        fieldsPage.ordner_Input.clear();
        BrowserUtilities.waitFor(2);
        fieldsPage.ordner_Input.sendKeys(nummer);
    }

    @When("the user should be able to click on RequiredRadioButton of Fields settings Page")
    public void theUserShouldBeAbleToClickOnRequiredRadioButtonOfFieldsSettingsPage() {
        if (!fieldsPage.requiredButton.isDisplayed()) {
            BrowserUtilities.clickWithJs(fieldsPage.requiredButton);
            BrowserUtilities.waitFor(2);
        }
    }

    @When("the user should be able to click on EnabledRadioButton of  Fields settings Page")
    public void theUserShouldBeAbleToClickOnEnabledRadioButtonOfFieldsSettingsPage() {
        if (!fieldsPage.enabledButton.isEnabled())
            BrowserUtilities.clickWithJs(fieldsPage.enabledButton);
        BrowserUtilities.waitFor(2);
    }

    @When("the user should be able to click on ArrayRadioButton of  Fields settings Page")
    public void theUserShouldBeAbleToClickOnArrayRadioButtonOfFieldsSettingsPage() {
        if (!fieldsPage.arrayButton.isEnabled()) {
            BrowserUtilities.clickWithJs(fieldsPage.arrayButton);
            BrowserUtilities.waitFor(2);
        }
    }

    @And("the user inputs a valid {string} numberOfValues")
    public void theUserInputsAValidNumberOfValues(String nummer) {
        if (!fieldsPage.numberOfValues_Input.isEnabled()) {
            BrowserUtilities.waitForVisible(fieldsPage.numberOfValues_Input, 5);
            fieldsPage.numberOfValues_Input.clear();
            fieldsPage.numberOfValues_Input.sendKeys(nummer);
        }
    }

    @When("the user should be able to click on RequiredRadioButton")
    public void theUserShouldBeAbleToClickOnRequiredRadioButton() {
        BrowserUtilities.clickWithJs(fieldsPage.requiredButton);

    }

    @When("the user should be able to click on EnabledRadioButton")
    public void theUserShouldBeAbleToClickOnEnabledRadioButton() {
        BrowserUtilities.clickWithJs(fieldsPage.enabledButton);
    }

    @When("the user should be able to click on EditButton")
    public void theUserShouldBeAbleToClickOnEditButton() {
        BrowserUtilities.clickWithJs(fieldsPage.editButton);
    }
}
