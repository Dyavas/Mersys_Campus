package ui.pages.dashboardPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.commenPage.CommenPage;

import java.util.List;
public class DashboardPage extends CommenPage {

    //by Yusuf Sahin
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setupOne;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "//span[text()='States']")
    public WebElement states;

    @FindBy(xpath = "//span[text()='Countries']")
    public WebElement country;

    @FindBy(xpath = "//span[text()='Cities']")
    public WebElement cities;

    //By Davut Yavas

    @FindBy(xpath = "(//div[@class='logo']/div/span)[1]")
    public WebElement schoolName;

    @FindBy(css = "div.mat-tooltip-trigger")
    public WebElement adminButton;

    @FindBy(xpath = "//span[text()='Schools']")
    public WebElement schoolsButton;
    @FindBy(xpath = "//mat-radio-button")
    public List<WebElement> schoolsList;


}
