package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_LoginLogOut extends LeafTapsWrappers{

	@BeforeClass
	public void setValue(){
		testCaseName = "Login & LogOut";
		testDescription ="Login and Logout of mla";
		category = "smoke";
		authors = "Ramesh";
		browserName = "chrome";
		dataSheetName = "TC001";
	}	

	@Test(dataProvider = "fetchData")

	public void loginLogOut(String uName, String pwd){
		HomePage Hp=new HomePage(driver,test);
		Hp.CloseOfferwindow();
		Hp.clickLoginbutton();
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clicksignin()
		.clickLogOut();

	}

}
