package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		//provide the features file which should be executed
		features= {".\\src\\test\\java\\Features\\Login.feature"},
		
		//will bind feature file with step definition 
		glue= {"StepDefinition"},
		
		dryRun=false //all the step def will be generated with browser launch 
		        
		  // false: browser will be launch
		
		
		)






public class RunnerIO extends AbstractTestNGCucumberTests{

}
