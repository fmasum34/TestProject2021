package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\Features\\LogIn.feature",glue = {"StepDefination"},

monochrome = true,

plugin = {"pretty", "html:target\\\\Login/reports.html",
		"junit:target\\Login/reports.xml",
		"json:target\\Login/reports.json"

})

public class TestRuner {

}
