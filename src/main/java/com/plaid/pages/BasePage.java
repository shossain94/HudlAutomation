package com.plaid.pages;

import java.util.Random;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject{

public static String projectPath = System.getProperty("user.dir");


public static String getRandomNumber()	{
	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(10000);
	return Integer.toString(randomInt);
}
	
}
