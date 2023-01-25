package Authintication_Pop_Up_Test;


//import org.graalvm.compiler.virtual.phases.ea.PartialEscapeBlockState.Final;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class test1 {
	
	public static void main(String[] args) throws InterruptedException {
		//Handle Authintication PopUp
		//Way # 1.
		WebDriver browser;
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver();
		
		browser.manage().window().maximize();
//		browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		browser.get("https://www.myrepublicbank.com/personal/mortgages/loan-inquiry?loanapp&siteid=3612662138&lar");
//		browser.findElement(By.cssSelector("div:nth-child(4) span.align-end  button.next:nth-child(1)")).click();
		
	   
		String txt=browser.findElement(By.cssSelector(".columns>h1")).getText();
		System.out.println(txt);
		Thread.sleep(10000);
//		WebElement ifrm=browser.findElement(By.cssSelector("#guest-WIDGET_HOST-sandbox-1"));
		
		browser.switchTo().frame(browser.findElement(By.xpath("//iframe[@id='guest-WIDGET_HOST-sandbox-1']")));
		Thread.sleep(2000);
		
		JavascriptExecutor jc = (JavascriptExecutor)browser;
		
		WebElement NxtBtn =browser.findElement(By.cssSelector("div[style='visibility: visible;'] div.side>.arrow"));
		
		jc.executeScript("arguments[0].scrollIntoView(true)", NxtBtn);
		
		NxtBtn.click();
		
//		Thread.sleep(15000);
//		Actions action = new Actions(browser);
//		action.moveToElement(browser.findElement(By.cssSelector("div:nth-child(4) button>.side>div.arrow::after")));
		
//		WebDriverWait wait = new WebDriverWait(browser, 20);
//	    WebElement w1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-child(4) button>.side>div.arrow::after")));
//		w1.isDisplayed();
//		WebElement w =browser.findElement(By.cssSelector("div:nth-child(4) span.align-end  button.next:nth-child(1)"));
//		
//		String pseudo = ((JavascriptExecutor)browser)
//		        .executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('content');",w).toString();
//		
	    System.out.println("YES");
		
		
		

	}

}
