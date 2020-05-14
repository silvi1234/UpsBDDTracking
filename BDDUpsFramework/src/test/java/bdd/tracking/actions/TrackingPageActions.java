package bdd.tracking.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.tracking.elements.TrackingElements;
import bdd.utilities.SetUpDrivers;

public class TrackingPageActions {
	TrackingElements trackingAction;
	
	public TrackingPageActions() {
		this.trackingAction = new TrackingElements();
		PageFactory.initElements(SetUpDrivers.chromeDriver,trackingAction );
	}
	public void getUpsTrackingPage() {

		SetUpDrivers.chromeDriver.get("https://www.ups.com/track?loc=en_US&requester=ST/");
		SetUpDrivers.chromeDriver.manage().window().maximize();
		SetUpDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetUpDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public void inputTrackNumber(String str) {
		trackingAction.TrcakId.sendKeys(str);
	}

	public void submit() {
		trackingAction.TrackBtn.click();
	}

	public String errorMsg() {
		return trackingAction.errorMsg.getText();
	}
	public String getTrackingPageTitle(){
		String title =  SetUpDrivers.chromeDriver.getTitle();
		return title;
	}
	
	

}
