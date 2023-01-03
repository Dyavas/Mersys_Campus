package ui.pages.cityPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ui.pages.commenPage.CommenPage;
import utils.BrowserUtilities;
import utils.Driver;

import java.util.List;

public class CityPage extends CommenPage {
    @FindBy(xpath = "//span[text()='Cities']")
    public WebElement citiesButton;

    @FindBy(css = "button[matbadgecolor='accent']")
    public WebElement addButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-save-button//button[@color='accent']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(css = "mat-select[formcontrolname='id']")
    public WebElement countryDropdown;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    public WebElement searchNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement editNameInput;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button[@table='true']//button//span")
    public WebElement editButton;


    @FindBy(css = "ms-delete-button[table='true']")
    public WebElement deleteButton;

    @FindBy(css = "button[type='Submit']")
    public WebElement deleteConfirmationButton;

}
