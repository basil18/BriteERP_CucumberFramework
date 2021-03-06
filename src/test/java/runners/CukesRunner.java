package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"
        },
        tags = {
//                {"@purchases", "@manager"},
//                "@smoke"
                "@to-do"
                },
        features = {"src/test/resources/features"},
        glue = {"step_definitions"}
        , dryRun = true
)

public class CukesRunner {
}
