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
public class ProfilePage extends LeafTapsWrappers{
	public ProfilePage(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;

		if(!verifyTitle("Profile")){
			reportStep("This is not profile Page", "FAIL");
		}
	}
	
	public ProfilePage enterFirstName(String data){
		enterByName("First Name", data);
		return this;
	}
	public ProfilePage enterLastName(String data){
		enterByName("Last Name", data);
		return this;
	}
	
	public ProfilePage enterContactName(String data){
		enterByName("Contact Name", data);
		return this;
	}
	public ProfilePage enterAddress(String data) {
		enterByXpath("//input[@ng-model='Address1']", data);
		return this;
	}
	public ProfilePage enterLandmark(String data) {
		enterByXpath("//input[@ng-model='LandMark']", data);
		return this;
	}
	public ProfilePage selectState(String data){
		selectVisibileTextByXPath("//select[@ng-model='StateId1]", data);
		return this;
	}
	public ProfilePage selectCourt(String data){
		selectVisibileTextByXPath("//select[@ng-model='CourtId]", data);
		return this;
	}
	public ProfilePage selectCity(String data){
		selectVisibileTextByXPath("//select[@ng-model='CityId1]", data);
		return this;
	}
	public ProfilePage selectGender(String data){
		selectVisibileTextByXPath("//select[@ng-model='Gender]", data);
		return this;
	}
	public ProfilePage enterPincode(String data){
		enterByName("//input[@ng-model='pincode]", data);
		return this;

	}
	public ProfilePage enterWorkingHours(String data){
		enterByXpath("//input[@ng-model='WorkingHours]", data);
		return this;
	}
	public ProfilePage enterWebSite(String data){
		enterByXpath("//input[@ng-model='WebSite]", data);
		return this;
	}
	public ProfilePage enterCompany(String data){
		enterByXpath("//input[@ng-model='Company]", data);
		return this;
	}
	public ProfilePage enterBarCouncilNo(String data){
		enterByXpath("//input[@ng-model='BarCouncilNo]", data);
		return this;
	}
	public ProfilePage enterMobile(String data){
		enterByXpath("//input[@ng-model='Mobile]", data);
		return this;
	}
	public ProfilePage enterphoneno(String data){
		enterByXpath("//input[@ng-model='Phone1]", data);
		return this;
	}
	
	public ProfilePage enterEnrollmentID(String data){
		enterByName("barcouncil", data);
		return this;
	}
	
	public ProfilePage enterInstituteName(String data){
		enterByName("institute", data);
		return this;
	}
	
	
	public ProfilePage selectAOP(String data){
		selectVisibileTextByXPath("//select[@ng-model='AOP]", data);
		return this;
	}
	public ProfilePage clickGeneralTermsandConditions(){
		clickByXpath("//input[@ng-model='chkAccept]");
		return this;
	}
	public ProfilePage clickTermsandcontions(){
		clickByXpath("//input[@id='chkLFAccept1t]");
		return this;
	}
	public ProfilePage clickUpdateButton(){
		clickById("btGoLogin");
		return new ProfilePage(driver,test);
	}

	public HomePage verifySuccesDetails(String text){
		verifyTextContainsByXpath("//*[@id='myModal3']/div/div/div[2]/p", text);
		return new HomePage(driver,test);
	}


	public HomePage CloseSuccessPopup(){
		clickByLink("Okay");
		return new HomePage(driver,test);
	}
}
