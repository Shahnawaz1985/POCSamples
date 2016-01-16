package com.bac.csd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
					glue="com.bac.step",
					tags={"@myNameTag, @myEmailTag"},
					format="pretty")
public class TestPostRide {

}
