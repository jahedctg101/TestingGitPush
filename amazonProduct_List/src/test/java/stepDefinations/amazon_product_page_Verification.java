package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import static org.junit.Assert.*;

import base.Base_Amazon;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Homepage;
import pages.Productpage;

public class amazon_product_page_Verification extends Base_Amazon {

	Homepage homePage = new Homepage();
	Productpage prodPage = new Productpage();
	
	@Given("I am in the Amazon Homepage")
	public void i_am_in_the_amazon_homepage()  {
	   homePage.navigateUrl("https://www.amazon.com/");
	   
	}
	@And("I change the delivery location")
	public void i_change_the_delivery_location() throws InterruptedException {
		homePage.clickOnDelivery();
	}

	@And("I seacrh Product")
	public void i_seacrh_Product() throws InterruptedException {
	    prodPage.prodSearch("portable hard drive"+Keys.ENTER);
	    Thread.sleep(2000);
	    WebElement block=browser.findElement(By.xpath("//div[@id='search']//div[@class='s-main-slot s-result-list s-search-results sg-row']"));
	    List<WebElement> l=block.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for(WebElement s:l) {
			System.out.println(s.getText());
		}
	}

	
	@Then("Verify Product page")
	public void verify_Product_page() {
	    String AccText=browser.findElement(By.xpath("//div[@id='search']//span[text()='\"portable hard drive\"']")).getText();
	    
//	    assertEquals("\"portable hard drive\"", AccText);
	    System.out.println(AccText);
	}
}
