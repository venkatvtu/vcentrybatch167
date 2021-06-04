 package testCases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@validLogin",plugin= {"pretty",
		"html:reports/report.html",
		"junit:reports/report.junit",
		"json:reports/report.json"
		})
public class RunnerTest {

}
