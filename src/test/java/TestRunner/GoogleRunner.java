package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Dell\\eclipse-workspace\\CuCumber\\src\\test\\resources\\FeatureFile\\A.feature",
glue={"Stepdef"},
plugin 
)

public class GoogleRunner {
	

}
