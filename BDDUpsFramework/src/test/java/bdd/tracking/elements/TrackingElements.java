package bdd.tracking.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrackingElements {
	
	
		@FindBy(xpath = "//textarea[@id='stApp_trackingNumber']")
		public WebElement TrcakId;

		@FindBy(xpath = "//button[@id='stApp_btnTrack']")
		public WebElement TrackBtn;

		@FindBy(xpath = "//h3[@id='stApp_error_alert_list0']")
		public WebElement errorMsg;


}
