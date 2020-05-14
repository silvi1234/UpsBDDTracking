package bdd.Runner;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 @CucumberOptions(features={"src/test/resources/UpsFeaturess"},
  glue={"bdd.step.Defn", "bdd.utilities"},
  plugin = {"pretty", "html:target/cucumber-htmlreport",
  "json:target/cucumber-jsonreport/cucumber-report.json",
  "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
  monochrome = true
  )


 public class TrackingRunner extends AbstractTestNGCucumberTests{

 @AfterClass
 public static void generateExtentReport(){
	Reporter.loadXMLConfig(new File("config/config.xml"));
}


}


 

