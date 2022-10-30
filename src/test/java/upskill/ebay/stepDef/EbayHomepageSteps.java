package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomepageSteps {
	
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		EbayHomepageActionsObj.loadHomepage();
	}
	
	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomepageActionsObj.searchShoes();
	}
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomepageActionsObj.searchItems(items);
	}
	
	@Given("^Search for Shirt$")
	public void search_for_Shirt() throws Throwable {
		EbayHomepageActionsObj.searchItems("Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT.");
	}

}
