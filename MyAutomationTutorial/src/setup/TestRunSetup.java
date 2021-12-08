package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunSetup {
	
public static WebDriver launch(String browserType, String URL) {	
	WebDriver mydriver = null;
	switch(browserType) {
		case "chrome":
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver.exe");
		mydriver = new ChromeDriver();
		
			break;
		case "firefox":
			break;
	
}
	
	
	

	mydriver.get(URL);
	mydriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	mydriver.manage().window().maximize();
	return mydriver;
	
}
}