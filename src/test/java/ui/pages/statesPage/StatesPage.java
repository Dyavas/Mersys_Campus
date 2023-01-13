package ui.pages.statesPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.pages.commenPage.CommenPage;


public class StatesPage extends CommenPage {

    WebElement myElement;
    WebDriverWait wait;

    //by Yusuf Sahin
    @FindBy(xpath = "//input[@formcontrolname='username']")
    public WebElement username;

    //by Yusuf Sahin
    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement password;

    //by Yusuf Sahin
    @FindBy(xpath = "//span[text()=' ANMELDUNG ']")
    public WebElement loginButton;

    //by Yusuf Sahin
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    public WebElement addButton;

    //by Yusuf Sahin
    @FindBy(xpath = "//ms-save-button//button")
    public WebElement saveButton;

    //by Yusuf Sahin
    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    //by Yusuf Sahin
    @FindBy(xpath = "//span[text()=' Delete ']")
    public WebElement deleteButton;

    //by Yusuf Sahin
    @FindBy(xpath = "//ms-delete-button/button")
    public WebElement deleteIcon;

    //by Yusuf Sahin
    @FindBy(xpath = "//ms-edit-button/button")
    public WebElement editIcon;

    //by Yusuf Sahin
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    //by Yusuf Sahin
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;

    //by Yusuf Sahin
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    //by Yusuf Sahin
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    public WebElement searchNameInput;

    //by Yusuf Sahin
    @FindBy(css = "[role='combobox'][aria-autocomplete='none']")
    public WebElement CountryClick;

    //by Yusuf Sahin
    @FindBy(xpath = "(//mat-select[@role='combobox'][@aria-autocomplete='none'])[3]")
    public WebElement CountryClick1;

    //by Yusuf Sahin
    @FindBy(xpath = "//span[text()='All']")
    public WebElement CountryAll;

    //by Yusuf Sahin
    @FindBy(css = "button[aria-haspopup='menu'] > span")
    public WebElement iAdmin;

    //by Yusuf Sahin
    @FindBy(xpath = "//span[text()='Schools']")
    public WebElement schools;

    //by Yusuf Sahin
    @FindBy(css = "#mat-radio-22")
    public WebElement iYSSchool;

    //by Yusuf Sahin
    @FindBy(xpath = "//span[text()='Cities']")
    public WebElement cities;

    //by Yusuf Sahin
    @FindBy(xpath = "//span[text()=' Australia ']")
    public WebElement australia;

    //by Yusuf Sahin
    @FindBy(xpath = "//hot-toast-container")
    public WebElement msjContainer;

    //by Yusuf Sahin
    @FindBy(xpath = "//div[contains(text(),'Error')]")
    public WebElement ErrorMessage;

    //by Yusuf Sahin
    @FindBy(xpath = "//div[text()=' There is no data to display ']")
    public WebElement noDataMessage;

    //by Yusuf Sahin
    @FindBy(css = "div[class='ng-star-inserted'][fxhide]>span")
    public WebElement dashboardMessage;

    //by Yusuf Sahin
    @FindBy(xpath = "//button[text()='Accept all cookies']")
    public WebElement acceptallcookies;

    //by Yusuf Sahin
    @FindBy(xpath = "//span[text()=' Deutschland ']")
    public WebElement deutschland;

    //by Yusuf Sahin
    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[2]")
    public WebElement flag;

    //by Yusuf Sahin
    @FindBy(xpath = "//span[contains(text(),'English')]")
    public WebElement english;


}
