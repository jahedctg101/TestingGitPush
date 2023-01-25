package base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon extends Base_Amazon{

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(false);
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver(option);
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		navigateUrl("https://www.amazon.com/");
		
		browser.findElement(By.id("nav-global-location-popover-link")).click();
		Thread.sleep(2000);
		browser.findElement(By.id("GLUXZipUpdateInput")).sendKeys("75014"+Keys.ENTER);
		browser.findElement(By.id("GLUXConfirmClose")).click();
		browser.findElement(By.id("twotabsearchtextbox")).sendKeys("portable hard drive"+Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement block=browser.findElement(By.xpath("//div[@id='search']//div[@class='s-main-slot s-result-list s-search-results sg-row']"));
		List<WebElement> l=block.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for(WebElement s:l) {
			System.out.println(s.getText());
		}
	}

}
