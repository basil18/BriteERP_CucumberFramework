package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.BrowserUtils;
import utilities.Driver;

public class Hooks {
    //TODO don't forget that screenshot is being taken for all the steps
    //TODO also, you can delete WAIT when project is all good to go
    @After
    public void teardown(Scenario scenario) {
//        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
//        }
        BrowserUtils.wait(5);
        Driver.closeDriver();
    }
}
