package ui.stepDefinitions.loginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ui.pages.loginPage.Songul_Loginpage;
import utils.Driver;

public class Songul_LoginSteps {


    Songul_Loginpage songul_loginpage=new Songul_Loginpage();

    @When("User navigate to {string}")
    public void userNavigateTo(String campusUrl) {

        Driver.getDriver().get(campusUrl);


    }

    @And("User enter valid username in username box")
    public void userEnterValidUsernameInUsernameBox() {

        songul_loginpage.nutzernamabox.sendKeys("admin_intern");

    }

    @And("User enter valid password in password box")
    public void userEnterValidPasswordInPasswordBox() {

        songul_loginpage.passwordbox.sendKeys("admin12345");

    }

    @Then("User click anmeldung button")
    public void userClickAnmeldungButton() {

        songul_loginpage.anmeldungbutton.click();
    }

    @And("User login Campus homepage")
    public void userLoginCampusHomepage() {

        System.out.println("songul_loginpage.anaSayfametni.getText() = " + songul_loginpage.anaSayfametni.getText());
        Assert.assertEquals("Ana Sayfa",songul_loginpage.anaSayfametni.getText());

    }
}
