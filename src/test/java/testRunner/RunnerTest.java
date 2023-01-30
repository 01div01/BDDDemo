package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featureFile",
glue = "stepSefinitions",
plugin = {"pretty","html:target/cucumber.html"})
public class RunnerTest {
}
