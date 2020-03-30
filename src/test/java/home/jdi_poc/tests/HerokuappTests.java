package home.jdi_poc.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.epam.jdi.light.elements.init.PageFactory;
import home.jdi_poc.pageObjects.HomePage;
import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;

public class HerokuappTests {

	@BeforeSuite(alwaysRun = true)
	public static void setUp() {
		PageFactory.initElements(HomePage.class);
	}

	@Test
	public void loginTest() {
		HomePage homepage = new HomePage();
		homepage.open();
		homepage.Login.click();
	}

	@AfterSuite(alwaysRun = true)
	public void teardown() {
		killAllSeleniumDrivers();
	}
}
