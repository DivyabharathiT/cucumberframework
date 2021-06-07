package com.runner;




import java.io.File;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue= {"com.stepdefinition"},monochrome=true)

//plugin= {"json:target/cucumber2.json","html:target/cucumber-reports" , "de.monochromata.cucumber.report.PrettyReports:target/cucumber"}

public class Testrunner {
	/*@AfterClass
	public static void teardown() {


		File reportOutputDirectory = new File("target/cucumber-report");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add("target/cucumber2.json");



		Configuration configuration = new Configuration(reportOutputDirectory, "Follo App");

		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("App-Name", "Follo");
		configuration.addClassifications("Tested By", "divya");



		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();*/

}
