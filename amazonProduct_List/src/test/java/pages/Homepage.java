package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import base.Base_Amazon;

public class Homepage extends Base_Amazon{
	
	By dlvLocation = By.id("nav-global-location-popover-link");
	By enterZipCode = By.id("GLUXZipUpdateInput");
	By continueBtn = By.id("GLUXConfirmClose");
	public static void homepage() {
		navigateUrl("https://www.amazon.com/");
	}
	
	public void clickOnDelivery() throws InterruptedException {
		click(dlvLocation);
		Thread.sleep(2000);
		sendkey(enterZipCode, "75014"+Keys.ENTER);
//		Thread.sleep(2000);
		browser.findElement(continueBtn).click();		
	}

}
