package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PurchasesPage {
    public PurchasesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /* <<< Top Navigation Bar Elements >>> */
        /* this is the WHOLE panel as element, can be checked for availability */
        @FindBy(className = "o_control_panel")
        public WebElement subNavigationPanel;

        /* this is the exact CSS to the name of the page open at the moment
           can be used to verify the user's location */
        @FindBy (css = ".breadcrumb >li")
        public WebElement activePageNameLabel;

        /* if clicked, this element will make the following elements active */
        @FindBy (className = "o_searchview_more")
        public WebElement advancedSearchToggleButton;

            @FindBy (css = ".o_search_options .o_dropdown:nth-of-type(1)")
            public WebElement filtersDropdown;

            //TODO > need to finish this section later, too many buttons not used in our tests

        /* this element is the input box for search */
        @FindBy (className = "o_searchview_input")
        public WebElement searchInput;

        /* availability and name can vary by page, if code breaks, need to find additional elements */
        @FindBy (css = ".o_list_button_add")
        public WebElement createButton;

        /* availability and name can vary by page, if code breaks, need to find additional elements */
        @FindBy (css = ".o_button_import")
        public WebElement importButton;

        /* availability and name can vary by page, if code breaks, need to find additional elements */
        @FindBy (css = ".o_list_button_save")
        public WebElement saveButton;

        /* availability and name can vary by page, if code breaks, need to find additional elements */
        @FindBy (css = ".o_list_button_discard")
        public WebElement discardButton;

    /* <<< Side Navigation Bar Elements >>> */
        @FindBy (className = "o_sub_menu_logo")
        public WebElement logoAnchor;

        @FindBy (css = ".oe_secondary_menu .active .oe_menu_text")
        public WebElement activeSidebarName;

        @FindBy (css = ".oe_secondary_menu .active >a")
        public WebElement activeSidebarAnchor;

        @FindBy (linkText = "Requests for Quotation")
        public WebElement requestsForQuotationAnchor;

        @FindBy (linkText = "Purchase Orders")
        public WebElement purchaseOrdersAnchor;

        @FindBy (linkText = "Vendors")
        public WebElement vendorsAnchor;

        @FindBy (css = "a[data-menu='516']")
        public WebElement productsAnchor;

        @FindBy (linkText = "Incoming  Products")
        public WebElement incomingProductsAnchor;

        @FindBy (linkText = "Vendor Bills")
        public WebElement vendorBillsAnchor;

        @FindBy (linkText = "Reporting")
        public WebElement reportingAnchor;

    /* <<< Main Panel Elements >>> */
    //TODO need to find these elements
}
