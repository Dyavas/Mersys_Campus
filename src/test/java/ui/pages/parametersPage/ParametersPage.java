package ui.pages.parametersPage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.commenPage.CommenPage;
import utils.Driver;

import java.util.List;

import static utils.BrowserUtilities.*;

public class ParametersPage extends CommenPage {
    //   By Davut Yavas

    @FindBy(xpath = "(//div[@class='logo']/div/span)[1]")
    public WebElement schoolName;
    @FindBy(css = "div.mat-tooltip-trigger")
    public WebElement adminButton;
    @FindBy(xpath = "//mat-radio-button")
    public List<WebElement> schoolsList;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parametersButton;
    @FindBy(xpath = "//span[text()='Fields']")
    public WebElement fieldsButton;
    @FindBy(xpath = "//span[text()='Field Settings']")
    public WebElement fieldSettingsButton;

    //Mehmet Bozabali City  and Country
    @FindBy(xpath = "//span[text()='Cities']")
    public WebElement citiesButton;
    @FindBy(css = "button[matbadgecolor='accent']")
    public WebElement addButton;
    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement nameInput;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(css = "mat-select[formcontrolname='id']")
    public WebElement countryDropdown;
    @FindBy(xpath = "//input[@data-placeholder='Name']")
    public WebElement searchNameInput;
    @FindBy(xpath = "//span[contains(text(),'Search')]")
    public WebElement searchButton;

    @FindBy(css = "ms-delete-button[table='true']")
    public WebElement deleteButton;
    @FindBy(css = "button[type='Submit']")
    public WebElement deleteConfirmationButton;

    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    public WebElement dashboard;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    public WebElement codeInput;

    @FindBy(css = "span[class=\"mat-slide-toggle-bar\"]")
    public WebElement stateExitsButton;

    @FindBy(xpath = "(//span[contains(text(),'Setup')])[1]")
    public WebElement setupButton;

    @FindBy(xpath = "//span[contains(text(),'Countries')]")
    public WebElement countriesButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "(//button[@aria-haspopup=\"menu\"])[2]")
    public WebElement languageMenu;


    @FindBy(xpath = "//div[contains(text(),' There is no data to display ')]")
    public WebElement noDataMessage;

    @FindBy(css = "span[class=\"username mr-12\"]")
    public WebElement profileSettingsButton;

    @FindBy(xpath = "//span[text()='Schools']")
    public WebElement schoolsButton;

    @FindBy(css = "label[for='mat-radio-20-input']")
    public WebElement mySchoolButton;

    // By Davut Yavas Fields Page
    @FindBy(css = "span.title.dialog-title")
    public WebElement fieldsTitle;
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

    @FindBy(xpath = "(//input)[10]")
    public WebElement arrayButton;

    //    By Yusuf Sahin

    @FindBy(xpath = "//ms-edit-button/button")
    public WebElement editButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;
    @FindBy(css = "input[data-placeholder='Short Name']")
    public WebElement searchShortName;

    @FindBy(css = "[role='combobox'][aria-autocomplete='none']")
    public WebElement CountryClick;

    @FindBy(xpath = "(//mat-select[@role='combobox'][@aria-autocomplete='none'])[3]")
    public WebElement CountryClick1;

    @FindBy(xpath = "//span[text()='All']")
    public WebElement CountryAll;

    @FindBy(css = "button[aria-haspopup='menu'] > span")
    public WebElement iAdmin;

    @FindBy(xpath = "//span[text()='Schools']")
    public WebElement schools;
    @FindBy(css = "#mat-radio-22")
    public WebElement iYSSchool;

    @FindBy(xpath = "//span[text()=' Australia ']")
    public WebElement australia;

    @FindBy(xpath = "//hot-toast-container")
    public WebElement msjContainer;

    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[2]")
    public WebElement flag;

    @FindBy(xpath = "//span[contains(text(),'English')]")
    public WebElement english;

    //   By SongÃ¼l Akkaya Fees and CitizenshipsPage

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    public WebElement feesbutton;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    public WebElement priorityinput;

    @FindBy(xpath = "//span[@class='mat-slide-toggle-bar']")
    public WebElement activebar;

    @FindBy(xpath = "//div[@class='hot-toast-message']")
    public WebElement messagebox;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    public WebElement namesearcinput;

    @FindBy(xpath = "(//tbody/tr/td)[2]")
    public WebElement namesearchbox;

    @FindBy(xpath = "//input[@data-placeholder='Code']")
    public WebElement codesearchbox;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    public WebElement editpriorityinput;
    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenshipsButton;


    //Zehra
    @FindBy(xpath = "//input[@id='ms-text-field-1']")
    public WebElement name_Input;
    @FindBy(xpath = "//input[@id='ms-masked-text-field-0']")
    public WebElement IBANInput;
    @FindBy(xpath = "//input[@id='ms-text-field-2']")
    public WebElement IntCodeInput;

    @FindBy(id = "mat-slide-toggle-7-input")
    public WebElement checkboxActive;



    //ms-save-button[@class='ng-star-inserted']
    @FindBy(tagName = "dynamic-view")
    public WebElement message;
    //dynamic-view[class='ng-star-inserted'] div
    @FindBy(css = "div[class='mat-form-field-flex ng-tns-c77-95']")
    public WebElement currencyDropdown;

    @FindBy(css = "input[id=ms-text-field-0]")
    public WebElement nameInputSearchBox;

    @FindBy(xpath = "//div[@id='mat-select-value-7']")
    public WebElement currencyInputSearchBox;



    public void selectCurrency(String cur) {
        currencyDropdown.click();
        //Driver.getDriver().findElement(By.cssSelector("div[class='mat-form-field-flex ng-tns-c77-95']")).click();
        Driver.getDriver().findElement(By.xpath("//span[normalize-space()='" + cur + "']")).click();

    }

    public void clickSaveButton() {
        saveButton.click();
    }
    public void verifySaveButtonIsNotClickable() {///duzelt
        if(!saveButton.isEnabled()){
            clickSaveButton();
            waitFor(1);
            String actualMessage = message.getText();
            waitFor(2);
            Assert.assertFalse("test fail", actualMessage.isEmpty());
            // System.out.println("click");
        }else{
            System.out.println(saveButton.isEnabled());
            Assert.assertTrue(saveButton.isEnabled());
        }
    }
    public void verfyBankAccOnPage(String name) {
        String actualMessage=Driver.getDriver().findElement(By.xpath("//td[normalize-space()='"+name+"']")).getText();
        Assert.assertEquals(name,actualMessage);
    }

    public void verfyIban(String IBAN) {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//td[normalize-space()='"+IBAN+"']")).isDisplayed());
    }

    public void deleteBankAccFromList(String IBAN) {
        Driver.getDriver().findElement(By.xpath("(//tr/td[contains(text(),'"+IBAN+"')]//../td)[7]/div[1]/ms-delete-button")).click();
        clickWithJs(Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Delete']")));

    }

    public void editButton(String IBAN) {
        Driver.getDriver().findElement(By.xpath("(//tr/td[contains(text(),'"+IBAN+"')]//../td)[7]/div[1]/ms-edit-button")).click();
        clickWithJs(Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Edit']")));
    }

    public void selectCurrencyDropdownBox(String currency) {
        currencyInputSearchBox.click();
        Driver.getDriver().findElement(By.xpath("//span[normalize-space()='" + currency + "']")).click();
    }
}
