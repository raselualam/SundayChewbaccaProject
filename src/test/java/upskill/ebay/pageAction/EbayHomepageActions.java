package upskill.ebay.pageAction;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayHomepageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomepageActions {
	
	EbayHomepageLocators EbayHomepageLocatorsObj;
	
	public EbayHomepageActions(){
		EbayHomepageLocatorsObj = new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsObj);
	}
	
	public void loadHomepage(){
//		SetupDrivers.driver.get("https://www.ebay.com/");											//loading the page
		
//		Selenium Wait : 1. Implicit wait(Global), 2. Explicit wait(Conditional), 3. Fluent wait(intermittent)

		SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				//Implicit Wait
		
//		WebDriverWait wait = new WebDriverWait(SetupDrivers.driver, 20);
//		wait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsObj.txtbxSearch));	//Explicit wait
//		
//		FluentWait fluentWait = new FluentWait(SetupDrivers.driver);								//Fluent Wait
//						fluentWait.withTimeout(20, TimeUnit.SECONDS);
//						fluentWait.pollingEvery(5, TimeUnit.SECONDS);
//						fluentWait.ignoring(NoSuchElementException.class);
//						fluentWait.withMessage("Fluent Wait Time exceeded");
	}
	
	public void searchShoes(){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("shoes");
		EbayHomepageLocatorsObj.btnSearch.click();
	}
	
	public void searchItems(String items){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys(items);
		EbayHomepageLocatorsObj.btnSearch.click();
	}
	
	
}
