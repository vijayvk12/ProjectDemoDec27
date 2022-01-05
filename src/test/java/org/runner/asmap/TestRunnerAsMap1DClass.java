package org.runner.asmap;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Feature\\loginmap1D.feature"},glue= {"org.step.asmap"})
public class TestRunnerAsMap1DClass {
	

}
