package com.hudl.steps;


import com.hudl.pages.HomePage;
import com.hudl.pages.HudleLogin;
import com.hudl.pages.LandingPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HudlSteps extends ScenarioSteps {
	
	LandingPage landingPage;
	HudleLogin hudleLogin;
	HomePage homePage;
	
	/****************** Landing Page ********************/
	@Step
	public LandingPage openUrl() {
		return landingPage.openUrl();
	}
	@Step
	public LandingPage hudlLogo() {
		return landingPage.hudlLogo();
	}
	@Step
	public HudleLogin login()	{
		return landingPage.login();
	}
	
	
	/****************** Hudle Login Page ********************/
	
	@Step
	public HudleLogin emailInput(String email) {
		return hudleLogin.emailInput(email);
	}
	@Step
	public HudleLogin passwordInput(String password) {
		return hudleLogin.passwordInput(password);
	}
	@Step
	public HomePage loginButton() {
		return hudleLogin.loginButton();
	}
	
	
	/****************** Home Page ********************/
	
	@Step
	public HomePage verifyProjectName(String projectName) {
		return homePage.verifyProjectName(projectName);
	}
}
