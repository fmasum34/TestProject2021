package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebElement Element = null;
	
	public static WebElement textbox_search(WebDriver driver) {
		
		
		Element = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]"));
	
	return Element;
		
	
		
		
	}
	
	
public static WebElement textbox_button(WebDriver driver) {
		
		
		Element = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]"));
	
	return Element;
}
}
