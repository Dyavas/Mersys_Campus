package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class US_008_Fee_Page {

    public US_008_Fee_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    public WebElement cookiesAcceptbutton;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setupbutton;

    @FindBy(xpath = "//span[text()='Parameters']")
    public  WebElement parametersbutton;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    public WebElement feesbutton;

    @FindBy (xpath = "(//span[@class='mat-button-wrapper'])[10]")
    public WebElement addbutton;

    @FindBy(xpath = "//input[@id='ms-text-field-3']")
    public WebElement nameinput;

     @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    public WebElement codeinput;

     @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
     public WebElement priorityinput;

     @FindBy(xpath = "//span[@class='mat-slide-toggle-bar']")
    public WebElement activebar;

     @FindBy(xpath = "//span[text()='Save']")
    public WebElement savebutton;

     @FindBy(xpath = "//div[@class='hot-toast-message']")
    public WebElement messagebox;

     @FindBy(xpath = "//input[@id='ms-text-field-0']")
    public WebElement namesearcinput;

     @FindBy(xpath = "//span[text()='Search']")
     public WebElement searchbutton;

     @FindBy(xpath = "(//tbody/tr/td)[2]")
    public WebElement namesearchbox;

     @FindBy(xpath = "//input[@data-placeholder='Code']")
    public WebElement codesearchbox;

    @FindBy(xpath = "//ms-edit-button")
    public WebElement editbutton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement editnameinput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement editcodinput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    public WebElement editpriorityinput;

    @FindBy(xpath = "//ms-delete-button")
    public WebElement deleteButton1;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteButton2;





}
