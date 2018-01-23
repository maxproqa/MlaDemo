/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

/**
 * @author ramesh
 *
 */
public class RegistrationPage extends LeafTapsWrappers{
	public RegistrationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test=test;
 		driver.getCurrentUrl();
		driver.navigate().to("http://sso.bioezone.in/Home/registration");

		if(!verifyTitle("Registration")){
			reportStep("This is not Registration Page", "FAIL");
		}
	}
	public RegistrationPage selectUserType(String value) {
		selectVisibileTextByXPath(prop.getProperty("Registration.UserType.Xpath"), value);
		return this;
	}

	public RegistrationPage enterFirstName(String data){
		enterByXpath(prop.getProperty("Registration.FirstName.Xpath"), data);
		return this;
	}
	public RegistrationPage enterLastName(String data){
		enterByXpath(prop.getProperty("Registration.LastName.Xpath"), data);
		return this;
	}
	public RegistrationPage enterContactName(String data){
		enterByXpath(prop.getProperty("Registration.ContactName.Xpath"), data);
		return this;
	}
	public RegistrationPage enterAddress(String data) {
		enterByXpath(prop.getProperty("Registration.Address.Xpath"), data);
		return this;
	}
	public RegistrationPage enterLandmark(String data) {
		enterByXpath(prop.getProperty("Registration.Landmark.Xpath"), data);
		return this;
	}
	public RegistrationPage selectState(String data){
		selectVisibileTextByXPath(prop.getProperty("Registraiton.State.Xpath"), data);
		return this;
	}
	public RegistrationPage selectCourt(String data){
		selectVisibileTextByXPath(prop.getProperty("Registration.Court.Xpath"), data);
		return this;
	}
	public RegistrationPage selectCity(String data){
		selectVisibileTextByXPath(prop.getProperty("Registration.City.Xpath"), data);
		return this;
	}
	public RegistrationPage selectGender(String data){
		selectVisibileTextByXPath(prop.getProperty("Registration.Gender.Xpath"), data);
		return this;
	}
	public RegistrationPage enterPincode(String data){
		enterByXpath(prop.getProperty("Registration.Pincode.Xpath"), data);
		return this;

	}
	public RegistrationPage enterWorkingHours(String data){
		enterByXpath(prop.getProperty("Registration.WorkingHours.Xpath"), data);
		return this;
	}
	public RegistrationPage enterWebSite(String data){
		enterByXpath(prop.getProperty("Registration.WebSite.Xpath"), data);
		return this;
	}
	public RegistrationPage enterCompany(String data){
		enterByXpath(prop.getProperty("Registration.Company.Xpath"), data);
		return this;
	}
	public RegistrationPage enterEnrollmentID(String data){
		enterByXpath(prop.getProperty("Registration.EnrollmentID.Xpath"), data);
		return this;
	}

	public RegistrationPage enterInstituteName(String data){
		enterByXpath(prop.getProperty("Registration.InstituteName.Xpath"), data);
		return this;
	}


	public RegistrationPage enterBarCouncilNo(String data){
		enterByXpath(prop.getProperty("Registration.BarCouncilNo.Xpath"), data);
		return this;
	}

	public RegistrationPage enterMobile(String data){
		enterByXpath(prop.getProperty("Registration.Mobile.Xpath"), data);
		return this;
	}
	public RegistrationPage enterEmailId(String data){
		enterByXpath(prop.getProperty("Registration.EmailId.Xpath"), data);
		return this;
	}
	public RegistrationPage enterPassword(String data){
		enterByName(prop.getProperty("Registration.Password.Name"), data);
		return this;
	}

	public RegistrationPage enterphoneno(String data){
		enterByXpath(prop.getProperty("Registration.phoneno.Xpath"), data);
		return this;
	}
	public RegistrationPage selectAOP(String data){
		selectVisibileTextByXPath(prop.getProperty("Registration.AOP.Xpath"), data);
		return this;
	}
	public RegistrationPage clickGeneralTermsandConditions(){
		clickByXpath(prop.getProperty("Registration.GeneralTermsandConditions.Xpath"));
		return this;
	}
	public RegistrationPage clickTermsandConditions(){
		clickById(prop.getProperty("Registration.TermsandConditions.Id"));
		return this;
	}
	
	public RegistrationPage clickRegisterButton(){
		clickById(prop.getProperty("Registration.RegisterButton.Id"));
		return new RegistrationPage(driver,test);
	}

	public RegistrationPage verifyPopupAlertDetails(String text){
		
		verifyTextContainsByXpath(prop.getProperty("Registration.PopupAlertDetails.Xpath"), text);
		return new RegistrationPage(driver,test);
	}
	public HomePage CloseSuccessPopup(){
		clickByXpath(prop.getProperty("Registration.SuccessPopup.Xpath"));
		return new HomePage(driver,test);
	}

	public LoginPage clickSigninbutton(){
		clickByLink(prop.getProperty("Registration.Signinbutton.Link"));
		return new LoginPage(driver,test);
	}
}