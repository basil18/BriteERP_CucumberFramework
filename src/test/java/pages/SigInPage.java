package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SigInPage {
    public SigInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "db")
    public WebElement databaseField;

    @FindBy (linkText = "Select ")
    public WebElement selectAnchor;

    @FindBy (id = "login")
    public WebElement usernameInput;

    @FindBy (id = "password")
    public WebElement passwordInput;

    @FindBy (css = ".btn.btn-primary")
    public WebElement loginButton;

    @FindBy (partialLinkText = "account")
    public WebElement dontHaveAnAccountAnchor;

    @FindBy (partialLinkText = "reset")
    public WebElement resetPasswordAnchor;
}
