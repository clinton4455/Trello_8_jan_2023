package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "org.stepdifinition",
                 dryRun = false,monochrome = true,
                 plugin = {"pretty","json:src\\test\\resources\\JVMreport\\jsonReport.json"})
public class TestRunner { 
	@AfterClass
	public static void report() {
		JVMReport.generateJVMRepot("src\\test\\resources\\JVMreport\\jsonReport.json");
	     System.out.println("---Done----");
	}
	
}
