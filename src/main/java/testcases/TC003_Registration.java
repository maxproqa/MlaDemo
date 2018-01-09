/**
 * 
 */
package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegistrationPage;
import wrappers.LeafTapsWrappers;

/**
 * @author ramesh
 *
 */
public class TC003_Registration extends LeafTapsWrappers{
	
	@BeforeClass
	public void setValue(){
		testCaseName = "New Registration";
		testDescription ="Registration for new mla users";
		category = "Sanitity";
		authors = "Ramesh";
		browserName = "chrome";
		dataSheetName = "TC003";
	}	
	@Test(dataProvider = "fetchData")
	
	public void UserRegistration(String usertype,String fName,String lName,String Address,String state,String city,String gender,String mobile,String emailid,String password,String txt,String cName,String institutename,String enrollmentid,String landmark,String court,String pincode,String Whours,String company, String website,String barcouncilno,String phone){
		HomePage mHp=new HomePage(driver,test);
		mHp.CloseOfferwindow();
		mHp.clickSignUp();
		RegistrationPage mRp= new RegistrationPage(driver,test);
		mRp.selectUserType(usertype);
		if(usertype.equalsIgnoreCase("General")){
			mRp.enterFirstName(fName);
			mRp.enterLastName(lName);
			mRp.enterAddress(Address);
			mRp.selectState(state);
			mRp.selectCity(city);
			mRp.selectGender(gender);
			mRp.enterMobile(mobile);
			mRp.enterEmailId(emailid);
			mRp.enterPassword(password);
			mRp.clickGeneralTermsandConditions();
			mRp.clickRegisterButton();
			mRp.CloseSuccessPopup();
			//mRp.verifySuccesDetails(txt);

		}
		else if(usertype.equalsIgnoreCase("Law Firm")){
			mRp.enterContactName(cName);
			mRp.enterAddress(Address);
			mRp.enterLandmark(landmark);
			mRp.selectState(state);
			mRp.selectCourt(court);
			mRp.selectCity(city);
			mRp.enterPincode(pincode);
			mRp.enterWorkingHours(Whours);
			mRp.enterWebSite(website);
			mRp.enterCompany(company);
			mRp.enterMobile(mobile);
			mRp.enterphoneno(phone);
			mRp.enterEmailId(emailid);
			mRp.enterPassword(password);
			mRp.clickGeneralTermsandConditions();
			mRp.clickRegisterButton();
			mRp.verifySuccesDetails(txt);
			mRp.CloseSuccessPopup();

		}
		else if(usertype.equalsIgnoreCase("Lawyer")){
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
			mRp.verifySuccesDetails(txt);
			mRp.CloseSuccessPopup();
		}
		else if(usertype.equalsIgnoreCase("Litigant")){
			mRp.enterFirstName(fName);
			mRp.enterLastName(lName);
			mRp.enterAddress(Address);
			mRp.selectState(state);
			mRp.selectCity(city);
			mRp.selectGender(gender);
			mRp.enterMobile(mobile);
			mRp.enterEmailId(emailid);
			mRp.enterPassword(password);
			mRp.clickGeneralTermsandConditions();
			mRp.clickRegisterButton();
			mRp.verifySuccesDetails(txt);
			mRp.CloseSuccessPopup();
		}
		else if(usertype.equalsIgnoreCase("Student")){
			mRp.enterFirstName(fName);
			mRp.enterLastName(lName);
			mRp.enterAddress(Address);
			mRp.selectState(state);
			mRp.selectCity(city);
			mRp.selectGender(gender);
			mRp.enterEnrollmentID(enrollmentid);
			mRp.enterInstituteName(institutename);
			mRp.enterphoneno(phone);
			mRp.enterEmailId(emailid);
			mRp.enterPassword(password);
			mRp.clickGeneralTermsandConditions();
			mRp.clickRegisterButton();
			mRp.verifySuccesDetails(txt);
			mRp.CloseSuccessPopup();
		}
		
		else{
			System.out.println("Invalid UserType");
		}



	}
}