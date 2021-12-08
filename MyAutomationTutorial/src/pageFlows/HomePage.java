package pageFlows;

import org.openqa.selenium.WebDriver;

import infrastructure.Operation;
import pageObjects.HomePageObj;

public class HomePage {
	
	Operation op = new Operation();
	public void Register(WebDriver mydriver){
	
	
	
	op.clickLink(mydriver, HomePageObj.link_SignIn);
	
	}	

	
	public void Create (WebDriver mydriver) {
		
		op.clickCreate(mydriver, HomePageObj.Click_Create);
	}
	
	public void CreateMyself (WebDriver mydriver) {
		
		op.click_Myself(mydriver, HomePageObj.Click_Myself);
	}
	
	public void enterFirstaName_1(WebDriver mydriver) {
	
		op.enterFirstName(mydriver, HomePageObj.FirstName);
	}
	
	
	public void enterLastaName_1(WebDriver mydriver) {
		
		op.enterLastName(mydriver, HomePageObj.LastName);
	}
	
	public void enterUserName_1(WebDriver mydriver) {
		
		op.enterUserName(mydriver, HomePageObj.UserName);
	}
	
	public void enterPassword_1(WebDriver mydriver) {
		
		op.enterPassword(mydriver, HomePageObj.Password);
	}
	
	public void enterConfirmPassword_1(WebDriver mydriver) {
		
		op.enterConfirmPassword(mydriver, HomePageObj.ConfirmPassword);
	}
	
	
	public void showConfirmPassword_1(WebDriver mydriver) {
		
		op.showPassword(mydriver, HomePageObj.ShowPassword);
	}
	
	public void clickNext_1(WebDriver mydriver) {
		
		op.clickNext(mydriver, HomePageObj.ClickNext);
	}
	
	
	public void enterPhone_1(WebDriver mydriver) {
		
		op.EnterPhone(mydriver, HomePageObj.EnterPhone);
		
		
	
	}	
	
	public void clickPhone_2(WebDriver mydriver) {
		
		op.clickNextPhone(mydriver, HomePageObj.ClickNextPhone);
		
	}
}
