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
public class TC003_Registration_Student extends LeafTapsWrappers{

	@BeforeClass
	public void setValue(){
		testCaseName = "Student Registration";
		testDescription ="Registration for new students in mlas";
		category = "Sanitity";
		authors = "Ramesh";
		browserName = "chrome";
		dataSheetName = "TC003_Registration_Student";
	}	
	@Test(dataProvider = "fetchData")

	public void StudentUserRegistration(String usertype,String fName,String lName,String Address,String state,String city,String gender,String enrollmentid,String institutename,String phone,String emailid,String password,String txt) throws InterruptedException{
		HomePage mHp=new HomePage(driver,test);
		mHp.CloseOfferwindow();
		mHp.clickSignUp();
		RegistrationPage mRp= new RegistrationPage(driver,test);
		mRp.selectUserType(usertype);
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
		mRp.verifyPopupAlertDetails(txt);
		mRp.CloseSuccessPopup();
	}
}