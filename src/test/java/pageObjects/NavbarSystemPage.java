package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * @author Maicon Fang
 * @version 1.0
 * @Description: This class is relate to the system, it is shown when the user is logged in the application
 */
public class NavbarSystemPage {
	public WebDriver driver;

	public NavbarSystemPage(WebDriver driver) {
		this.driver = driver;

	}

	By titleNavbar = By.id("id-navbar-system-name");


	public String getTitleNavbarNavbarSystemPage() {
		return driver.findElement(titleNavbar).getText();
		
	}

	
}
