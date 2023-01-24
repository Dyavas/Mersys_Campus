package ui.pages.loginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.commenPage.CommenPage;

public class LoginPage extends CommenPage {

    //By Davut Yavas
    @FindBy(xpath = "//input[@formcontrolname='username']")
    public WebElement username_Input;
    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement password_Input;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    public WebElement login_Button;
}
