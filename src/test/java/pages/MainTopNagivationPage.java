package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainTopNagivationPage {
    public MainTopNagivationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (linkText = "Sign in")
    public WebElement signInAnchor;

    @FindBy (linkText = "Home")
    public WebElement homeAnchor;

    @FindBy (linkText = "Shop")
    public WebElement shopAnchor;
}
