package pages;

import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage
{

    private MenuPage menu=null;

    public HomePage()
    {
        menu=new MenuPage();
    }

    public ContactUsPage getContactUs()
    {

        return menu.goToContactUsPage();
    }

}
