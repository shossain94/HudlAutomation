package com.hudl.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class ElementUtils extends PageObject {

	public ElementUtils(WebDriver driver)	{
		super(driver);
	}
	
	public boolean selectCheckBox(WebElement element)	{
		
		if(element.isSelected()) {
			return true;
		}
		else {
			element.click();
			return false;
		}
	}
	
public boolean unSelectCheckBox(WebElement element)	{
		
		if(element.isSelected()) {
			element.click();
			return true;
		}
		else {
			return true;
		}
	}
	
}
