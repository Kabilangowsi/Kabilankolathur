package base_cl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public static WebDriver driver;
	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login_click;

	public Login(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLogin_click() {
		return login_click;
	}

	public void setLogin_click(WebElement login_click) {
		this.login_click = login_click;
	}

}
