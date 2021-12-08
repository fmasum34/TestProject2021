package pageObjects;

public class HomePageObj {
//objecttype_objectname
	public static final String link_SignIn = "//a[contains(text(),'Sign in')]";
	public static final String Click_Create = "//span[contains(text(),'Create account')]";
	
	public static final String Click_Myself = "//span[contains(text(),'For myself')]";
	
	public static final String FirstName = "//input[@class='whsOnd zHQkBf'][@id='firstName']";
	
	public static final String LastName = "//input[@class='whsOnd zHQkBf'][@id='lastName']";
	
	public static final String UserName = "//input[@id='username']";
	
	public static final String Password = "//input[@name='Passwd'][@type='password']";
	
	
	public static final String ConfirmPassword = "//input[@name='ConfirmPasswd'][@type='password']";
	
	public static final String ShowPassword = "//input[@class='VfPpkd-muHVFf-bMcfAe'][@type='checkbox']";
	
	
	public static final String ClickNext = "//span[contains(text(),'Next')]";
		
		
	public static final String EnterPhone = "//input[@type='tel'][@id='phoneNumberId']";
	
	
	//public static final String ClickNextPho = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]";
	
	public static final String ClickNextPhone = "//span[contains(text(),'Next')]";
	
	
}
