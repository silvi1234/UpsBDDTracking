package bdd.step.Defn;

import org.testng.Assert;

import bdd.tracking.actions.TrackingPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrackingStepDEfn {

	 TrackingPageActions action = new  TrackingPageActions ();
	
	@Given("^User is already in the UPS Tracking page$")
	public void user_is_already_in_the_UPS_Trackingpage(){

        action.getUpsTrackingPage();
        String expectedtitle = "Tracking | UPS - United States";
        String actualtitle = action.getTrackingPageTitle();
        Assert.assertEquals(actualtitle,expectedtitle);

		
	}

	@When("^Customer input wrong Track number as \"([^\"]*)\"$")
	public void customer_input_wrong_Track_number_as(String arg1){
		action.inputTrackNumber("12345678987654321");
	     
	     
	}

	@When("^Customer clicks on Track button$")
	public void customer_clicks_on_Track_button(){
	     action.submit();
	     
	}

	@Then("^Customer should receive an error message$")
	public void customer_should_receive_an_error_message(){
	     
	     action.errorMsg();
	}

}
