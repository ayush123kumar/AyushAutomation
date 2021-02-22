package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)// driver class
@CucumberOptions(features="features",glue="StepDef",dryRun=true,
plugin={"pretty","json:target/cucumber.json","html:target"})

public class TestRunner {

}
