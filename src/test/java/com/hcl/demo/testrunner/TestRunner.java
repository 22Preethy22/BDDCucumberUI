package com.hcl.demo.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/hcl/demo/feature/UITest.feature",glue={"com.hcl.demo.stepdefinition"}, plugin = { "pretty", "html:testOutput/cucumber.html",
		"json:testOutput/cucumber.json" }, tags = "@UItest")
		// features = "features",
		// features =
		// "C:\\Users\\suryakanthnag.pujar\\workspace\\HackathonDemo\\src\\main\\resource\\TestFeatures\\test.feature",
		//glue = { "in.com.hcl.stepdefinition" })
public class TestRunner {

}
