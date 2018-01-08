package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class HomePage extends LeafTapsWrappers{

	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		
		
		if(!verifyTitle("Mylawally - Home")){
			reportStep("This is not Home Page", "FAIL");
		}	
	}	

	public HomePage CloseOfferwindow(){
				
		clickByXpath("//img[@src='/Content/Images/offer-close-icon.jpg']");
		/*HomePage hp = new HomePage();
		return hp;*/		
		return new HomePage(driver, test);	
	}

	public LoginPage clickLoginbutton(){
		clickByLink("Login");		
		/*HomePage hp = new HomePage();
		return hp;*/		
		return new LoginPage(driver, test);	
	}


	public HomePage clickLogOut(){
		clickByLink("Logout");
		return new HomePage(driver, test);		
	}
	public ProfilePage clickProfile(){
		clickByLink("Profile");
		return new ProfilePage(driver,test);
	}

	public HomePage clickSignUp(){
		clickByLink("Sign up");
		return new HomePage(driver,test);
	}

	public HomePage clickCommunityLink() {
		clickByLink("Community");
		return new HomePage(driver,test);

	}

	public HomePage clickCentralActsLink() {
		clickByLink("Central Acts");
		return new HomePage(driver,test);
	}

	public HomePage clickCauselistLink() {
		clickByLink("Cause List");
		return new HomePage(driver,test);
	}

	public HomePage clickJudgementsLink() {
		clickByLink("Judgements");
		return new HomePage(driver,test);
	}

}


