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
    }

    @When("the Purchases button is clicked")
    public void the_Purchases_button_is_clicked() {
        TopNavigationBar navPage = new TopNavigationBar();

        navPage.purchasesAnchor.click();
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
    }

    @Then("the title should be Purchase Orders - Odoo")
    public void the_title_should_be_Purchase_Orders_Odoo() {
        PurchasesPage page = new PurchasesPage();

        BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                "Purchase Orders",
                10);

        Assert.assertEquals("Purchase Orders - Odoo",
                Driver.getDriver().getTitle());
    }

    @Then("the user should be on Purchase Orders page")
    public void the_user_should_be_on_Purchase_Orders_page() {
        PurchasesPage page = new PurchasesPage();

        Assert.assertTrue(
                BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                "Purchase Orders",
                10));
    }

    @When("the Vendors button is clicked")
    public void the_Vendors_button_is_clicked() {
        PurchasesPage page = new PurchasesPage();

        page.vendorsAnchor.click();
    }

    @Then("the user should be on Vendors page")
    public void the_user_should_be_on_Vendors_page() {
        PurchasesPage page = new PurchasesPage();

        Assert.assertTrue(
                BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                        "Vendors",
                        10));
    }

    @Then("the title should be Vendors - Odoo")
    public void the_title_should_be_Vendors_Odoo() {
        PurchasesPage page = new PurchasesPage();

        BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                "Vendors",
                10);

        Assert.assertEquals("Vendors - Odoo",
                Driver.getDriver().getTitle());
    }

    @When("the Products button is clicked")
    public void the_Products_button_is_clicked() {
        PurchasesPage page = new PurchasesPage();

        page.productsAnchor.click();
    }

    @Then("the user should be on Products page")
    public void the_user_should_be_on_Products_page() {
        PurchasesPage page = new PurchasesPage();

        Assert.assertTrue(
                BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                        "Products",
                        10));
    }

    @Then("the title should be Products - Odoo")
    public void the_title_should_be_Products_Odoo() {
        PurchasesPage page = new PurchasesPage();

        BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                "Products",
                10);

        Assert.assertEquals("Products - Odoo",
                Driver.getDriver().getTitle());
    }

    @When("the Incoming Products button is clicked")
    public void the_Incoming_Products_button_is_clicked() {
        PurchasesPage page = new PurchasesPage();

        page.incomingProductsAnchor.click();
    }

    @Then("the user should be on Incoming Products page")
    public void the_user_should_be_on_Incoming_Products_page() {
        PurchasesPage page = new PurchasesPage();

        Assert.assertTrue(
                BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                        "Incoming Products",
                        10));
    }

    @Then("the title should be Incoming Products - Odoo")
    public void the_title_should_be_Incoming_Products_Odoo() {
        PurchasesPage page = new PurchasesPage();

        BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                "Incoming Products",
                10);

        Assert.assertEquals("Incoming Products - Odoo",
                Driver.getDriver().getTitle());
    }

    @When("the Vendor Bills button is clicked")
    public void the_Vendor_Bills_button_is_clicked() {
        PurchasesPage page = new PurchasesPage();

        page.vendorBillsAnchor.click();
    }

    @Then("the user should be on Vendor Bills page")
    public void the_user_should_be_on_Vendor_Bills_page() {
        PurchasesPage page = new PurchasesPage();

        Assert.assertTrue(
                BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                        "Vendor Bills",
                        10));
    }

    @Then("the title should be Vendor Bills - Odoo")
    public void the_title_should_be_Vendor_Bills_Odoo() {
        PurchasesPage page = new PurchasesPage();

        BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                "Vendor Bills",
                10);

        Assert.assertEquals("Vendor Bills - Odoo",
                Driver.getDriver().getTitle());
    }

    @When("the Reporting button is clicked")
    public void the_Reporting_button_is_clicked() {
        PurchasesPage page = new PurchasesPage();

        page.reportingAnchor.click();
    }

    @Then("the user should be on Purchase Analysis page")
    public void the_user_should_be_on_Purchase_Analysis_page() {
        PurchasesPage page = new PurchasesPage();

        Assert.assertTrue(
                BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                        "Purchase Analysis",
                        10));
    }

    @Then("the title should be Purchase Analysis - Odoo")
    public void the_title_should_be_Purchase_Analysis_Odoo() {
        PurchasesPage page = new PurchasesPage();

        BrowserUtils.isElementsTextAMatch(page.activePageNameLabel,
                "Purchase Analysis",
                10);

        Assert.assertEquals("Purchase Analysis - Odoo",
                Driver.getDriver().getTitle());
    }
}
