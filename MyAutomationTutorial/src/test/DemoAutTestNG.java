package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





public class DemoAutTestNG {

	
	static WebDriver mydriver = null;
	
	
		
	@BeforeTest
	
	public void TestSetup3() {
		
		//WebDriver mydriver = TestRunSetup.launch("chrome", "https://www.google.com/");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\FAISAL.MASUM\\git\\TestProject2021\\mymaven_test\\driver\\chromedriver\\chromedriver.exe");
				
			mydriver = new ChromeDriver();
		
		
	}
		
		@Test

	public void TestNG() {
		
		//HomePage homepage = new HomePage();
		
		mydriver.get("https://www.cnn.com/");
		
		mydriver.manage().window().maximize();
		
		mydriver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		
		mydriver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys("Automation step by step");
		
				
		mydriver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);	
		mydriver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys(Keys.RETURN);
				
				

		
		mydriver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		
		
		
		//mydriver.findElement(By.xpath(HomePageObj.Click_Create)).click();
		
		
		//mydriver.findElement(By.xpath(HomePageObj.Click_Myself)).click();
		
		
		//mydriver.findElement(By.xpath(HomePageObj.FirstName)).click();

		/*HomePage homepage = new HomePage();
		//I am testing the eclips and get connect to the jenkins server

		homepage.Register(mydriver);

		mydriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		homepage.Create(mydriver);

		homepage.CreateMyself(mydriver);

		mydriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		homepage.enterFirstaName_1(mydriver);

		mydriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		homepage.enterLastaName_1(mydriver);

		mydriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		homepage.enterUserName_1(mydriver);

		mydriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		homepage.enterPassword_1(mydriver);

		mydriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		homepage.enterConfirmPassword_1(mydriver);

		mydriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		homepage.showConfirmPassword_1(mydriver);

		mydriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		homepage.clickNext_1(mydriver);

		mydriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		homepage.enterPhone_1(mydriver);

		//mydriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//homepage.clickPhone_2(mydriver);

		// ADDING THE NEW 
		System.out.println(" Testing the testNG test");*/
		
		
}

}
