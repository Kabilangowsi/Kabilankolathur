package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base_cl.Base_1;
import base_cl.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import runner_files.Runner;

public class Step_definition extends Base_1 {
	public static WebDriver driver = Runner.driver;
	Login x = new Login(driver);

	@Given("Pass The Url to launch The site")
	public void pass_The_Url_to_launch_The_site() {
		driver.get("https://adactinhotelapp.com/");

	}

	@Given("Enter The valid Username")
	public void enter_The_valid_Username() {
		By_using_send_keys(x.getUsername(), "Kabilan1");

	}

	@Given("Entre TheValid Password")
	public void entre_TheValid_Password() {
		By_using_send_keys(x.getPassword(), "Kabilan@123");

	}

	@Given("Click The Login button")
	public void click_The_Login_button() {
		Click_options(x.getLogin_click());

	}

	@Then("It will naviagte To the Search Page")
	public void it_will_naviagte_To_the_Search_Page() {
		System.out.println("It navigate to the Next the page");

	}

}
