package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginStepDefs {
    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("the user clicks on Sign in button")
    public void the_user_clicks_on_Sign_in_button() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("the page title should contain Login")
    public void the_page_title_should_contain_Login() {
        // Write code here that turns the phrase above into concrete actions

    }

}
