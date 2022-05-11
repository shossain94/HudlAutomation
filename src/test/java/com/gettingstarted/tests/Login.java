package com.gettingstarted.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.hudl.steps.HudlSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import net.thucydides.core.pages.Pages;

@RunWith(SerenityRunner.class)
@WithTags({
	@WithTag("Hudl")
})
public class Login {
	
	@Managed
	WebDriver driver;
	
	@ManagedPages(defaultUrl = "https://www.hudl.com/")
	public Pages pages;
	
	@Steps
	HudlSteps hudle;
	
	@Title("Login")
	@Test
	public void login() throws InterruptedException {
		hudle.openUrl();
		hudle.login();
		hudle.emailInput("hossainsajjad94@outlook.com");
		hudle.passwordInput("Hudl1234");
		hudle.loginButton();
		hudle.verifyProjectName("MyProjectsample5");
		driver.quit();
	}
}
