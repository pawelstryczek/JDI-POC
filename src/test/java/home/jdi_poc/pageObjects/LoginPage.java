package home.jdi_poc.pageObjects;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;

public class LoginPage extends WebPage{
	@UI("#username")
	public TextField user;
	@UI("#password")
	public TextField password;
	@UI("button.radius")
	public Button login;
	@UI("div#flash.flash.success")
	public Label success;
}
