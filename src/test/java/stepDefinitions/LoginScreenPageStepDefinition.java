package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginScreenPage;
import pageObjects.NavbarSystemPage;
import utils.TestContextSetup;

/**
 * @author Maicon Fang
 * @version 1.0
 * @Description: This class, named LoginScreenPageStepDefinition, is responsible
 *               for defining the step-by-step behavior of test scenarios
 *               related to the login screen of a web application using Cucumber
 *               and TestNG.
 * 
 */
public class LoginScreenPageStepDefinition {

	public WebDriver driver;
	TestContextSetup testContextSetup;
	LoginScreenPage loginScreenPage;
	NavbarSystemPage navbarSystemPage;

	public LoginScreenPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.loginScreenPage = testContextSetup.pageObjectManager.getLoginScreenPage();
		this.navbarSystemPage = testContextSetup.pageObjectManager.getNavbarSystemPage();
	}

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		Assert.assertTrue(loginScreenPage.getTitleLoginScreenPage().contains("Fang-Farm-Ui"));
	}

	@When("^the user enters valid credentials (.+) and (.+)")
	public void the_user_enters_valid_credentials_login_password(String login, String password) {
		loginScreenPage.typeLogin(login);
		loginScreenPage.typePassword(password);
		loginScreenPage.clickButtonEnter();
	}

	@Then("the user should be redirected to the home page")
	public void the_user_should_be_redirected_to_the_home_page() throws InterruptedException {
		Assert.assertTrue(navbarSystemPage.getTitleNavbarNavbarSystemPage().contains("Fang Farm"));
	}

	@Then("the home page should be displayed")
	public void the_home_page_should_be_displayed() {
		Assert.assertTrue(navbarSystemPage.getTitleNavbarNavbarSystemPage().contains("Fang Farm"));
	}

	@When("the username and password are empty")
	public void the_username_and_password_are_empty() {
		Assert.assertEquals("", loginScreenPage.getValueFromInputLogin());
		Assert.assertEquals("", loginScreenPage.getValueFromInputPassword());
	}

	@Then("the button enter should be enabled")
	public void the_button_enter_should_be_enabled() {
		loginScreenPage.getStatusVisibleButtonEnter();
		Assert.assertFalse(loginScreenPage.getStatusVisibleButtonEnter());
	}

	@When("^enter an invalid (.+) and (.+) into the fields")
	public void enter_an_invalid_login_and_password_into_the_fields(String login, String password) {
		loginScreenPage.typeLogin(login);
		loginScreenPage.typePassword(password);
		loginScreenPage.clickButtonEnter();
	}

	@Then("the user should be able to see the error message.")
	public void the_user_should_be_able_to_see_the_error_message() {
		String messageErorExpected = "Opps!!\n" + "Invalid username or password";
		Assert.assertEquals(messageErorExpected, loginScreenPage.getErrorMessageLoginAndPasswordInvalid());
	}

	@Then("the user remains on the login page")
	public void the_user_remains_on_the_login_page() {
		Assert.assertTrue(loginScreenPage.getTitleLoginScreenPage().contains("Fang-Farm-Ui"));
	}

}
