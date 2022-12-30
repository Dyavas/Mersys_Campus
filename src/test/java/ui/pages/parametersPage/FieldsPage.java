package ui.pages.parametersPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import ui.pages.commenPage.CommenPage;

public class FieldsPage extends CommenPage {
    @FindBy(css = "span.title.dialog-title")
    public WebElement fieldsTitle;
    @FindBy(xpath = "//span[text()='Field Settings']")
    public WebElement fieldSettingsButton;
    @FindBy(xpath = "//hot-toast-container")
    public WebElement popupMesaj;
    @FindBy(css = "button[matbadgecolor='accent']")
    public WebElement fieldsAdd_Button;
    @FindBy(css = "input[data-placeholder='Name']")
    public WebElement fieldsSourceName_Input;
    @FindBy(xpath = "//span[text()='Search']")
    public WebElement fieldsSource_Button;
    @FindBy(xpath = "//ms-edit-button/button")
    public WebElement fieldsEdit_Button;
    @FindBy(xpath = "//ms-delete-button/button")
    public WebElement fieldsDelete_Button;
    @FindBy(xpath = "//button//span[contains(text(),'Delete')]")
    public WebElement fieldsDelete2_Button;
    @FindBy(xpath = "(//input[@data-placeholder=\"Name\"])[2]")
    public WebElement fieldsName_Input;
    @FindBy(xpath = "(//input[@data-placeholder=\"Code\"])[2]")
    public WebElement fieldsCode_Input;
    @FindBy(xpath = "//button//span[text()='Save']")
    public WebElement fieldsSave_Button;
    @FindBy(css = "span[class='iso text-uppercase']")
    public WebElement fieldsAktivFlag_Button;
    @FindBy(css = "span[class='iso']")
    public WebElement fieldsEnFlag_Button;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    public WebElement entetyType_Combobox;

    @FindBy(xpath = "(//input[@inputmode='numeric'])[1]")
    public WebElement ordner_Input;

    @FindBy(xpath = "(//input[@inputmode='numeric'])[2]")
    public WebElement numberOfValues_Input;

    @FindBy(xpath = "(//span[@class='mat-slide-toggle-thumb'])[1]")
    public WebElement requiredButton;

    @FindBy(xpath = "(//span[@class='mat-slide-toggle-thumb'])[2]")
    public WebElement enabledButton;
    @FindBy(xpath = "(//button[@color='accent'])[1]")
    public WebElement editButton;

    @FindBy(xpath = "(//input)[10]")
    public WebElement arrayButton;


}
