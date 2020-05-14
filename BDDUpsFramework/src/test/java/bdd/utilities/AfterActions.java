package bdd.utilities;

import bdd.utilities.SetUpDrivers;
import cucumber.api.java.After;

public class AfterActions {
	@After
	public void afterActions() {
		SetUpDrivers.tearDownChromeDriver();
	}


}
