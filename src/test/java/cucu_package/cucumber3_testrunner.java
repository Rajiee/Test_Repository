package cucu_package;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\A08019DIRP_C2B.02.14\\workspace\\cucumber\\src\\resources\\java\\cucumber3.feature",
plugin={"html:target/Reports"}
)

public class cucumber3_testrunner {
  
}