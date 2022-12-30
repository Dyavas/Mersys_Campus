package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class US_021_Citizenships_Page {

    public US_021_Citizenships_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenshipsButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement citizenshipsNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement citizenshipsShortnameInput;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement citizenshipsSaveButton;

    @FindBy(xpath = "//body[@class='ng-tns-0-0']")
    public WebElement citizenshipsMessageBox;

    @FindBy(xpath = "//div[@class='hot-toast-message']")
    public WebElement messagebox;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement citizenshipsSearchNameInput;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public  WebElement citizenshipSearchShortNameInput;

    @FindBy(xpath = "//div[text()=' There is no data to display ']")
    public WebElement noDataMessage;

}
