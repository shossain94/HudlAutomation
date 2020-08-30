package com.plaid.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import com.plaid.pages.BasePage;

import net.thucydides.core.pages.components.FileToUpload;

public class FileUpload extends BasePage {

	public FileToUpload upload(String fileName) {
		Robot robot;
	try {
		robot = new Robot();
		robot.setAutoDelay(2000);
		StringSelection stringselection = new StringSelection(projectPath+"file Location Here"+fileName);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	} catch (AWTException e) {
		e.printStackTrace();
	}
	return null;
}
	
}
