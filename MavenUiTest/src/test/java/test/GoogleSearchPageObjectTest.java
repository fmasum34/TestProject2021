package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObject;

public class GoogleSearchPageObjectTest {
	
	
	
	
	static WebDriver driver = null;
	public static void main(String[] args) {
		
		googleSearchTest();
		
		
	}
	
	
	public static void googleSearchTest() {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\FAISAL.MASUM\\git\\TestProject2021\\mymaven_test\\driver\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		
		
		GoogleSearchPageObject Gsearch = new GoogleSearchPageObject(driver);
		
		
		
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		
		Gsearch.setTextSearchBox("AUTOMAMTION");
		
		Gsearch.setButtonSearchBox();
	}

}
