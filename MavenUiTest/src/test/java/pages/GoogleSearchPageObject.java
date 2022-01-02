package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	
	WebDriver driver = null;
	
	By GoogleTextSearch = By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]");
	
	By GoogleButtonSearch = By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]");
	
	
	public GoogleSearchPageObject(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void setTextSearchBox(String text) {
		
		
	driver.findElement(GoogleTextSearch).sendKeys(text);}	
	
	
	
	public void setButtonSearchBox() {
		
		
		driver.findElement(GoogleButtonSearch).sendKeys(Keys.RETURN);
		
	}
}
