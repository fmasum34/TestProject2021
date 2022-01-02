package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.GoogleSearchPage;

public class ExtentReportsTestDemo {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		
		// Creates a ExtentRepor and attach reporter
		
		ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
        
        extent.attachReporter(spark);
		
        
        // creates a toggle for the given test, add all log events under it
        ExtentTest RTest = extent.createTest("This is Google Search Test one","This is test to validate the google functionality");
        
        
System.setProperty("webdriver.chrome.driver","C:\\Users\\FAISAL.MASUM\\git\\TestProject2021\\mymaven_test\\driver\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//log (status, and details)
		//info(details)
		//log with snapshot
		//test with snapshot
		// calling the flush writes everything to the log files
		
		RTest.log(Status.INFO, "Starting the google test case");
		
		driver.get("https://www.google.com/");
		
		RTest.pass("Navigating to google page");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        
		
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys("Automation step by step");
		
		RTest.pass("Navigating to google page");			
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
				
				
				driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys(Keys.RETURN);
				
				
				RTest.pass("Pressed the keyword enter key");	
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
				
				driver.findElement(By.xpath("//h3[contains(text(),'Automation Step by Step: Never Stop Learning ...')]")).click();
				
				RTest.pass("Autommation step by step page appers");
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);	
				
				driver.findElement(By.xpath("//a[@id='logo']")).click();
				
				RTest.pass("Automation step by step logg page appears");
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
				
				
				driver.findElement(By.xpath("//header/div[2]/nav[1]/ul[1]/li[3]/a[1]")).click();
				
				RTest.pass("Clicking the selenium log page and it's appera in the homepage");
				
				
				
				
				driver.close();
				driver.quit();
				
				RTest.pass("Google Test Pass successfully");
				
				RTest.info("Test completed");
				
				// test with snapshoot
				
				//RTest.addScreenCaptureFromPath("Screenshot.png");
				
				// calling flush writes everything to the log file
				
				extent.flush();
				
				
				
				
				
		
	}

}
