package org.runner2D;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Feature\\loginlists2D.feature"},glue={"org.step2D"})
public class TestRunner2Dlists {

}
