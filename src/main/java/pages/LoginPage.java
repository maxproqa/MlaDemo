package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class LoginPage extends LeafTapsWrappers{
	
	public LoginPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		
		/*if(!verifyTitle("https://sso.mylawally.com/")){
			reportStep("This is not Login Page", "FAIL");
		}	*/	
	}
	
	public LoginPage enterUserName(String data){
		enterById("username", data);
		return this;
	}
	
	public LoginPage enterPassword(String data){
		enterById("password", data);
		return this;
	}
	
	public HomePage clicksignin(){
		clickById("btGoLogin");
		/*HomePage hp = new HomePage();
		return hp;*/		
		return new HomePage(driver, test);		
	}
	
	public LoginPage clickLoginforFailure(){
		clickById("btGoLogin");		
		/*HomePage hp = new HomePage();
		return hp;*/		
		return this;		
	}
	
	public LoginPage verifyLoginDetails(String text){
		verifyTextContainsById("loginErrorMsg", text);
		return this;
	}
	public RegistrationPage clickCreateAccount(){
		
		return new RegistrationPage(driver,test);
	}

}



