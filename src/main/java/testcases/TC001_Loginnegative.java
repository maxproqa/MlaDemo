package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_Loginnegative extends LeafTapsWrappers{
	
	@BeforeClass
	public void setValue(){
		testCaseName = "Login (negative)";
		testDescription ="Login failure";
		category = "Sanity";
		authors = "Ramesh";
		browserName = "chrome";
		dataSheetName = "TC002";
	}	
	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String txt){
		HomePage mHp=new HomePage(driver,test);
		mHp.CloseOfferwindow();
		mHp.clickLoginbutton();
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLoginforFailure()
		.verifyLoginDetails(txt);
		
		
		
		
	}

}
