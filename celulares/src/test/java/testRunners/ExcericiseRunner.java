package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/featureFilesCelulares", 
		glue = "stepsDefinitionsCelulares"
		

)
public class ExcericiseRunner extends AbstractTestNGCucumberTests {

}
