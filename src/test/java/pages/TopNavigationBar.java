package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TopNavigationBar {
    public TopNavigationBar() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (linkText = "Discuss")
    public WebElement discussAnchor;

    @FindBy (linkText = "Calendar")
    public WebElement calendarAnchor;

    @FindBy (linkText = "Notes")
    public WebElement notesAnchor;

    @FindBy (linkText = "CRM")
    public WebElement crmAnchor;

    @FindBy (linkText = "Sales")
    public WebElement salesAnchor;

    @FindBy (linkText = "Website")
    public WebElement websiteAnchor;

    @FindBy (linkText = "Point of Sale")
    public WebElement pointOfSaleAnchor;

    @FindBy (linkText = "Purchases")
    public WebElement purchasesAnchor;

    @FindBy (linkText = "Inventory")
    public WebElement inventoryAnchor;

    @FindBy (linkText = "Repairs")
    public WebElement repairsAnchor;

    @FindBy (linkText = "Events")
    public WebElement eventsAnchor;

    @FindBy (linkText = "Employees")
    public WebElement employeesAnchor;

    @FindBy (linkText = "Leaves")
    public WebElement leavesAnchor;

    @FindBy (linkText = "Expenses")
    public WebElement expensesAnchor;

    @FindBy (linkText = "Maintenance")
    public WebElement maintenanceAnchor;

    @FindBy (linkText = "Dashboards")
    public WebElement dashboardsAnchor;

    @FindBy (linkText = "More")
    public WebElement moreAnchor;

    @FindBy (className = "oe_topbar_name")
    public WebElement accountHolderNameAnchor;

    @FindBy (linkText = "Documentation")
    public WebElement documentationAnchor;

    @FindBy (linkText = "Support")
    public WebElement supportAnchor;

    @FindBy (linkText = "Preferences")
    public WebElement preferencesAnchor;

    @FindBy (linkText = "My Odoo.com account")
    public WebElement myAccountAnchor;

    @FindBy (linkText = "Log out")
    public WebElement logOutAnchor;
}
