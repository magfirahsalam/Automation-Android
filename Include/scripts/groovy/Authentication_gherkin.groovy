import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber



@RunWith(Cucumber.class)
@CucumberOptions(
features = "Include/features/",
glue = "stepDefinition",
tags = "@Login, @Register",
monochrome = true,
plugin = [
	"pretty",
	"html:GherkinReports/Authentication_Gherkin/HTML",
	"json:GherkinReports/Authentication_Gherkin/JSON/reports.json",
]
)


class Authentication_gherkin {
}