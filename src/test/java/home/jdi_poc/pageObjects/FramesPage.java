package home.jdi_poc.pageObjects;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Frame;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Link;
import com.epam.jdi.light.ui.html.elements.common.Text;

public class FramesPage extends WebPage{
	@Css("a[href='/iframe']")
	public Link iFrames;
	@Frame("#mce_0_ifr")
	@UI("/html/body/p")
	public Text innerText;
}
