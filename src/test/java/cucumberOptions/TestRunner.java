package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"StepDefinitions", "classpath:io.jdev.cucumber.variables.java.en"},
monochrome = true,
plugin = {"pretty","html:target/HtmlReports/HtmlReport.html",
		"json:target/JSONReports/JSONReport.json",
		"junit:target/JUnitReports/JUnitReport.xml",
		"json:target/cucumber.json"},

/*
Tags can be placed above Feature, Scenario, Scenario Outline & Examples (cannot be placed above Background, Given, When, Then, And, But)
Tags above a Feature will be inherited by Scenario, Scenario Outline or Examples
Tags above a Scenario Outline will be inherited by Examples
*/

/*
tags = "@RandomLoginTest1 or @RandomScenario1 or @SmokeScenario1 or SmokeScenario2 or @BackgroundTest1"
tags = "@RandomLoginTest1 and @login"
tags = "@SmokeScenario1 and not @RandomScenario1"
tags = "(@RandomLoginTest1 or RandomScenario1)and @login"
*/

tags = "@SmokeFeature"

)

public class TestRunner {

}
