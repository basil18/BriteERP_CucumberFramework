package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchContextException;
import pages.EntryPage;
import pages.SigInPage;
import pages.TopNavigationPage;
import utilities.BrowserUtils;
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
        TopNavigationPage navPage = new TopNavigationPage();

        navPage.purchasesAnchor.click();

        navPage = null;
    }

    //TODO need to replace WAIT method with Explicit Wait method in BrowserUtils
    @Then("the title should be Requests for Quotation - Odoo")
    public void the_title_should_be_Requests_for_Quotation_Odoo() {
        BrowserUtils.wait(6);
        Assert.assertEquals("Requests for Quotation - Odoo",
                Driver.getDriver().getTitle());
    }
}
