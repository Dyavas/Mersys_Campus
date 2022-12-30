package ui.pages.parametersPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.commenPage.CommenPage;

public class ParametersPage extends CommenPage {
    @FindBy(xpath = "//span[text()='Setup']")
    public WebElement setupButton;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parametersButton;

    @FindBy(xpath = "//span[text()='Fields']")
    public WebElement fieldsButton;

    @FindBy(xpath = "//span[text()='Field Settings']")
    public WebElement fieldSettingsButton;


}
