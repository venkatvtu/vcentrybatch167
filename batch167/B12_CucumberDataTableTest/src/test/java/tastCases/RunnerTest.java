package tastCases;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@product",plugin = {"pretty",
		"html:reports/report.html",
		"junit:reports/report.xml",
		"json:reports/report.json",
		
})
public class RunnerTest {

}
