package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_ForgotPassword extends LeafTapsWrappers{
	@BeforeClass
	public void setValue(){
		testCaseName = "Forgot password";
		testDescription ="Forgot Password for Valid and invalid scenarios";
		category = "Sanitity";
		authors = "Ramesh";
		browserName = "chrome";
		dataSheetName = "TC004_ForgotPassword";
	}	
	@Test(dataProvider = "fetchData")
public void ForgotPassword(String EmailId ,String text){
		HomePage mHp=new HomePage(driver,test);
		mHp.CloseOfferwindow();
		mHp.clickLoginbutton();
		LoginPage Lp=new LoginPage(driver, test);
		ForgotPasswordPage Fp=new ForgotPasswordPage(driver, test);
		Lp.clickForgotPassword();
		Fp.enterForgotEmailId(EmailId);
		Fp.clickSubmitButton();
		Fp.verifyErrormsg(text);
		
		
	}

}
