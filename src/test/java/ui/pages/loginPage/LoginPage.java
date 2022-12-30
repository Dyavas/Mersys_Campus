package ui.pages.loginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.commenPage.CommenPage;

import java.util.List;

public class LoginPage extends CommenPage {
    @FindBy(xpath = "//input[@formcontrolname='username']")
    public WebElement username_Input;
    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement password_Input;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    public WebElement login_Button;

    @FindBy(xpath = "(//div[@class='logo']/div/span)[1]")
    public WebElement schoolName;
    @FindBy(css = "div.mat-tooltip-trigger")
    public WebElement adminButton;

    @FindBy(xpath = "//span[text()='Schools']")
    public WebElement schoolsButton;
    @FindBy(xpath = "//mat-radio-button")
    public List<WebElement> schoolsList;



    //zehra localden selamlar
    //
    //

    ///merhaba

    //
///
   // deneme
}
