 package testCases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@admin and @validLogin",plugin= {"pretty",
		"html:reports/report.html",
		"junit:reports/report.junit",
		"json:reports/report.json"
		})
public class RunnerTest {

}
//@CucumberOptions(tags="@admin and @validLogin"  // will check both present only it will run
//@CucumberOptions(tags="@admin or @validLogin" // if any one present also it will run
//@CucumberOptions(tags="not @validLogin" // except validlogin rest everything will run
