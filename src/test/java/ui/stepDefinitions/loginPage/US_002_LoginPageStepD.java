package ui.stepDefinitions.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import ui.pages.loginPage.LoginPage;
import ui.pages.parametersPage.ParametersPage;
import utils.BrowserUtilities;
import utils.ConfigurationReader;

import java.util.List;

public class US_002_LoginPageStepD {

    ParametersPage parametersPage = new ParametersPage();
    LoginPage loginPage=new LoginPage();

    @When("the user inputs a valid  email")
    public void theUserInputsAValidEmail() {
        BrowserUtilities.waitForVisible(loginPage.username_Input, 2);
        loginPage.username_Input.sendKeys(ConfigurationReader.getProperty("username"));

    }

    @And("the user inputs a valid password")
    public void theUserInputsAValidPassword() {
        BrowserUtilities.waitForVisible(loginPage.password_Input, 2);
        loginPage.password_Input.sendKeys(ConfigurationReader.getProperty("password"));

    }

    @And("the user clicks the Login button on the login page")
    public void theUserClicksTheLoginButtonOnTheLoginPage() {
        BrowserUtilities.clickWithJs(loginPage.login_Button);
    }

    @When("the user should be to click on {string} flag")
    public void theUserShouldBeToClickOnFlag(String text) {

        BrowserUtilities.waitForVisible(parametersPage.fieldsAktivFlag_Button, 2);

        if (!parametersPage.fieldsAktivFlag_Button.getText().contains(text)) {
            BrowserUtilities.clickWithJs(parametersPage.fieldsAktivFlag_Button);
            BrowserUtilities.clickWithJs(parametersPage.fieldsEnFlag_Button);

        }
    }

    @Then("user verifies the titles are {string} visible")
    public void userVerifiesTheTitlesAreAndVisible(String schoolName) {

        BrowserUtilities.waitForVisible(parametersPage.schoolName, 2);

        if (!parametersPage.schoolName.getText().contains(schoolName)) {
            BrowserUtilities.clickWithJs(parametersPage.adminButton);
            BrowserUtilities.clickWithJs(parametersPage.schoolsButton);
            List<WebElement> schoolList = parametersPage.schoolsList;

            for (WebElement schoolElement : schoolList) {
                if (schoolName == schoolElement.getText()) {
                    BrowserUtilities.clickWithJs(schoolElement);
                    System.out.println("Secilen Okul: " + schoolElement.getText());
                }
            }
        }
    }
}

