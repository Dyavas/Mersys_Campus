package ui.pages.countryPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.commenPage.CommenPage;

public class CountryPage extends CommenPage {

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement usernameInput;

    @FindBy(css = "input[placeholder='Password']")
    public WebElement passwordInput;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'Invalid')]")
    public WebElement invalidButton;

    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    public WebElement dashboard;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    public WebElement cookiesButton;

    @FindBy(xpath = "//div//button[@matbadgecolor='accent']//span")
    public WebElement addButton;

    @FindBy(xpath = "(//button[@matbadgecolor='accent'])[2]")
    public WebElement addCountryButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    public WebElement searchNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    public WebElement codeInput;

    @FindBy(xpath = "//input[@data-placeholder='Code']")
    public WebElement searchNCodeInput;

    @FindBy(xpath = "//ms-edit-button[@table='true']//button//span")
    public WebElement editButton;

    @FindBy(xpath = "//ms-delete-button[@table='true']//button//span")
    public WebElement deleteButton;

    @FindBy(css = "button[type='Submit']")
    public WebElement deleteConfirmationButton;

    @FindBy(css = "span[class=\"mat-slide-toggle-bar\"]")
    public WebElement stateExitsButton;

    @FindBy(xpath = "(//span[contains(text(),'Setup')])[1]")
    public WebElement setupButton;

    @FindBy(xpath = "//span[contains(text(),'Parameter')]")
    public WebElement parametersButton;

    @FindBy(xpath = "//span[contains(text(),'Countries')]")
    public WebElement countriesButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "(//button[@aria-haspopup=\"menu\"])[2]")
    public WebElement languageMenu;

    @FindBy(xpath = "//span[contains(text(),'English')]")
    public WebElement englishMenu;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    public WebElement searchButton;

    @FindBy(xpath = "//div[contains(text(),' There is no data to display ')]")
    public WebElement noDataMessage;

    @FindBy(css = "span[class=\"username mr-12\"]")
    public WebElement profileSettingsButton;

    @FindBy(xpath = "//span[text()='Schools']")
    public WebElement schoolsButton;

    @FindBy(css = "label[for='mat-radio-20-input']")
    public WebElement mySchoolButton;


}
