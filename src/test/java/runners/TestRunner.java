package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features_Files", monochrome = true,
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber/cucumber.json",
                "junit:target/cucumber.xml",
        },
        tags = "@Regression", glue = {"step_Definitions"})




//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/main/resources/features_Files",
//        plugin = {"html:target/ReportsDestinations","pretty"},
//        tags = "@Regression", glue = {"step_Definitions"})

public class TestRunner {


}
