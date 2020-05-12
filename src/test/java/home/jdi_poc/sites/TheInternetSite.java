package home.jdi_poc.sites;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;

import home.jdi_poc.pageObjects.FramesPage;
import home.jdi_poc.pageObjects.HomePage;
import home.jdi_poc.pageObjects.LoginPage;

@JSite("https://the-internet.herokuapp.com/")
public class TheInternetSite {
    @Url("/") public static HomePage homePage;
    @Url("/login")
    public static LoginPage loginPage;
    @Url("/frames")
    public static FramesPage framesPage;
}
