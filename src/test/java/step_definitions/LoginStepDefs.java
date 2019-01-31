package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EntryPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.*;

public class LoginStepDefs {

    /*    BACKGROUND steps    */
    @Given("the user goes to url")
    public void the_user_goes_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("the user cliks on BriteErpDemo button")
    public void the_user_cliks_on_BriteErpDemo_button() {
        EntryPage entryPage = new EntryPage();
        entryPage.brietErpDemoAnchor.click();
    }

    @Then("the title should be Login | Website localhost")
    public void the_title_should_be_Login_Website_localhost() {
        assertEquals("Login | Website localhost", Driver.getDriver().getTitle());
    }


    /*    SCENARIO steps    */
    @When("the manager enters valid email address")
    public void the_manager_enters_valid_email_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the manager enters valid password")
    public void the_manager_enters_valid_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the manager clicks Log in button")
    public void the_manager_clicks_Log_in_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the title should be #Inbox - Odoo")
    public void the_title_should_be_Inbox_Odoo() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
