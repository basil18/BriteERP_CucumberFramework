package utilities;

import org.openqa.selenium.WebDriver;

public class Driver {
    private Driver() {}

    private static WebDriver driver;

    public static WebDriver getDriver() {


        return driver;
    }

}
