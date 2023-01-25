package base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ryans_ProdList extends Base_Amazon{

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(false);
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver(option);
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		navigateUrl("https://www.ryanscomputers.com");
 		
		browser.findElement(By.id("search")).sendKeys("Dell Laptop"+Keys.ENTER);
		
		WebElement Products=browser.findElement(By.xpath("//div[@id='hits']/div"));
//		List<WebElement>Laptops=Products.findElements(By.tagName("a"));
//		List<WebElement>Laptops=browser.findElements(By.xpath("//div[@id='hits']/div/div"));
//		List<WebElement>Laptops=browser.findElements(By.xpath("//div[@id='hits']/div/div//div[@class='product-content-info']"));
		List<WebElement>Laptops=browser.findElements(By.xpath("//div[@id='hits']/div/div//div[@class='product-content-info']/a[1]"));
//		
//		System.out.println(Laptops.size());
//		for(WebElement laptop:Laptops) {
//			System.out.println(laptop.getText());
//		}
		
		// **** Gaglul Bhai's code
//		browser.findElement(By.id("search")).sendKeys("Lenovo Laptop"+Keys.ENTER);
//		WebElement lenovo = browser.findElement(By.xpath("//div[@id='hits']/div/div/div/div"));
//		
//		
//		
//		List<WebElement> items = lenovo.findElements(By.xpath("//div[@class='product-content-info']/a[1]"));
//		System.out.println(items.size());
//		
//		for(WebElement item : items) {
//		System.out.println(item.getText());
//	}
	}
		

}
