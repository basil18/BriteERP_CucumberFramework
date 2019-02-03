package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.NoSuchContextException;
import pages.EntryPage;
import pages.MainTopNagivationPage;
import pages.SigInPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PurchasesStepDefs {
    @Given("the {string} is logged in")
    public void the_is_logged_in(String string) {
        if (!string.equals("manager") && !string.equals("user"))
            throw new NoSuchContextException("You can log in either as a manager or user");

        EntryPage entryPage = new EntryPage();
        SigInPage sigInPage = new SigInPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        entryPage.brietErpDemoAnchor.click();
        sigInPage.usernameInput.sendKeys(
                (string.equals("manager") ? ConfigReader.getProperty("manager-username") :
                 ConfigReader.getProperty("user-username")) );
        sigInPage.passwordInput.sendKeys(
                (string.equals("manager") ? ConfigReader.getProperty("manager-password") :
                 ConfigReader.getProperty("user-password")) );
        sigInPage.loginButton.click();

        entryPage = null;
        sigInPage = null;
    }

    @When("the Purchases button is clicked")
    public void the_Purchases_button_is_clicked() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the title should be Requests for Quotation - Odoo")
    public void the_title_should_be_Requests_for_Quotation_Odoo() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
