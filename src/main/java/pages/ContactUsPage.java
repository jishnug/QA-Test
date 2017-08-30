package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.PageConstants;

public class ContactUsPage extends BasePage {

    @FindBy(css= PageConstants.NAME)
    WebElement name;
    @FindBy(css=PageConstants.EMAIL)
    WebElement email;
    @FindBy(xpath=PageConstants.Message)
    WebElement message;
    @FindBy(css=PageConstants.SEND)
    WebElement send;

    private MenuPage menu=null;
    public ContactUsPage()
    {
        menu=new MenuPage();
    }

    public void sendMessageWithDetails(String nameValue, String emailValue, String messageValue)
    {
        name.sendKeys(nameValue);
        email.sendKeys(emailValue);
        message.sendKeys(messageValue);
        send.click();
    }

}
