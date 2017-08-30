package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ContactUsPage;
import pages.HomePage;
import util.BrowserFactory;

public class Contact_Us_Step_def {
    public BrowserFactory wcon=BrowserFactory.getInstance();
    public HomePage home=null;
    public ContactUsPage contact=null;

    @Given("^I am on \"([^\"]*)\"$")
    public void i_am_on(String url){
        wcon.openBrowser("mozilla");
        home=wcon.openUrl(url);
    }

    @When("^I click on Contact tab on menu$")
    public void i_click_on_Contact_tab_on_menu() {
        contact=home.getContactUs();
    }

    @Then("^I should be able to contact QAWorks by entering \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_should_be_able_to_contact_QAWorks_by_entering_and(String name, String email, String message){
        contact.sendMessageWithDetails(name,email,message);
    }
}
