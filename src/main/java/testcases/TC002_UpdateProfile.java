package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import wrappers.LeafTapsWrappers;

/**
 * @author ramesh
 *
 */

public class TC002_UpdateProfile extends LeafTapsWrappers{
	@BeforeClass
	public void setValue(){
		testCaseName = "Updated Profile";
		testDescription ="Profile update in  mla";
		category = "Sanitity";
		authors = "Ramesh";
		browserName = "chrome";
		dataSheetName = "TC002";
	}	
	@Test(dataProvider = "fetchData")

	public void updateProfile(String uName, String pwd,String cName,String fName,String lName,String Address,String landmark,String state,String court,String city,String gender,String pincode,String Whours,String company, String website,String barcouncilno,String mobile,String phone,String txt){

		HomePage mHp=new HomePage(driver,test);
		
		mHp.CloseOfferwindow();
		mHp.clickLoginbutton();
		LoginPage mLp=new LoginPage(driver, test);
		mLp.enterUserName(uName);
		mLp.enterPassword(pwd);
		mLp.clicksignin();
		mHp.clickProfile();
		ProfilePage mPp =new ProfilePage(driver,test);
		mPp.enterContactName(cName);
		mPp.enterFirstName(fName);
		mPp.enterLastName(lName);
		mPp.enterAddress(Address);
		mPp.enterLandmark(landmark);
		mPp.selectState(state);
		mPp.selectCourt(court);
		mPp.selectCity(city);
		mPp.selectGender(gender);
		mPp.enterPincode(pincode);
		mPp.enterWorkingHours(Whours);
		mPp.enterCompany(company);
		mPp.enterWebSite(website);
		mPp.enterBarCouncilNo(barcouncilno);
		mPp.enterMobile(mobile);
		mPp.enterphoneno(phone);
		mPp.clickGeneralTermsandConditions();
		mPp.clickTermsandcontions();
		mPp.clickUpdateButton();
		mPp.verifySuccesDetails(txt);
		
		
	}

}
