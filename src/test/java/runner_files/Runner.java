package runner_files;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import base_cl.Base_1;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Lenovo\\eclipse-workspace\\Cucumber_porur\\Login.feature", 
glue = "step_definition", dryRun = !true)

public class Runner extends Base_1 {
	public static WebDriver driver;

	@BeforeClass
	public static void Testrunner() {
		driver = Browser_launch("Chrome");
	}

	@AfterClass
	public static void TestClose() {
		driver.close();
	}

}
