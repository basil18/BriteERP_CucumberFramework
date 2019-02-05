package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchContextException;
import pages.*;
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
        TopNavigationBar navPage = new TopNavigationBar();

        navPage.purchasesAnchor.click();

        navPage = null;
    }

    @Then("the title should be Requests for Quotation - Odoo")
    public void the_title_should_be_Requests_for_Quotation_Odoo() {
        PurchasesPage page = new PurchasesPage();

        BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                "Requests for Quotation",
                10);

        Assert.assertEquals("Requests for Quotation - Odoo",
                Driver.getDriver().getTitle());

        page = null;
    }

    @When("the Purchase Orders button is clicked")
    public void the_Purchase_Orders_button_is_clicked() {
        PurchasesPage page = new PurchasesPage();

        page.purchaseOrdersAnchor.click();

        page = null;
    }

    @Then("the title should be Purchase Orders - Odoo")
    public void the_title_should_be_Purchase_Orders_Odoo() {
        PurchasesPage page = new PurchasesPage();

        BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                "Purchase Orders",
                10);

        Assert.assertEquals("Purchase Orders - Odoo",
                Driver.getDriver().getTitle());

        page = null;
    }

    @Then("the user should be on Purchase Orders page")
    public void the_user_should_be_on_Purchase_Orders_page() {
        PurchasesPage page = new PurchasesPage();

        Assert.assertTrue(
                BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                "Purchase Orders",
                10));

        page = null;
    }
}
