package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class PageTest {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
googlesearch();}
	
	
	public static void googlesearch() {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver.exe");	
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FAISAL.MASUM\\git\\TestProject2021\\mymaven_test\\driver\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		
		
		
		//driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys("Automation step by step");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);	
		//driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys(Keys.RETURN);
		
		
		GoogleSearchPage.textbox_button(driver).sendKeys(Keys.RETURN);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);	
		driver.findElement(By.xpath("//h3[contains(text(),'Automation Step by Step: Never Stop Learning ...')]")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);	
		driver.findElement(By.xpath("//a[@id='logo']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		
		
		driver.findElement(By.xpath("//header/div[2]/nav[1]/ul[1]/li[3]/a[1]")).click();
		
		
		
		
		
	}

}