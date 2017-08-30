package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.PageConstants;

public class MenuPage extends BasePage {
    @FindBy(xpath= PageConstants.CONTACT_US)
    WebElement contactUs;

    public ContactUsPage goToContactUsPage()
    {
        Actions action=new Actions(selenium.driver);
        action.moveToElement(contactUs);
        action.click();
        action.perform();
        return new ContactUsPage();
    }
}
