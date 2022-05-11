package com.hudl.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hudl.base.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HudleLogin extends BasePage{

	private static final Logger LOGGER = LoggerFactory.getLogger(HudleLogin.class);
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElementFacade emailInput;
	@FindBy(xpath = "//input[@id='password']")
	private WebElementFacade passwordInput;
	@FindBy(xpath = "//button[@id='logIn']")
	private WebElementFacade loginButton;
	
	public HudleLogin emailInput(String email) {
		emailInput.waitUntilPresent().type(email);
		LOGGER.info("Email input: "+ email);
		return this;
	}
	public HudleLogin passwordInput(String password) {
		passwordInput.waitUntilPresent().type(password);
		LOGGER.info("Passowrd input: " + password);
		return this;
	}
	public HomePage loginButton() {
		loginButton.waitUntilClickable().click();
		LOGGER.info("Navigating to Home Page");
		return this.switchToPage(HomePage.class);
	}
}
