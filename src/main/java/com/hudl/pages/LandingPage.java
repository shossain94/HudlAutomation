package com.hudl.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hudl.base.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LandingPage extends BasePage{

	private static final Logger LOGGER = LoggerFactory.getLogger(LandingPage.class);
	
	@FindBy(xpath = "//a[@class='mainnav__sitename']//svg//path[2]")
	private WebElementFacade hudlLogo;
	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	private WebElementFacade login;
	@FindBy(xpath = "//a[contains(text(),'Request a free demo')]")
	private WebElementFacade requestDemo;
	@FindBy(xpath = "(//a[contains(text(),'Highlights')])[0]")
	private WebElementFacade highlights;
	
	public LandingPage openUrl() {
		open();
		return this;
	}
	public LandingPage hudlLogo() {
		boolean logoPresent = hudlLogo.waitUntilVisible().isDisplayed();
		if(logoPresent = true)	{
		LOGGER.info("Huddle Logo is Present");
		hudlLogo.waitUntilClickable().click();
		}
		return this;
	}
	public HudleLogin login()	{
		login.waitUntilClickable().click();
		LOGGER.info("Naviagting to Hudl Login Page");
		return this.switchToPage(HudleLogin.class);
	}
	public RequestDemo requestDemoButton()	{
		requestDemo.waitUntilClickable().click();
		LOGGER.info("Naviagting to Hudl Request Demo Page");
		return this.switchToPage(RequestDemo.class);
	}
	public Highlights highlightsButton()	{
		highlights.waitUntilClickable().click();
		LOGGER.info("Naviagting to Hudl Highlights Page");
		return this.switchToPage(Highlights.class);
	}
	
}
