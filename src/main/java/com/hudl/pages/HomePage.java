package com.hudl.pages;

import static org.junit.Assert.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hudl.base.BasePage;



public class HomePage extends BasePage {

	private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);
	
	
	private static final String projectName = "//div[@class='hui-primaryteamswitcher__display-name']//span[1]";
	
	public HomePage verifyProjectName(String pName) {
		String name = waitFor(projectName).$(projectName).waitUntilVisible().getText();
		assertEquals(name,pName);
		LOGGER.info("Project Name Matched.");
		return this;
	}
}