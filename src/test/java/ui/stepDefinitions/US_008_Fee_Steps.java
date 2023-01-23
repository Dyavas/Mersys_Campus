package ui.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ui.pages.US_008_Fee_Page;
import utils.BrowserUtilities;

public class US_008_Fee_Steps {

   US_008_Fee_Page us_008_fee_page=new US_008_Fee_Page();
    @When("the user click on Setup button")
    public void theUserClickOnSetupButton() {

     us_008_fee_page.cookiesAcceptbutton.click();
     BrowserUtilities.waitFor(2);
   us_008_fee_page.setupbutton.click();

    }

    @And("the user click on Parameters button")
    public void theUserClickOnParametersButton() {

        us_008_fee_page.parametersbutton.click();

    }

    @And("the user click on Fees  button")
    public void theUserClickOnFeesButton() {

        us_008_fee_page.feesbutton.click();
    }

    @And("the user should be able to click on + buttona")
    public void theUserShouldBeAbleToClickOnButtona() {


       BrowserUtilities.waitForClickability(us_008_fee_page.addbutton,1).click();
    }

    @Then("the user should be able to input the Name in Name box.")
    public void theUserShouldBeAbleToInputTheNameInNameBox() {

        BrowserUtilities.waitForVisible(us_008_fee_page.nameinput,1).sendKeys("Songul Fee Type");
    }

    @Then("the user should be able to input new code in code box.")
    public void theUserShouldBeAbleToInputNewCodeInCodeBox() {

     us_008_fee_page.codeinput.sendKeys("12345");
    }

    @And("the user should be able to input new Priority in the Priority box.")
    public void theUserShouldBeAbleToInputNewPriorityInThePriorityBox() {

     us_008_fee_page.priorityinput.sendKeys("5698");
    }

    @And("the user should be able to click on two times Active button")
    public void theUserShouldBeAbleToClickOnTwoTimesActiveButton() {
     BrowserUtilities.waitFor(3);
     us_008_fee_page.activebar.click();
     us_008_fee_page.activebar.click();
    }

    @And("then user should be able to click on Save buttona")
    public void thenUserShouldBeAbleToClickOnSaveButtona() {
     us_008_fee_page.savebutton.click();

    }

 @Then("User should be able to see \"Fee Type successfully created“ message in message box")
 public void userShouldBeAbleToSeeFeeTypeSuccessfullyCreatedMessageInMessageBox()  {

  String actualMessage=us_008_fee_page.messagebox.getText();
  Assert.assertEquals("Fee Type successfully created", actualMessage);
 // System.out.println("us_008_fee_page.messagebox.getText() = " + us_008_fee_page.messagebox.getText());


 }

 @And("the user should be able to input an existant Fee name in name box")
 public void theUserShouldBeAbleToInputAnExistantFeeNameInNameBox() {

     us_008_fee_page.namesearcinput.sendKeys("Songul Fee Type");

 }

 @Then("the user should be able to click the Search button.")
 public void theUserShouldBeAbleToClickTheSearchButton() {
        BrowserUtilities.waitFor(1);
     us_008_fee_page.searchbutton.click();
     BrowserUtilities.waitFor(2);
 }

 @Then("User should be able to see an existant Fee Type")
 public void userShouldBeAbleToSeeAnExistantFeeType() {
     String actualfeename=us_008_fee_page.namesearchbox.getText();
     Assert.assertEquals("Songul Fee Type",actualfeename);

 }

 @Then("the user should be able to click Edit button")
 public void theUserShouldBeAbleToClickEditButton() {
     us_008_fee_page.editbutton.click();

 }

 @And("the user should be able to input new Name in the Name box.")
 public void theUserShouldBeAbleToInputNewNameInTheNameBox() {
        BrowserUtilities.waitFor(1);
     us_008_fee_page.editnameinput.clear();
     us_008_fee_page.editnameinput.sendKeys("Songul New Fee Type");
 }

 @And("the user should be able to input new Code in the Code box.")
 public void theUserShouldBeAbleToInputNewCodeInTheCodeBox() {
     us_008_fee_page.editcodinput.clear();
     us_008_fee_page.editcodinput.sendKeys("123456");
 }

 @Then("User should be able to see „Fee Type successfully updated“ message in message box")
 public void userShouldBeAbleToSeeFeeTypeSuccessfullyUpdatedMessageInMessageBox() {
    String actualMessage= us_008_fee_page.messagebox.getText();
    Assert.assertEquals("Fee Type successfully updated",actualMessage);
 }

 @And("the user should be able to input an existant Fee Code in code box")
 public void theUserShouldBeAbleToInputAnExistantFeeCodeInCodeBox() {
     us_008_fee_page.codesearchbox.sendKeys("12345");

 }

 @And("the user should be able to input new Priority in the Priority boxx.")
 public void theUserShouldBeAbleToInputNewPriorityInThePriorityBoxx() {
     us_008_fee_page.editpriorityinput.clear();
     us_008_fee_page.editpriorityinput.sendKeys("5699");

 }


    @Then("the user should be able to click Deleteone button")
    public void theUserShouldBeAbleToClickDeleteoneButton() {
        BrowserUtilities.waitFor(2);

        us_008_fee_page.deleteButton1.click();
    }

    @Then("the user should be able to click Deletetwo button")
    public void theUserShouldBeAbleToClickDeletetwoButton() {
        us_008_fee_page.deleteButton2.click();
    }

    @And("the user should be able to input new Name in the search Name box.")
    public void theUserShouldBeAbleToInputNewNameInTheSearchNameBox() {
        us_008_fee_page.namesearcinput.sendKeys("Songul New Fee Type");
    }

    @Then("User should be able to see „Fee Type successfully deleted“ message in message box")
    public void userShouldBeAbleToSeeFeeTypeSuccessfullyDeletedMessageInMessageBox() {

       String actualMessage= us_008_fee_page.messagebox.getText();
       Assert.assertEquals("Fee Type successfully deleted",actualMessage);
    }

}
