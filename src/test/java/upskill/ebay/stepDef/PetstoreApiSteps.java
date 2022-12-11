package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.api.restAssured.PetStoreRestAssuredActions;

public class PetstoreApiSteps {
	
	PetStoreRestAssuredActions PetStoreRestAssuredActionsObj = new PetStoreRestAssuredActions();

	@Given("^Create username$")
	public void create_username() throws Throwable {
		PetStoreRestAssuredActionsObj.createUsername();
	}

	@When("^Update username$")
	public void update_username() throws Throwable {
		PetStoreRestAssuredActionsObj.UpdateUsername();
	}

	@Then("^Get username$")
	public void get_username() throws Throwable {
		PetStoreRestAssuredActionsObj.getUsername();
	}

	@Then("^Delete username$")
	public void delete_username() throws Throwable {
		PetStoreRestAssuredActionsObj.deleteUsername();
	}
}