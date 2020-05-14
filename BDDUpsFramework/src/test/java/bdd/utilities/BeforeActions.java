package bdd.utilities;

import bdd.utilities.SetUpDrivers;
import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	
	@Before
	public void beforeActions(Scenario scen){
		System.out.println("===============Driver Initialization================");
		SetUpDrivers.setupChromeDriver();
		System.out.println(scen.getName());
	}
	
	
	
	

}
