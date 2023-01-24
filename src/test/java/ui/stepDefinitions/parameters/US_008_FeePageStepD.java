package ui.stepDefinitions.parameters;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ui.pages.parametersPage.ParametersPage;
import utils.BrowserUtilities;

public class US_008_FeePageStepD {

    ParametersPage parametersPage = new ParametersPage();

    @When("the user click on Setup button")
    public void theUserClickOnSetupButton() {

//        parametersPage.cookiesAcceptbutton.click();
//        BrowserUtilities.waitFor(2);
//        parametersPage.setupButton.click();
        BrowserUtilities.clickWithJs(parametersPage.setupButton);

    }

    @And("the user click on Parameters button")
    public void theUserClickOnParametersButton() {

        parametersPage.parametersButton.click();

    }

    @And("the user click on Fees  button")
    public void theUserClickOnFeesButton() {

        parametersPage.feesbutton.click();
    }

    @And("the user should be able to click on + buttona")
    public void theUserShouldBeAbleToClickOnButtona() {


        BrowserUtilities.waitForClickability(parametersPage.addButton, 1).click();
    }

    @Then("the user should be able to input the Name in Name box.")
    public void theUserShouldBeAbleToInputTheNameInNameBox() {

        BrowserUtilities.waitForVisible(parametersPage.nameInput, 1).sendKeys("Songul Fee Type");
    }

    @Then("the user should be able to input new code in code box.")
    public void theUserShouldBeAbleToInputNewCodeInCodeBox() {

        parametersPage.codeInput.sendKeys("12345");
    }

    @And("the user should be able to input new Priority in the Priority box.")
    public void theUserShouldBeAbleToInputNewPriorityInThePriorityBox() {

        parametersPage.priorityinput.sendKeys("5698");
    }

    @And("the user should be able to click on two times Active button")
    public void theUserShouldBeAbleToClickOnTwoTimesActiveButton() {
        BrowserUtilities.waitFor(3);
        parametersPage.activebar.click();
        parametersPage.activebar.click();
    }

    @And("then user should be able to click on Save buttona")
    public void thenUserShouldBeAbleToClickOnSaveButtona() {
        parametersPage.saveButton.click();

    }

    @Then("User should be able to see \"Fee Type successfully created“ message in message box")
    public void userShouldBeAbleToSeeFeeTypeSuccessfullyCreatedMessageInMessageBox() {

        String actualMessage = parametersPage.messagebox.getText();
        Assert.assertEquals("Fee Type successfully created", actualMessage);
        // System.out.println("us_008_fee_page.messagebox.getText() = " + us_008_fee_page.messagebox.getText());


    }

    @And("the user should be able to input an existant Fee name in name box")
    public void theUserShouldBeAbleToInputAnExistantFeeNameInNameBox() {

        parametersPage.namesearcinput.sendKeys("Songul Fee Type");

    }

    @Then("the user should be able to click the Search button.")
    public void theUserShouldBeAbleToClickTheSearchButton() {
        BrowserUtilities.waitFor(1);
        parametersPage.searchButton.click();
        BrowserUtilities.waitFor(2);
    }

    @Then("User should be able to see an existant Fee Type")
    public void userShouldBeAbleToSeeAnExistantFeeType() {
        String actualfeename = parametersPage.namesearchbox.getText();
        Assert.assertEquals("Songul Fee Type", actualfeename);

    }

    @Then("the user should be able to click Edit button")
    public void theUserShouldBeAbleToClickEditButton() {
        parametersPage.editButton.click();

    }

    @And("the user should be able to input new Name in the Name box.")
    public void theUserShouldBeAbleToInputNewNameInTheNameBox() {
        BrowserUtilities.waitFor(1);
        parametersPage.nameInput.clear();
        parametersPage.nameInput.sendKeys("Songul New Fee Type");
    }

    @And("the user should be able to input new Code in the Code box.")
    public void theUserShouldBeAbleToInputNewCodeInTheCodeBox() {
        parametersPage.codeInput.clear();
        parametersPage.codeInput.sendKeys("123456");
    }

    @Then("User should be able to see „Fee Type successfully updated“ message in message box")
    public void userShouldBeAbleToSeeFeeTypeSuccessfullyUpdatedMessageInMessageBox() {
        String actualMessage = parametersPage.messagebox.getText();
        Assert.assertEquals("Fee Type successfully updated", actualMessage);
    }

    @And("the user should be able to input an existant Fee Code in code box")
    public void theUserShouldBeAbleToInputAnExistantFeeCodeInCodeBox() {
        parametersPage.codesearchbox.sendKeys("12345");

    }

    @And("the user should be able to input new Priority in the Priority boxx.")
    public void theUserShouldBeAbleToInputNewPriorityInThePriorityBoxx() {
        parametersPage.editpriorityinput.clear();
        parametersPage.editpriorityinput.sendKeys("5699");

    }


    @Then("the user should be able to click Deleteone button")
    public void theUserShouldBeAbleToClickDeleteoneButton() {
        BrowserUtilities.waitFor(2);

        parametersPage.deleteButton.click();
    }

    @Then("the user should be able to click Deletetwo button")
    public void theUserShouldBeAbleToClickDeletetwoButton() {
        parametersPage.deleteConfirmationButton.click();
    }

    @And("the user should be able to input new Name in the search Name box.")
    public void theUserShouldBeAbleToInputNewNameInTheSearchNameBox() {
        parametersPage.namesearcinput.sendKeys("Songul New Fee Type");
    }

    @Then("User should be able to see „Fee Type successfully deleted“ message in message box")
    public void userShouldBeAbleToSeeFeeTypeSuccessfullyDeletedMessageInMessageBox() {

        String actualMessage = parametersPage.messagebox.getText();
        Assert.assertEquals("Fee Type successfully deleted", actualMessage);
    }

}
