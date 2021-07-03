package cucumber;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"/Modulos/Login/LoginPrueba.feature"},
		tags = {"@tag1"}
		
		)

public class CucumberRunner {
	
	

	

}
