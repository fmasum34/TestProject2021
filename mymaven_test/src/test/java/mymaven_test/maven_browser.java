package mymaven_test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class maven_browser {

	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver.exe");
	String ProjectPath = System.getProperty("user.dir");
	
	System.out.println("ProjectPath" +ProjectPath);
	
	
	// for NOTE: if you set the chrom driver path in the environment variable then you do not need the system.set property line
	
		System.setProperty("webdriver.chrome.driver", ProjectPath+"\\driver\\chromedriver\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", ProjectPath+"\\driver\\firefoxdriver\\geckodriver.exe");
		
	
	// 	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		//mydriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		//Thread.sleep(30000);
		driver.manage().window().maximize();
				
		
		
		driver.findElement(By.name("q")).sendKeys("automation step by step tutorial");
		
		
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.name("q")).submit();
		
		
	}

}
