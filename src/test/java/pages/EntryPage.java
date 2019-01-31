package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EntryPage {
    public EntryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (linkText = "BriteErp")
    public WebElement briteErpAnchor;

    @FindBy (linkText = "BriteErpDemo")
    public WebElement brietErpDemoAnchor;

    @FindBy (linkText = "Test")
    public WebElement testAnchor;
}
