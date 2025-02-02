package runnertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 
@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"},glue = {"stepsDefinations"}, tags = {"loginsingledata"})
public class RunnerTest1 {

}
