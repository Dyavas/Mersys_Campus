package ui.pages.loginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Songul_Loginpage {


    public Songul_Loginpage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@formcontrolname='username']")
    public WebElement nutzernamabox;


    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement passwordbox;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    public WebElement anmeldungbutton;

    @FindBy(xpath = "//span[text()=' Ana Sayfa ']")
    public WebElement anaSayfametni;


}
