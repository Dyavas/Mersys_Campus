package ui.stepDefinitions.parameters;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.pages.parametersPage.ParametersPage;
import utils.BrowserUtilities;
import utils.Driver;

import java.awt.*;

public class US_017_FieldsPageStepD {
    ParametersPage parametersPage = new ParametersPage();


    @When("the user should be to click on Parameter")
    public void theUserShouldBeToClickOnParameter() {
        parametersPage.parametersButton.click();
    }

    @Then("Verify existence of {string} Page")
    public void verifyExistenceOfPage(String text) {
        BrowserUtilities.waitForVisible(parametersPage.fieldsTitle, 2);
        Assert.assertEquals(text, parametersPage.fieldsTitle.getText());
    }

    @When("the user should be able to click on Fields Page")
    public void theUserShouldBeAbleToClickOnFieldsPage() {

        BrowserUtilities.clickWithJs(parametersPage.fieldsButton);
    }

    @And("the user should be able to click on + button")
    public void theUserShouldBeAbleToClickOnButton() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.waitForVisible(parametersPage.addButton, 5);
        BrowserUtilities.clickWithJs(parametersPage.addButton);

    }


    @When("the user should be able to input the {string} name")
    public void theUserShouldBeAbleToInputThe(String field) {
        BrowserUtilities.waitForVisible(parametersPage.nameInput, 2);
        parametersPage.nameInput.clear();
        parametersPage.nameInput.sendKeys(field);

    }


    @And("the user should be able to selectable {string} on Dropdown menu blank")
    public void theUserShouldBeAbleToSelectableOnDropdownMenuBlank(String text) throws AWTException {

        Driver.getDriver().findElement(By.xpath("//span[text()='Text']")).click();
        BrowserUtilities.waitFor(2);
        Driver.getDriver().findElement(By.xpath("//mat-option/span[contains(text(),'" + text + "')]")).click();

    }

    @And("then user should be able to click on Save button")
    public void thenUserShouldBeAbleToClickOnSaveButton() {
        BrowserUtilities.clickWithJs(parametersPage.saveButton);
    }

    @Then("Verify the {string} warning")
    public void verifyTheWarning(String message) {
        BrowserUtilities.waitFor(1);
        WebElement element = Driver.getDriver().findElement(By.xpath("//div[@class='hot-toast-message']/div/dynamic-view/div"));
        Assert.assertTrue(element.getText().contains(message));
    }

    @When("the user should be to click on Setup")
    public void theUserShouldBeToClickOnSetup() {
        BrowserUtilities.waitForPageLoad(2);
        BrowserUtilities.clickWithJs(parametersPage.setupButton);
    }

    @And("the user should be able to input the {string} code")
    public void theUserShouldBeAbleToInputTheCode(String field) {
        BrowserUtilities.waitForVisible(parametersPage.codeInput, 2);
        parametersPage.codeInput.clear();
        parametersPage.codeInput.sendKeys(field);
    }

    @When("the user should be able to sourceInput the {string} name")
    public void theUserShouldBeAbleToSourceInputTheName(String text) {
        BrowserUtilities.waitForVisible(parametersPage.searchNameInput, 2);
        parametersPage.searchNameInput.sendKeys(text);
    }

    @And("the user should be able to click on edit button")
    public void theUserShouldBeAbleToClickOnEditButton() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clickWithJs(parametersPage.editButton);
    }

    @And("then user should be able to click on Source button")
    public void thenUserShouldBeAbleToClickOnSourceButton() {
        BrowserUtilities.clickWithJs(parametersPage.searchButton);
    }

    @And("the user should be able to click on delete button")
    public void theUserShouldBeAbleToClickOnDeleteButton() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clickWithJs(parametersPage.deleteButton);
    }

    @And("the user should be able to click on delete button of page")
    public void theUserShouldBeAbleToClickOnDeleteButtonOfPage() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clickWithJs(parametersPage.deleteConfirmationButton);
    }
}
