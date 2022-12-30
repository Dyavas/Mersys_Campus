package ui.stepDefinitions.parametersPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.pages.parametersPage.FieldsPage;
import ui.pages.parametersPage.ParametersPage;
import utils.BrowserUtilities;
import utils.Driver;

import java.awt.*;

public class US_017_FieldsPageStepD {
    ParametersPage parametersPage = new ParametersPage();
    FieldsPage fieldsPage = new FieldsPage();

    @When("the user should be to click on Parameter")
    public void theUserShouldBeToClickOnParameter() {
        parametersPage.parametersButton.click();
    }

    @Then("Verify existence of {string} Page")
    public void verifyExistenceOfPage(String text) {
        BrowserUtilities.waitForVisible(fieldsPage.fieldsTitle, 2);
        Assert.assertEquals(text, fieldsPage.fieldsTitle.getText());
    }

    @When("the user should be able to click on Fields Page")
    public void theUserShouldBeAbleToClickOnFieldsPage() {

        BrowserUtilities.clickWithJs(parametersPage.fieldsButton);
    }

    @And("the user should be able to click on + button")
    public void theUserShouldBeAbleToClickOnButton() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.waitForVisible(fieldsPage.fieldsAdd_Button, 5);
        BrowserUtilities.clickWithJs(fieldsPage.fieldsAdd_Button);
    }


    @When("the user should be able to input the {string} name")
    public void theUserShouldBeAbleToInputThe(String field) {
        BrowserUtilities.waitForVisible(fieldsPage.fieldsName_Input, 2);
        fieldsPage.fieldsName_Input.clear();
        fieldsPage.fieldsName_Input.sendKeys(field);

    }


    @And("the user should be able to selectable {string} on Dropdown menu blank")
    public void theUserShouldBeAbleToSelectableOnDropdownMenuBlank(String text) throws AWTException {

        Driver.getDriver().findElement(By.xpath("//span[text()='Text']")).click();
        BrowserUtilities.waitFor(2);
        Driver.getDriver().findElement(By.xpath("//mat-option/span[contains(text(),'" + text + "')]")).click();

    }

    @And("then user should be able to click on Save button")
    public void thenUserShouldBeAbleToClickOnSaveButton() {
        BrowserUtilities.clickWithJs(fieldsPage.fieldsSave_Button);
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
        BrowserUtilities.waitForVisible(fieldsPage.fieldsCode_Input, 2);
        fieldsPage.fieldsCode_Input.clear();
        fieldsPage.fieldsCode_Input.sendKeys(field);
    }

    @When("the user should be able to sourceInput the {string} name")
    public void theUserShouldBeAbleToSourceInputTheName(String text) {
        BrowserUtilities.waitForVisible(fieldsPage.fieldsSourceName_Input, 2);
        fieldsPage.fieldsSourceName_Input.sendKeys(text);
    }

    @And("the user should be able to click on edit button")
    public void theUserShouldBeAbleToClickOnEditButton() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clickWithJs(fieldsPage.fieldsEdit_Button);
    }

    @And("then user should be able to click on Source button")
    public void thenUserShouldBeAbleToClickOnSourceButton() {
        BrowserUtilities.clickWithJs(fieldsPage.fieldsSource_Button);
    }

    @And("the user should be able to click on delete button")
    public void theUserShouldBeAbleToClickOnDeleteButton() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clickWithJs(fieldsPage.fieldsDelete_Button);
    }

    @And("the user should be able to click on delete button of page")
    public void theUserShouldBeAbleToClickOnDeleteButtonOfPage() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clickWithJs(fieldsPage.fieldsDelete2_Button);
    }
}
