package infrastructure;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Operation {

	public void clickLink(WebDriver mydriver, String xpathExpression) {
		
		mydriver.findElement(By.xpath(xpathExpression)).click();
		
		}

	public void clickCreate(WebDriver mydriver, String xpathExpression) {
		
		mydriver.findElement(By.xpath(xpathExpression)).click();
	}
	
	public void click_Myself(WebDriver mydriver, String xpathExpression) {
		
		mydriver.findElement(By.xpath(xpathExpression)).click();
	
	}
	
	
	public void enterFirstName(WebDriver mydriver, String xpathExpression) {
		mydriver.findElement(By.xpath(xpathExpression)).sendKeys("Automation");
		
	}	
	
	public void enterLastName(WebDriver mydriver, String xpathExpression) {
		mydriver.findElement(By.xpath(xpathExpression)).sendKeys("PYTest2021");	
		
	
	}
		
	public void enterUserName(WebDriver mydriver, String xpathExpression) {
		mydriver.findElement(By.xpath(xpathExpression)).sendKeys("AutomationPYTest2021");	
		
			
	}
		
	
	public void enterPassword(WebDriver mydriver, String xpathExpression) {
		mydriver.findElement(By.xpath(xpathExpression)).sendKeys("A123456b$");	
		
			
	}
	
	public void enterConfirmPassword(WebDriver mydriver, String xpathExpression) {
		mydriver.findElement(By.xpath(xpathExpression)).sendKeys("A123456b$");	
		
			
	}
	
	public void showPassword(WebDriver mydriver, String xpathExpression) {
		mydriver.findElement(By.xpath(xpathExpression)).click();	
		
			
	}
	
	public void clickNext(WebDriver mydriver, String xpathExpression) {
		mydriver.findElement(By.xpath(xpathExpression)).click();	
		
			
	}
	
	
	public void EnterPhone(WebDriver mydriver, String xpathExpression) {
		mydriver.findElement(By.xpath(xpathExpression)).sendKeys("5715053888");	
		
		mydriver.findElement(By.xpath(xpathExpression)).sendKeys(Keys.ENTER);	
	}
	
	public void clickNextPhone(WebDriver mydriver, String xpathExpression) {
		mydriver.findElement(By.xpath(xpathExpression)).sendKeys(Keys.ENTER);	
		
			
	}
	
}