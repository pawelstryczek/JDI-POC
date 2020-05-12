package home.jdi_poc.tests;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static home.jdi_poc.sites.TheInternetSite.homePage;
import static home.jdi_poc.sites.TheInternetSite.loginPage;
import static home.jdi_poc.sites.TheInternetSite.framesPage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.epam.jdi.light.elements.init.PageFactory;

import home.jdi_poc.sites.TheInternetSite;

public class HerokuappTests{

	@BeforeSuite(alwaysRun = true)
	public static void setUp() {
		PageFactory.initElements(TheInternetSite.class);
	}

	@Test
	public void loginTest() {
		homePage.open();
		homePage.LoginLink.click();
		loginPage.user.setText("tomsmith");
		loginPage.password.setText("SuperSecretPassword!");
		loginPage.login.click();
		//Assert
		loginPage.success.assertThat().displayed();
	}
	
	@Test
	public void iFrameTest() {
		homePage.open();
		homePage.FramesLink.click();
		framesPage.iFrames.click();
		framesPage.innerText.assertThat().text("Your content goes here.");
	}

	@AfterSuite(alwaysRun = true)
	public void teardown() {
		killAllSeleniumDrivers();
	}
}
