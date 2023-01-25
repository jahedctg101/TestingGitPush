package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base_Amazon {
	protected static WebDriver browser;
	
	public static void navigateUrl(String url) {
		browser.get(url);
	}
	public static void sendkey(By by,String value) {
		browser.findElement(by).sendKeys(value);
	}
	public static void click(By by) {
		browser.findElement(by).click();
	}
	public static boolean isDisplay(By by) {
		boolean isd=browser.findElement(by).isDisplayed();
		return isd;		
	}
	public static String gettext(By by) {
		return browser.findElement(by).getText();
	}
}
