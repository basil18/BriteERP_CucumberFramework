package step_definitions;

import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EntryPage;
import pages.SigInPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.*;

public class LoginStepDefs {
    Faker faker;

    /*    BACKGROUND steps    */
    @Given("the user goes to url")
    public void the_user_goes_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("the user clicks on BriteErpDemo button")
    public void the_user_cliks_on_BriteErpDemo_button() {
        EntryPage entryPage = new EntryPage();

        entryPage.brietErpDemoAnchor.click();

        entryPage = null;
    }

    @Then("the title should be Login | Website localhost")
    public void theTitleShouldBeLoginWebsiteLocalhost() {
        assertEquals("Login | Website localhost", Driver.getDriver().getTitle());
    }

    @Then("the database should be BriteErpDemo")
    public void the_database_should_be_BriteErpDemo() {
        SigInPage sigInPage = new SigInPage();

        assertEquals("BriteErpDemo",
                sigInPage.databaseField.getAttribute("value"));

        sigInPage = null;
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

    @When("the manager enters wrong email address")
    public void the_manager_enters_wrong_email_address() {
        SigInPage sigInPage = new SigInPage();
        faker = new Faker();

        sigInPage.usernameInput.sendKeys(faker.internet().emailAddress());

        sigInPage = null;
        faker = null;
    }

    @When("the user enters valid email address")
    public void the_user_enters_valid_email_address() {
        SigInPage sigInPage = new SigInPage();

        sigInPage.usernameInput.sendKeys(ConfigReader.getProperty("user-username"));

        sigInPage = null;
    }

    @When("the user enters valid password")
    public void the_user_enters_valid_password() {
        SigInPage sigInPage = new SigInPage();

        sigInPage.passwordInput.sendKeys(ConfigReader.getProperty("user-password"));

        sigInPage = null;
    }

    @When("the user clicks Log in button")
    public void the_user_clicks_Log_in_button() {
        SigInPage sigInPage = new SigInPage();

        sigInPage.loginButton.click();

        sigInPage = null;
    }

    @When("the user enters wrong email address")
    public void the_user_enters_wrond_email_address() {
        SigInPage sigInPage = new SigInPage();
        faker = new Faker();

        sigInPage.usernameInput.sendKeys(faker.internet().emailAddress());

        sigInPage = null;
        faker = null;
    }

    @And("the manager enters wrong password")
    public void theManagerEntersWrongPassword() {
        SigInPage sigInPage = new SigInPage();
        faker = new Faker();

        sigInPage.passwordInput.sendKeys(faker.internet().password());

        sigInPage = null;
        faker = null;
    }

    @And("the user enters wrong password")
    public void theUserEntersWrongPassword() {
        SigInPage sigInPage = new SigInPage();
        faker = new Faker();

        sigInPage.passwordInput.sendKeys(faker.internet().password());

        sigInPage = null;
        faker = null;
    }

    @When("the manager doesn't enter an email address")
    public void theManagerDoesnTEnterAnEmailAddress() {
        // no code here, since no action needs to be taken
    }

    @When("the user doesn't enter an email address")
    public void theUserDoesnTEnterAnEmailAddress() {
        // no code here, since no action needs to be taken
    }

    @And("the manager doesn't enter a password")
    public void theManagerDoesnTEnterAPassword() {
        // no code here, since no action needs to be taken
    }

    @And("the user doesn't enter a password")
    public void theUserDoesnTEnterAPassword() {
        // no code here, since no action needs to be taken
    }

    @Then("the title should be {string}")
    public void theTitleShouldBe(String arg0) {
    }
}
