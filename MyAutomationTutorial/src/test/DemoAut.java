package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageFlows.HomePage;
import pageObjects.HomePageObj;
import setup.TestRunSetup;

public class DemoAut {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

WebDriver mydriver = TestRunSetup.launch("chrome", "https://www.google.com/");

HomePage homepage = new HomePage();
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
}

}
