package ui.pages.dashboardPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.commenPage.CommenPage;

//by Yusuf Sahin
public class DashboardPage extends CommenPage {

    //by Yusuf Sahin
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setupOne;

    //by Yusuf Sahin
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    //by Yusuf Sahin
    @FindBy(xpath = "//span[text()='States']")
    public WebElement states;

    //by Yusuf Sahin
    @FindBy(xpath = "//span[text()='Countries']")
    public WebElement country;

    //by Yusuf Sahin
    @FindBy(xpath = "//span[text()='Cities']")
    public WebElement cities;

}
