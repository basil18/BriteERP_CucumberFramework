package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.function.Function;

public class BrowserUtils {
    public static final boolean ISWINDOWS;
    public static final boolean ISMAC;

    static {
        ISWINDOWS = System.getProperty("os.name").toLowerCase().contains("windows");
        ISMAC = System.getProperty("os.name").toLowerCase().contains("mac");
    }

    /**
     * Thread.sleep simplified for future utility.
     * @param seconds   int of how many Thread.sleep() seconds requested
     */
    public static void wait(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    /**
     * Switches to the window handle with matching title.
     * @param target    String of target window handle
     */
    public static void switchToWindow(String target) {
        String origin = Driver.getDriver().getWindowHandle();
        target = target.toLowerCase();

        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().toLowerCase().contains(target))
                return;
        }

        Driver.getDriver().switchTo().window(origin);
    }

    /**
     * Actions class .moveToElement() method, simplified
     * @param element   WebElement that is requested to be hovered over
     */
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).build().perform();
    }

    /**
     * Explicit Wait for Visibility simplified
     * @param element           WebElement requested to be visible
     * @param waitInSeconds     int seconds to wait
     * @return                  the same WebElement after it becomes visible
     */
    public static WebElement waitForVisibility(WebElement element, int waitInSeconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), waitInSeconds);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    //TODO
    public static boolean isElementsTextAMatch(WebElement element, String expected, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), seconds);
        return wait.until(ExpectedConditions.textToBePresentInElement(element, expected));
    }

    /**
     * Explicit Wait for Clickability, simplified
     * @param element           WebElement requested to be clickable
     * @param waitInSeconds     int seconds to wait
     * @return                  the same WebElement after it becomes clickable
     */
    public static WebElement waitForClickability(WebElement element, int waitInSeconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), waitInSeconds);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Fluent Wait, simplified
     * @param webElement    WebElement to be checked for
     * @param seconds       int seconds to be waited, while polling every 1/10th of it
     * @return              WebElement that is being checked for, after being discovered
     */
    public static WebElement fluentWait(final WebElement webElement, int seconds) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(seconds))
                .pollingEvery(Duration.ofSeconds(seconds / 10))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });

        return element;
    }

    /**
     * Generates .png file of screenshot and returns the String path to it
     * @param name          String input of the name of the test
     * @return              String path to the .png file of the screenshot
     */
    public static String getScreenshot(String name) {
        String time = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String target = System.getProperty("user.dir") + "/test-output/Screenshots" + name + time + ".png";
        File finalDestination = new File(target);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException io) {
            io.printStackTrace();
        }
        return target;
    }
}
