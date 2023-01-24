package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\sel\\Sel@6.30PM(EST)\\workspace\\CucumberBDD\\src\\main\\java\\features"
		,glue={"stepDefinations"}
		,dryRun=false
		,monochrome = true
		,plugin = {"pretty","json:target/myReports/report.json","junit:target/myReports/report.xml"}
		)
public class TestRunner {

}
