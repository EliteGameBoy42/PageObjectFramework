package CucumberOption;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinition",format = { "pretty", "html:target/cucumber" })
public class TestRunner extends AbstractTestNGCucumberTests {


}
