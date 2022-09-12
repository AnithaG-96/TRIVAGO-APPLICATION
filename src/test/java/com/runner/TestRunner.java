package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="com.step",dryRun=false,monochrome=true,
plugin= {"pretty",
		"html:src\\test\\resources\\Reports\\HtmlRep"})
public class TestRunner {
	
	}

