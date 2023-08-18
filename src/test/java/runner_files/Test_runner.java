package runner_files;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\Feature\\Adactin.feature", glue = "step_definition")
public class Test_runner {

	public static WebDriver driver;

	@BeforeClass
	public static void method() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
