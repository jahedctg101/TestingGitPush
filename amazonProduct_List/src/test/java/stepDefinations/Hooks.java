package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.Base_Amazon;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base_Amazon {
	@Before
	public static void setUP() {
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(false);
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver(option);
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@After
	public static void teardown() {
		browser.close();
	}
	

}
