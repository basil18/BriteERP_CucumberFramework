package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EntryPage;
import pages.SigInPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.*;

public class LoginStepDefs {

    /*    BACKGROUND steps    */
    @Given("the user goes to url")
    public void the_user_goes_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("the user clicks on BriteErpDemo button")
    public void the_user_cliks_on_BriteErpDemo_button() {
        EntryPage entryPage = new EntryPage();
        entryPage.brietErpDemoAnchor.click();
    }

    @Then("the title should be Login | Website localhost")
    public void the_title_should_be_Login_Website_localhost() {
        assertEquals("Login | Website localhost", Driver.getDriver().getTitle());
    }

    @Then("the database should be BriteErpDemo")
    public void the_database_should_be_BriteErpDemo() {
        SigInPage sigInPage = new SigInPage();
        assertEquals("BriteErpDemo",
                sigInPage.databaseField.getAttribute("value"));
    }

    /*    SCENARIO steps    */
    @When("the manager enters valid email address")
    public void the_manager_enters_valid_email_address() {
        SigInPage sigInPage = new SigInPage();
        sigInPage.usernameInput.sendKeys(ConfigReader.getProperty("manager-username"));
        sigInPage = null;
    }

    @When("the manager enters valid password")
    public void the_manager_enters_valid_password() {
        SigInPage sigInPage = new SigInPage();
        sigInPage.passwordInput.sendKeys(ConfigReader.getProperty("manager-password"));
        sigInPage = null;
    }

    @When("the manager clicks Log in button")
    public void the_manager_clicks_Log_in_button() {
        SigInPage sigInPage = new SigInPage();
        sigInPage.loginButton.click();
        sigInPage = null;
    }

    @Then("the title should be Odoo")
    public void the_title_should_be_Inbox_Odoo() {
        assertEquals("Odoo",
                Driver.getDriver().getTitle());
    }
}
