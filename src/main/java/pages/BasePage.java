package pages;

import org.openqa.selenium.support.PageFactory;
import util.BrowserFactory;


public class BasePage {
    public BrowserFactory selenium=BrowserFactory.getInstance();

    public BasePage()
    {
        PageFactory.initElements(selenium.driver,this);
    }
}
