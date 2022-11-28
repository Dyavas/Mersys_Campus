package ui.pages.commenPage;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public abstract class CommenPage {
    public CommenPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
