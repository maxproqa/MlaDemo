package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ForgotPasswordPage extends LeafTapsWrappers {
	public ForgotPasswordPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		//driver.getCurrentUrl();
		//driver.navigate().to("http://sso.bioezone.in");

		/*String Pagename ="Forgot Password";
		verifyTextContainsByXpath(prop.getProperty("ForgotPassword.PageTextVerify.Xpath"), Pagename);
		if(Pagename!="Forgot Password"){
			reportStep("This is not Forgot Password Page", "FAIL");

		}*/

	}
	public ForgotPasswordPage enterForgotEmailId(String EmailId){
		enterByXpath(prop.getProperty("ForgotPassword.EmailId.Xpath"), EmailId);
		return new ForgotPasswordPage(driver,test);
	}
	public ForgotPasswordPage clickSubmitButton(){
		clickByXpath(prop.getProperty("ForgotPassword.SubmitButton.Xpath"));
		return new ForgotPasswordPage(driver,test);
	}
	public ForgotPasswordPage verifyErrormsg(String text){
		verifyTextByXpath(prop.getProperty("ForgotPassword.ErrorMsg.Xpath"), text);
		return new ForgotPasswordPage(driver,test);
	}
	public LoginPage clickLoginButton(){
		clickByXpath(prop.getProperty("ForgotPassword.LoginButton.Xpath"));
		return new LoginPage(driver,test);
	}

}
