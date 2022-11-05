package weddingRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
                (
                		features="D:\\WeddingHall\\WeddingHall\\src\\test\\java\\weddingFeatures",
                		glue="weddingStepDefinations",
                		dryRun =false,
                		monochrome=false,
                		plugin="pretty"
                		
                )






public class runnerwedding extends AbstractTestNGCucumberTests
{
	

}
