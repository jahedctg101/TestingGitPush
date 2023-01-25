package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.Base_Amazon;

public class Productpage extends Base_Amazon {
	
	By searchBox = By.id("twotabsearchtextbox");
	
	public void prodSearch(String value) {
		browser.findElement(searchBox).sendKeys(value);
	}
	

}
