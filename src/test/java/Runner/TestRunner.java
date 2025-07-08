package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"Steps", "com.balaji.hooks"},
        plugin = {
                "pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-reports/CucumberHTML.htm"   // <- Match pom.xml path
        },
        monochrome = true
)
public class TestRunner {
}
