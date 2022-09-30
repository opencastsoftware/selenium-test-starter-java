package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@test",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber/jsonReports/cucumber.html"
        }
)
public class RunTest {
}
