/**
 * 
 */
package testcases;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegistrationPage;
import wrappers.LeafTapsWrappers;

/**
 * @author ramesh
 *
 */
public class TC003_Registration_Lawyer extends LeafTapsWrappers{

	@BeforeClass
	public void setValue(){
		
		testCaseName = "New Lawyer Registration";
		testDescription ="Registration for new mla lawyer users";
		category = "Sanitity";
		authors = "Ramesh";
		browserName = "chrome";
		dataSheetName = "TC003_Registration_Lawyer";
	}	
	@Test(dataProvider = "fetchData")

	public void LawyerRegistration(String usertype,String cName,String Address,String landmark,String state,String court,String city,String gender,String pincode,String Whours,String website,String company,String barcouncilno,String mobile,String phone,String emailid,String password,String txt) throws InterruptedException{
		HomePage mHp=new HomePage(driver,test);
		mHp.CloseOfferwindow();
		mHp.clickSignUp();
		RegistrationPage mRp= new RegistrationPage(driver,test);
		mRp.selectUserType(usertype);
		mRp.enterContactName(cName);
		mRp.enterAddress(Address);
		mRp.enterLandmark(landmark);
		mRp.selectState(state);
		mRp.selectCourt(court);
		mRp.selectCity(city);
		mRp.selectGender(gender);
		mRp.enterPincode(pincode);
		mRp.enterWorkingHours(Whours);
		mRp.enterWebSite(website);
		mRp.enterCompany(company);
		mRp.enterBarCouncilNo(barcouncilno);
		mRp.enterMobile(mobile);
		mRp.enterphoneno(phone);
		mRp.enterEmailId(emailid);
		mRp.enterPassword(password);
		mRp.clickGeneralTermsandConditions();
		mRp.clickTermsandConditions();
		mRp.clickRegisterButton();
		mRp.verifyPopupAlertDetails(txt);
		mRp.CloseSuccessPopup();
	}



}