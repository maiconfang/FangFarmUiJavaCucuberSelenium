package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Maicon Fang
 * @version 1.0
 * @Description: This class, named LoginScreenPage, represents the page that is
 *               displayed when a user is logged into the application. It
 *               provides methods for interacting with elements on the login
 *               screen, such as entering login credentials, clicking the login
 *               button, and retrieving information from various page elements.
 *               This class is associated with the functionality related to user
 *               login within the system.
 */
public class LoginScreenPage {
	public WebDriver driver;

	public LoginScreenPage(WebDriver driver) {
		this.driver = driver;
	}

	By loginInputText = By.id("login_login");
	By passwordInputText = By.id("login_password");
	By buttonEnter = By.id("login_btn_enter");
	By msgError = By.id("toast-container");

	public String getTitleLoginScreenPage() {
		return driver.getTitle();
	}

	public void typeLogin(String login) {
		driver.findElement(loginInputText).sendKeys(login);
	}

	public void typePassword(String password) {
		driver.findElement(passwordInputText).sendKeys(password);
	}

	public void clickButtonEnter() {
		driver.findElement(buttonEnter).click();
	}

	public boolean getStatusVisibleButtonEnter() {
		return driver.findElement(buttonEnter).isEnabled();
	}

	public String getValueFromInputLogin() {
		return driver.findElement(loginInputText).getText();
	}

	public String getValueFromInputPassword() {
		return driver.findElement(passwordInputText).getText();
	}

	public String getErrorMessageLoginAndPasswordInvalid() {
		return driver.findElement(msgError).getText();
	}

}
