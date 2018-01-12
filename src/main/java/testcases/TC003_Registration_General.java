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
public class TC003_Registration_General extends LeafTapsWrappers{

	@BeforeClass
	public void setValue(){
		testCaseName = "New Registration for general users";
		testDescription ="general usr Registration in  mla users";
		category = "Sanitity";
		authors = "Ramesh";
		browserName = "chrome";
		dataSheetName = "TC003_Registration_General";
	}	
	@Test(dataProvider = "fetchData")

	public void generalUserRegistration(String usertype,String fName,String lName,String Address,String state,String city,String gender,String mobile,String emailid,String password,String txt) throws InterruptedException{
		HomePage mHp=new HomePage(driver,test);
		mHp.CloseOfferwindow();
		mHp.clickSignUp();
		RegistrationPage mRp= new RegistrationPage(driver,test);
		mRp.selectUserType(usertype);
		mRp.enterFirstName(fName);
		mRp.enterLastName(lName);
		mRp.enterAddress(Address);
		mRp.selectState(state);
		Thread.sleep(2000);
		mRp.selectCity(city);
		mRp.selectGender(gender);
		mRp.enterMobile(mobile);
		mRp.enterEmailId(emailid);
		mRp.enterPassword(password);
		mRp.clickGeneralTermsandConditions();
		mRp.clickRegisterButton();
		Thread.sleep(50000);
		mRp.verifyPopupAlertDetails(txt);
		Thread.sleep(50000);
		//Thread.sleep(2000);
		mRp.CloseSuccessPopup();
		Thread.sleep(50000);


	}
}