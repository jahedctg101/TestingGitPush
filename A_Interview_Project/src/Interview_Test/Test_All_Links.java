package Interview_Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_All_Links {
	static WebDriver browser;
	public static void main(String[] args) throws MalformedURLException, IOException {
		// Test all links by response code
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
//		browser.get("http://thedemosite.co.uk/");
		browser.get("https://www.etsy.com/");
//		WebElement block=browser.findElement(By.xpath("//main[@id='content']//ul"));
		List<WebElement> aTag_ls=browser.findElements(By.tagName("a"));
		int aTaglinksz=aTag_ls.size();
		List<WebElement> imgTag_ls=browser.findElements(By.tagName("img"));
		int imgTagLinksz=imgTag_ls.size();
		aTag_ls.addAll(imgTag_ls);
		HttpURLConnection con=null;
		
		for(WebElement link:aTag_ls) {
			String url=link.getAttribute("href");
		
		if (url!=null &&!url.contains("javascript")) {
			con=(HttpURLConnection)(new URL(url)).openConnection();
			con.connect();
			con.setConnectTimeout(2000);
			int responseCode_link=con.getResponseCode();
			System.out.println("Connection status of links "+url+" is "+ responseCode_link);
		}
		}
		
		
	}

}
