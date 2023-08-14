package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
              //  "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",
                "junit:target/junit/junit-report.xml",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"

        },
        features ="src/test/resources/features",
        glue="com/cydeo/step_definitions",
        dryRun = false,
        tags = "@scientists",
        publish = true
)
public class CukesRunner {
}
