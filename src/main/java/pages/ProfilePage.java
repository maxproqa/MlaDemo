/**
 * 
 */
package pages;

import org.apache.commons.collections4.keyvalue.MultiKey;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

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

		if(!verifyTitle("Mylawally-Profile")){
			reportStep("This is not profile Page", "FAIL");
		}
	}
	public ProfilePage enterContactName(String data){
		enterByName("Contact Name", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage enterAddress(String data) {
		enterByXpath("//input[@ng-model='Address1']", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage enterLandmark(String data) {
		enterByXpath("//input[@ng-model='LandMark']", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage selectState(String data){
		selectVisibileTextByXPath("//select[@ng-model='StateId1]", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage selectCourt(String data){
		selectVisibileTextByXPath("//select[@ng-model='CourtId]", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage selectCity(String data){
		selectVisibileTextByXPath("//select[@ng-model='CityId1]", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage selectGender(String data){
		selectVisibileTextByXPath("//select[@ng-model='Gender]", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage enterPincode(String data){
		enterByName("//input[@ng-model='pincode]", data);
		return new ProfilePage(driver,test);

	}
	public ProfilePage enterWorkingHours(String data){
		enterByXpath("//input[@ng-model='WorkingHours]", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage enterWebSite(String data){
		enterByXpath("//input[@ng-model='WebSite]", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage enterCompany(String data){
		enterByXpath("//input[@ng-model='Company]", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage enterBarCouncilNo(String data){
		enterByXpath("//input[@ng-model='BarCouncilNo]", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage enterMobile(String data){
		enterByXpath("//input[@ng-model='Mobile]", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage enterphone1(String data){
		enterByXpath("//input[@ng-model='Phone1]", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage selectAOP(String data){
		selectVisibileTextByXPath("//select[@ng-model='AOP]", data);
		return new ProfilePage(driver,test);
	}
	public ProfilePage clickTermsandcontions(){
		
		return new ProfilePage(driver,test);
	}
}
