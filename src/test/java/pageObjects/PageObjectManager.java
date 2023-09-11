package pageObjects;

import org.openqa.selenium.WebDriver;

/**
 * @author Maicon Fang
 * @version 1.0
 * @Description: Managing page objects for a web system
 */
public class PageObjectManager {

	public WebDriver driver;
	public LoginScreenPage loginScreenPage;
	public NavbarSystemPage navbarSystemPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginScreenPage getLoginScreenPage() {
		loginScreenPage = new LoginScreenPage(driver);
		return loginScreenPage;
	}

	public NavbarSystemPage getNavbarSystemPage() {
		navbarSystemPage = new NavbarSystemPage(driver);
		return navbarSystemPage;
	}

}
