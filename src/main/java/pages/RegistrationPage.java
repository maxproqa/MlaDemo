/**
 * 
 */
package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

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
		selectVisibileTextByXPath("//*[@id='formReg']/div[1]/select", value);
		return this;
	}

	public RegistrationPage enterFirstName(String data){
		enterByXpath("//input[@ng-model='Fname']", data);
		return this;
	}
	public RegistrationPage enterLastName(String data){
		enterByXpath("//input[@ng-model='LName']", data);
		return this;
	}
	public RegistrationPage enterContactName(String data){
		enterByXpath("//input[@placeholder='Contact Name']", data);
		return this;
	}
	public RegistrationPage enterAddress(String data) {
		enterByXpath("//input[@ng-model='Address1']", data);
		return this;
	}
	public RegistrationPage enterLandmark(String data) {
		enterByXpath("//input[@ng-model='LandMark']", data);
		return this;
	}
	public RegistrationPage selectState(String data){
		selectVisibileTextByXPath("//select[@ng-model='StateId1']", data);
		return this;
	}
	public RegistrationPage selectCourt(String data){
		selectVisibileTextByXPath("//select[@ng-model='CourtId']", data);
		return this;
	}
	public RegistrationPage selectCity(String data){
		selectVisibileTextByXPath("//select[@ng-model='CityId1']", data);
		return this;
	}
	public RegistrationPage selectGender(String data){
		selectVisibileTextByXPath("//select[@ng-model='Gender']", data);
		return this;
	}
	public RegistrationPage enterPincode(String data){
		enterByXpath("//input[@ng-model='pincode']", data);
		return this;

	}
	public RegistrationPage enterWorkingHours(String data){
		enterByXpath("//input[@ng-model='WorkingHours']", data);
		return this;
	}
	public RegistrationPage enterWebSite(String data){
		enterByXpath("//input[@ng-model='WebSite']", data);
		return this;
	}
	public RegistrationPage enterCompany(String data){
		enterByXpath("//input[@ng-model='Company']", data);
		return this;
	}
	public RegistrationPage enterEnrollmentID(String data){
		enterByXpath("//input[@placeholder='Enrollment ID']", data);
		return this;
	}

	public RegistrationPage enterInstituteName(String data){
		enterByXpath("//input[@placeholder='Institute Name']", data);
		return this;
	}


	public RegistrationPage enterBarCouncilNo(String data){
		enterByXpath("//input[@ng-model='BarCouncilNo']", data);
		return this;
	}

	public RegistrationPage enterMobile(String data){
		enterByXpath("//input[@ng-model='Mobile']", data);
		return this;
	}
	public RegistrationPage enterEmailId(String data){
		enterByXpath("//input[@ng-model='EmailId']", data);
		return this;
	}
	public RegistrationPage enterPassword(String data){
		enterByName("password", data);
		return this;
	}

	public RegistrationPage enterphoneno(String data){
		enterByXpath("//input[@ng-model='Phone1']", data);
		return this;
	}
	public RegistrationPage selectAOP(String data){
		selectVisibileTextByXPath("//select[@ng-model='AOP']", data);
		return this;
	}
	public RegistrationPage clickGeneralTermsandConditions(){
		clickByXpath("//input[@ng-model='chkAccept']");
		return this;
	}
	public RegistrationPage clickTermsandConditions(){
		clickById("chkLFAccept1");
		return this;
	}
	public RegistrationPage clickRegisterButton(){
		clickById("btGoLogin");
		return new RegistrationPage(driver,test);
	}
	public HomePage verifySuccesDetails(String text){
		verifyTextContainsByXpath("//p[@ng-bind='dbMessage']", text);
		return new HomePage(driver,test);
	}
	public HomePage CloseSuccessPopup(){
		clickByXpath("//button[@class='close']");
		return new HomePage(driver,test);
	}

	public LoginPage clickSigninbutton(){
		clickByLink("Sign In");
		return new LoginPage(driver,test);
	}
}