package ui.stepDefinitions.loginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import ui.pages.loginPage.LoginPage;
import ui.pages.parametersPage.FieldsPage;
import utils.BrowserUtilities;
import utils.ConfigurationReader;
import utils.Driver;

import java.util.ArrayList;
import java.util.List;

public class US_002_LoginPageStepD {
    LoginPage loginPage = new LoginPage();
    FieldsPage fieldsPage = new FieldsPage();

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
        BrowserUtilities.waitForVisible(fieldsPage.fieldsAktivFlag_Button, 2);

        if (!fieldsPage.fieldsAktivFlag_Button.getText().contains(text)) {
            BrowserUtilities.clickWithJs(fieldsPage.fieldsAktivFlag_Button);
            BrowserUtilities.clickWithJs(fieldsPage.fieldsEnFlag_Button);

        }
    }

    @Then("user verifies the titles are {string} visible")
    public void userVerifiesTheTitlesAreAndVisible(String schoolName) {

        BrowserUtilities.waitForVisible(loginPage.schoolName, 2);

        if (!loginPage.schoolName.getText().contains(schoolName)) {
            BrowserUtilities.clickWithJs(loginPage.adminButton);
            BrowserUtilities.clickWithJs(loginPage.schoolsButton);
            List<WebElement> schoolList = loginPage.schoolsList;

            for (WebElement schoolElement : schoolList) {
                if (schoolName == schoolElement.getText()) {
                    BrowserUtilities.clickWithJs(schoolElement);
                    System.out.println("Secilen Okul: " + schoolElement.getText());
                }
            }
        }
    }
}

