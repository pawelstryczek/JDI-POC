package home.jdi_poc.pageObjects;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Link;

@Url("https://the-internet.herokuapp.com/")
@Title("Home Page")
public class HomePage extends WebPage {
	@UI("a[href*='login']")
	public Link LoginLink;
	@Css("a[href='/frames']")
	public Link FramesLink;
}
