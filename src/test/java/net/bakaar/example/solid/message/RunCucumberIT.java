package net.bakaar.example.solid.message;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = {"net.bakaar.example.solid.message"}, strict = true)
public class RunCucumberIT {

}
