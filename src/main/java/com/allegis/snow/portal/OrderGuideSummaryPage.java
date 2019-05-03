package com.allegis.snow.portal;

import org.openqa.selenium.support.FindBy;
import com.allegis.snow.base.BasePage;
import com.framework.core.interfaces.Element;
import com.framework.core.interfaces.impl.internal.ElementFactory;
import com.framework.utils.AllegisDriver;
import com.framework.utils.TestReporter;

public class OrderGuideSummaryPage  extends BasePage {

	/** Page Elements **/
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Describe Needs')]/preceding-sibling::div")
	private Element wbeDescribeNeedsIcon;
	
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Describe Needs')]")
	private Element wbeDescribeNeeds;
	
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Choose Options')]/preceding-sibling::div")
	private Element wbeChooseOptionsIcon;
	
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Choose Options')]")
	private Element wbeChooseOptions;
	
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Summary')]/preceding-sibling::div")
	private Element wbeSummaryIcon;
	
	@FindBy(xpath = "//span[@class='text-muted m-l-sm step-text ng-binding'][contains(text(),'Summary')]")
	private Element wbeSummary;
	
	@FindBy(xpath = "//table[@summary='Summary of the guide']/thead/tr/th[1]")
	private Element wbeOrderGuideDetails;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'User Account')]")
	private Element wbeOrderUserAccount;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'User Account')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityUserAccount;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Disable AD account')]")
	private Element wbeOrderDisableADAccount;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Disable AD account')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityDisableADAccount;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Building access')]")
	private Element wbeOrderBuildingAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Building access')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityBuildingAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Preferred Display Name')]")
	private Element wbeOrderPreferredName;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Preferred Display Name')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityPreferredName;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Default Email Domain')]")
	private Element wbeOrderDefaultEmailDomain;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Default Email Domain')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityDefaultEmailDomain;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Additional Items')]")
	private Element wbeOrderAdditionalItems;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Additional Items')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityAdditionalItems;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Printer')]")
	private Element wbeOrderPrinterAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Printer')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityPrinterAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Standard Desktop')]")
	private Element wbeOrderStandardDesktop;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Standard Desktop')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityStandardDesktop;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'MarketSource Standard Desktop')]")
	private Element wbeOrderStandardDesktopNAMSU;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'MarketSource Standard Desktop')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityStandardDesktopNAMSU;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'TEK BOA Desktop')]")
	private Element wbeOrderTEKDesktop;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'TEK BOA Desktop')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityTEKDesktop;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Standard Laptop')]")
	private Element wbeOrderStandardLaptop;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Standard Laptop')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityStandardLaptop;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'MarketSource Standard Laptop')]")
	private Element wbeOrderStandardLaptopNAMSU;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'MarketSource Standard Laptop')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityStandardLaptopNAMSU;	
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Travel Laptop')]")
	private Element wbeOrderTravelLaptop;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Travel Laptop')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityTravelLaptop;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'MarketSource Travel Laptop')]")
	private Element wbeOrderTravelLaptopNAMSU;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'MarketSource Travel Laptop')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityTravelLaptopNAMSU;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'External Monitor')]")
	private Element wbeOrderMonitor;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'External Monitor')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityMonitor;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Non-Standard Computer')]")
	private Element wbeOrderNonStandardComputer;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Non-Standard Computer')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityNonStandardComputer;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Desk Phone')]")
	private Element wbeOrderDeskPhone;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Desk Phone')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityDeskPhone;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Wired Headset')]")
	private Element wbeOrderWiredHeadSet;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Wired Headset')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityWiredHeadSet;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Wireless Headset')]")
	private Element wbeOrderWirelessHeadSet;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Wireless Headset')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityWirelessHeadSet;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'USB Headset')]")
	private Element wbeOrderUSBHeadSet;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'USB Headset')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityUSBHeadSet;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'New Extension')]")
	private Element wbeOrderNewExtension;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'New Extension')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityNewExtension;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Reassign Extension')]")
	private Element wbeOrderReassignExtension;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Reassign Extension')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityReassignExtension;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Mobile Phone')]")
	private Element wbeOrderMobilePhone;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Mobile Phone')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityMobilePhone;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'EchoSign')]")
	private Element wbeOrderEchoSignAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'EchoSign')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityEchoSignAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'MaxHire')]")
	private Element wbeOrderMaxHireAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'MaxHire')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityMaxHireAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'OnBase')]")
	private Element wbeOrderOnBaseAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'OnBase')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityOnBaseAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'PeopleSoft FS')]")
	private Element wbeOrderPeopleSoftFSAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'PeopleSoft FS')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityPeopleSoftFSAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'PeopleSoft HR')]")
	private Element wbeOrderPeopleSoftHRAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'PeopleSoft HR')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityPeopleSoftHRAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'PeopleSoft nVision')]")
	private Element wbeOrderPeopleSoftNVAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'PeopleSoft nVision')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityPeopleSoftNVAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'PeopleSoft Oasis')]")
	private Element wbeOrderPeopleSoftOAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'PeopleSoft Oasis')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityPeopleSoftOAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Onboarding Automation')]")
	private Element wbeOrderOnboardingAutomationAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Onboarding Automation')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityOnboardingAutomationAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Time and Expense')]")
	private Element wbeOrderTimeAndExpenseAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Time and Expense')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityTimeAndExpenseAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Time Central')]")
	private Element wbeOrderTimeCentralAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Time Central')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityTimeCentralAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'VDI')]")
	private Element wbeOrderVDIAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'VDI')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityVDIAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'WSSRD')]")
	private Element wbeOrderWSSRDAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'WSSRD')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityWSSRDAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'S Drive')]")
	private Element wbeOrderSDriveAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'S Drive')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantitySDriveAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Salesforce')]")
	private Element wbeOrderSalesforceAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Salesforce')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantitySalesforceAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Web Focus BI')]")
	private Element wbeOrderWebFocusBI;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Web Focus BI')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityWebFocusBI;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Global Delivery Portal')]")
	private Element wbeOrderGDP;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Global Delivery Portal')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityGDP;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Hyperion')]")
	private Element wbeOrderHyperion;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Hyperion')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityHyperion;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Contract Logix')]")
	private Element wbeOrderContractLogixAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Contract Logix')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityContractLogixAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'Candidate Tracker')]")
	private Element wbeOrderCandidateTrackerAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'Candidate Tracker')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantityCandidateTrackerAccess;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[@class='wrapper-sm v-middle wrapper-cart-xs border-top-xs']/span[contains(text(),'SailPoint User Account')]")
	private Element wbeOrderSailPointUserAccount;
	
	@FindBy(xpath = "//tr[@class='ng-scope']/td[1]/span[contains(text(),'SailPoint User Account')]/parent::td/following-sibling::td/span[@class='ng-binding']")
	private Element wbeQuantitySailPointUserAccount;
	
	@FindBy(xpath = ".//button[@id='submit'][contains(text(),'Next')]")
	private Element btnNext;
	
	@FindBy(xpath = ".//button[@id='submit'][contains(text(),'Previous')]")
	private Element btnPrevious;
	
	@FindBy(xpath = "//button[@class='btn btn-primary ng-binding']")
	private Element btnOrderNow;
	
	/** Constructor **/
	public OrderGuideSummaryPage(AllegisDriver driver) {
		super(driver);
		ElementFactory.initElements(driver, this);
	}
	
	/**
	 * verify the Onboard Employee Summary options tab  Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void summaryOptionsTabValidation() {
		
		TestReporter.logStep("Verify Summary Options tab active");
		TestReporter.assertTrue(wbeDescribeNeedsIcon.getAttribute("class").contains("circle_icon step_inactive")
				,"Describe Needs Tab Inactive as expected");
		TestReporter.assertTrue(wbeChooseOptionsIcon.getAttribute("class").contains("circle_icon step_inactive")
				,"ChooseOptions Tab Inactive as expected");
		TestReporter.assertTrue(wbeSummaryIcon.getAttribute("class").contains("circle_icon step_active")
				,"Summary Tab active as expected");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Details Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideDetails() {
		
		TestReporter.logStep("Verify Orgder Guide Details Section");
		orderGuideDetailsVisible();
		orderGuideUserAccount();
		orderGuidePrinterAccess();
		orderGuideNewExtension();
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Details Validation specific to job code
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJob(String jobTitle) {
		
		if(jobTitle.contains("9935")|| jobTitle.contains("9954")
				|| jobTitle.contains("7738")|| jobTitle.contains("8999")
				|| jobTitle.contains("9934"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideSailPointUserAccountNA();
			//orderGuideUserAccount();
			orderGuideBuildingAccess();
			orderGuideStandardLaptopNAMSU();
			orderGuideMonitor();
			orderGuideDeskPhone();
			orderGuideWiredHeadSet();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftNVAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideOnboardingAutomationAccess();
			orderGuideTimeCentral();	
			orderGuideTimeAndExpense();
			orderGuideWSSRDAccess();
			orderGuideSalesForceAccess();
			orderGuideWebFocusBI();
			orderGuideHyperionAccess();
			orderGuideContractLogixAccess();
			orderGuideVDIAccess();
			
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Details DisableADAccount  Validation specific to job code
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobDisableADAccount(String jobTitle) {
		
		if(jobTitle.contains("9935")|| jobTitle.contains("9954")
				|| jobTitle.contains("7738")|| jobTitle.contains("8999")
				|| jobTitle.contains("9934"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			// Commenting as of now due to production issue- will uncomment later
			// orderGuideDisableADAccount();
			orderGuideStandardLaptopNAMSU();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Details Validation specific to job code for No Services
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobNoServices(String operatingCompany) {
		
		if(operatingCompany.contains("| MSU"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideSailPointUserAccount();
			orderGuideBuildingAccess();
		}
		else if(operatingCompany.contains("MLA"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideSailPointUserAccount();
			orderGuideWirelessHeadSet();
		}
		else if(operatingCompany.contains("| ONS"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideSailPointUserAccount();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
		}
		else if(operatingCompany.contains("| EFI"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideSailPointUserAccount();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
			orderGuideSDriveAccess();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideSailPointUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Details Validation specific to job code for No Services
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobEmailAddItems(String operatingCompany) {
		
		if(operatingCompany.contains("| MSU"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideDefaultEmailDomain();
			orderGuideAdditionalItems();

		}
		else if(operatingCompany.contains("| MLA"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideDefaultEmailDomain();
			orderGuideAdditionalItems();
			orderGuideWirelessHeadSet();
		}
		else if(operatingCompany.contains("| ONS"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideDefaultEmailDomain();
			orderGuideAdditionalItems();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
		}
		else if(operatingCompany.contains("| EFI"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideDefaultEmailDomain();
			orderGuideAdditionalItems();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
			orderGuideSDriveAccess();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Details Validation specific to job code for Pref Name
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobPrefName(String operatingCompany) {
		
		if(operatingCompany.contains("| MSU"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePreferredName();
			orderGuideBuildingAccess();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific to  job code Standard laptop for workflow without approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobStandardLaptopNAmonitorNA(String jobTitle) {
		
		if(jobTitle.contains("9935")|| jobTitle.contains("8999")
				|| jobTitle.contains("7076")|| jobTitle.contains("9929") 
				|| jobTitle.contains("9937") || jobTitle.contains("9926") 
				|| jobTitle.contains("9941") || jobTitle.contains("9929") 
				|| jobTitle.contains("900026"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideBuildingAccess();
			orderGuideStandardLaptopNAMSU();
			orderGuideMonitor();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific to job code Standard laptop for workflow with approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobStandardLaptopAmonitorA(String jobTitle) {
		
		if(jobTitle.contains("9954")|| jobTitle.contains("7076")
				|| jobTitle.contains("7079")|| jobTitle.contains("9899")
				|| jobTitle.contains("9945")|| jobTitle.contains("9953")
				|| jobTitle.contains("5874") || jobTitle.contains("3407")
				|| jobTitle.contains("9944") || jobTitle.contains("7090") 
				|| jobTitle.contains("9963"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideStandardLaptopNAMSU();
			orderGuideMonitor();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific Standard laptop  approval and monitor No Approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobStandardLaptopAmonitorNA(String jobTitle) {
		
		if(jobTitle.contains("8999")|| jobTitle.contains("9937"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideStandardLaptopNAMSU();
			orderGuideMonitor();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific Standard laptop No approval and monitor Approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobStandardLaptopNAmonitorA(String jobTitle) {
		
		if(jobTitle.contains("7076")|| jobTitle.contains("3021")
				|| jobTitle.contains("7738")|| jobTitle.contains("1800")
				|| jobTitle.contains("1098"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideStandardLaptopNAMSU();
			orderGuideMonitor();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific Travel laptop  job code for workflow without approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobTravelLaptopNAmonitorNA(String jobTitle) {
		
		if(jobTitle.contains("9929")|| jobTitle.contains("8999")
				|| jobTitle.contains("900026")|| jobTitle.contains("9937")
				|| jobTitle.contains("0322"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideTravelLaptopNAMSU();
			orderGuideMonitor();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific Travel laptop  job code for workflow with approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobTravelLaptopAmonitorA(String jobTitle) {
		
		if(jobTitle.contains("7076")|| jobTitle.contains("9934")
				|| jobTitle.contains("5874")|| jobTitle.contains("7090")
				|| jobTitle.contains("1098"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideTravelLaptopNAMSU();
			orderGuideMonitor();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific Travel laptop  approval and monitor No Approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobTravelLaptopAmonitorNA(String jobTitle) {
		
		if(jobTitle.contains("9935")|| jobTitle.contains("0322")
				|| jobTitle.contains("5869")|| jobTitle.contains("2252")
				|| jobTitle.contains("9955"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideTravelLaptopNAMSU();
			orderGuideMonitor();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific Travel laptop No approval and monitor Approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobTravelLaptopNAmonitorA(String jobTitle) {
		
		if(jobTitle.contains("9954")|| jobTitle.contains("1098")
				|| jobTitle.contains("8999")|| jobTitle.contains("9174")
				|| jobTitle.contains("9934"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideTravelLaptopNAMSU();
			orderGuideMonitor();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific Standard Desktop desk phone no approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobStandardDesktopNADeskPhoneNA(String jobTitle) {
		
		if(jobTitle.contains("9929")
				|| jobTitle.contains("0322")|| jobTitle.contains("9958")
				|| jobTitle.contains("9954")|| jobTitle.contains("2252"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideStandardDesktopNAMSU();
			orderGuideDeskPhone();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific Non Standard computer, new extension and USB no approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobNonStandardNANewExtensionNAUSBNA(String jobTitle) {
		
		if(jobTitle.contains("9929")|| jobTitle.contains("8999")
				|| jobTitle.contains("9174")|| jobTitle.contains("9954")
				|| jobTitle.contains("9937"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideNonStandardComputer();
			orderGuideNewExtension();
			orderGuideUSBHeadSet();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific Reassign extension and WIRED  no approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobReassignExtensionNAWiredNA(String jobTitle) {
		
		if(jobTitle.contains("9954")|| jobTitle.contains("6946")
				|| jobTitle.contains("9929")|| jobTitle.contains("900026")
				|| jobTitle.contains("7076"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideStandardDesktopNAMSU();
			orderGuideReassignExtension();
			orderGuideWiredHeadSet();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific Non Standard computer, new extension and USB no approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobMLA(String jobTitle) {
		
		if(jobTitle.contains("000001")|| jobTitle.contains("000008")
				|| jobTitle.contains("40058")|| jobTitle.contains("592")
				|| jobTitle.contains("9044"))
		{	
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideSailPointUserAccountNA();
			//orderGuideUserAccount();
			orderGuideStandardLaptop();
			orderGuideMonitor();
			orderGuideNewExtension();
			orderGuideWirelessHeadSet();
			orderGuideMaxHireAccess();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideOnboardingAutomationAccess();
			orderGuideTimeAndExpense();
			orderGuideTimeCentral();
			orderGuideWSSRDAccess();
			orderGuideSalesForceAccess();
			orderGuideWebFocusBI();
			orderGuideHyperionAccess();
			orderGuideContractLogixAccess();
			orderGuideVDIAccess();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific TEK BOA Desktop no approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobTEK(String jobTitle) {
		
		if(jobTitle.contains("117")|| jobTitle.contains("000118")
				|| jobTitle.contains("4024")|| jobTitle.contains("7781")
				|| jobTitle.contains("7782"))
		{	
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideTEKDesktop();
			orderGuideMonitor();
			orderGuideDeskPhone();
			orderGuideWiredHeadSet();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
			orderGuideSDriveAccess();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific AEROTEK Desktop no approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsJobAEROTEK(String jobTitle) {
		
		if(jobTitle.contains("117")|| jobTitle.contains("000118")
				|| jobTitle.contains("4024"))
		{	
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideSailPointUserAccount();
			orderGuideStandardDesktop();
			orderGuideMonitor();
			orderGuideDeskPhone();
			orderGuideUSBHeadSet();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	//EMEA Validations:
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Details Validation specific to job code
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideDetailsJobEMEA(String jobTitle) {
		

		if(jobTitle.contains("1100"))
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardDesktop();
			orderGuideNewExtension();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftNVAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
		}
		else if(jobTitle.contains("1056"))
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardDesktop();
			orderGuideNewExtension();
			orderGuideEchoSignAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
		}
		else if(jobTitle.contains("163002"))
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardDesktop();
			orderGuideNewExtension();
			orderGuideEchoSignAccess();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
			orderGuideTimeCentral();
		}
		else if(jobTitle.contains("1101"))
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardDesktop();
			orderGuideNewExtension();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftNVAccess();
			orderGuidePeopleSoftOasisAccess();
		}
		else if(jobTitle.contains("5136"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardDesktop();
			orderGuideNewExtension();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftNVAccess();
			orderGuidePeopleSoftOasisAccess();
		}
		
		else if(jobTitle.contains("900037"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardDesktop();
			orderGuideNewExtension();
			orderGuideEchoSignAccess();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
			orderGuideTimeCentral();
		}
		else if(jobTitle.contains("9935"))
		{		
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuideBuildingAccess();
			orderGuideStandardLaptop();
			orderGuideMonitor();
			orderGuideDeskPhone();
			orderGuideWiredHeadSet();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftNVAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeCentral();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	

	/**
	 * verify the Onboard Employee Summary options tab- Order guide Details Validation for travel Desktop specific to job code EMEA No Approval
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideDetailsJobStandardDesktopEMEA(String jobTitle) {
		if(jobTitle.contains("163002"))
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardDesktop();
			orderGuideNewExtension();
			orderGuideMobilePhone();
			orderGuideEchoSignAccess();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
			orderGuideTimeCentral();
		}
		else if(jobTitle.contains("1051")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardDesktop();
			orderGuideNewExtension();
			orderGuideMobilePhone();
			orderGuideEchoSignAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
		}
		else if(jobTitle.contains("600052")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardDesktop();
			orderGuideNewExtension();
			orderGuideMobilePhone();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
		}
		else if(jobTitle.contains("592")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardDesktop();
			orderGuideNewExtension();
			orderGuideMobilePhone();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
		}
		else if(jobTitle.contains("000008")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardDesktop();
			orderGuideNewExtension();
			orderGuideMobilePhone();
			orderGuideEchoSignAccess();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Details Validation for travel laptop specific to job code for EMEA 
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideDetailsJobStandardLaptopEMEA(String jobTitle) {
		if(jobTitle.contains("163002"))
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardLaptop();
			orderGuideNewExtension();
			orderGuideMobilePhone();
			orderGuideEchoSignAccess();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
			orderGuideTimeCentral();
		}
		else if(jobTitle.contains("1051")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardLaptop();
			orderGuideNewExtension();
			orderGuideMobilePhone();
			orderGuideEchoSignAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
		}
		else if(jobTitle.contains("600052")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardLaptop();
			orderGuideNewExtension();
			orderGuideMobilePhone();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
		}
		else if(jobTitle.contains("592")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardLaptop();
			orderGuideNewExtension();
			orderGuideMobilePhone();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
		}
		else if(jobTitle.contains("000008")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideStandardLaptop();
			orderGuideNewExtension();
			orderGuideMobilePhone();
			orderGuideEchoSignAccess();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Details Validation for travel laptop specific to job code
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideDetailsJobTravelLaptopEMEA(String jobTitle) {
		if(jobTitle.contains("163002"))
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideTravelLaptop();
			orderGuideNewExtension();
			orderGuideEchoSignAccess();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
			orderGuideTimeCentral();
		}
		else if(jobTitle.contains("1051")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideTravelLaptop();
			orderGuideNewExtension();
			orderGuideEchoSignAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
		}
		else if(jobTitle.contains("600052")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideTravelLaptop();
			orderGuideNewExtension();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
		}
		else if(jobTitle.contains("592")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideTravelLaptop();
			orderGuideNewExtension();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
		}
		else if(jobTitle.contains("000008")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideTravelLaptop();
			orderGuideNewExtension();
			orderGuideEchoSignAccess();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
		}
		
		else if(jobTitle.contains("40074")||jobTitle.contains("60076")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideTravelLaptop();
			orderGuideNewExtension();
		}
		else if(jobTitle.contains("1101")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideTravelLaptop();
			orderGuideNewExtension();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftNVAccess();
			orderGuidePeopleSoftOasisAccess();
		}
		else if(jobTitle.contains("1100")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideTravelLaptop();
			orderGuideNewExtension();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftHRAccess();
			orderGuidePeopleSoftNVAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
		}
		else if(jobTitle.contains("117")) {
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideTravelLaptop();
			orderGuideNewExtension();
			orderGuideOnBaseAccess();
			orderGuidePeopleSoftFSAccess();
			orderGuidePeopleSoftOasisAccess();
			orderGuideTimeAndExpense();
		}
		else
		{
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideUserAccount();
			orderGuidePrinterAccess();
			orderGuideNewExtension();
		}
	}
	
	/**
	 *verify the Onboard Employee Summary options tab- Order guide Details Validation specific AEROTEK Desktop no approval
	 * 
	 * @param jobTitle
	 * 				drop down box Job Code
	 * @return None
	 */
	public void orderGuideDetailsAPAC() {
			TestReporter.logStep("Verify Order Guide Details Section");
			orderGuideDetailsVisible();
			orderGuideSailPointUserAccount();
	}
	
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Visibility
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideDetailsVisible() {
		
		wbeOrderGuideDetails.syncVisible(60);
		TestReporter.assertEquals(wbeOrderGuideDetails.getText(), "Order Guide Details", "Order guide details validated:"+wbeOrderGuideDetails.getText());
		TestReporter.logStep("Order Guide Details page tab displayed");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide user account Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideUserAccount() {
		
		wbeOrderUserAccount.syncVisible(10);
		TestReporter.assertEquals(wbeOrderUserAccount.getText(), "User Account", "User account  details validated:"+wbeOrderUserAccount.getText());
		TestReporter.assertEquals(wbeQuantityUserAccount.getText(), "---", "Qunatity of User account details validated:"+wbeQuantityUserAccount.getText());
		TestReporter.logStep("User Accounts Item validated");
	}
public void orderGuideSailPointUserAccountNA() {
		
		wbeOrderSailPointUserAccount.syncVisible(10);
		TestReporter.assertEquals(wbeOrderSailPointUserAccount.getText(), "SailPoint User Account", "SailPoint User Account  details validated:"+wbeOrderSailPointUserAccount.getText());
		TestReporter.assertEquals(wbeQuantitySailPointUserAccount.getText(), "---", "Qunatity of SailPoint User Account details validated:"+wbeQuantitySailPointUserAccount.getText());
		TestReporter.logStep("SailPoint User Account Item validated");
	}
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Disable AD Account validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideDisableADAccount() {
		
		wbeOrderDisableADAccount.syncVisible(10);
		TestReporter.assertEquals(wbeOrderDisableADAccount.getText(), "Disable AD account", "Disable AD account details validated:"+wbeOrderDisableADAccount.getText());
		TestReporter.assertEquals(wbeQuantityDisableADAccount .getText(), "---", "Qunatity of Disable AD account details validated:"+wbeQuantityDisableADAccount .getText());
		TestReporter.logStep("Disable AD Account Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide building access Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideBuildingAccess() {
		
		wbeOrderBuildingAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderBuildingAccess.getText(), "Building access", "Building Access  details validated:"+wbeOrderBuildingAccess.getText());
		TestReporter.assertEquals(wbeQuantityBuildingAccess.getText(), "---", "Qunatity of Building Access details validated:"+wbeQuantityBuildingAccess.getText());
		TestReporter.logStep("Building Access Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide preferred Name Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuidePreferredName() {
		
		wbeOrderPreferredName.syncVisible(10);
		TestReporter.assertEquals(wbeOrderPreferredName.getText(), "Preferred Display Name", "Preferred Name  details validated:"+wbeOrderPreferredName.getText());
		TestReporter.assertEquals(wbeQuantityPreferredName.getText(), "---", "Qunatity of Preferred Name details validated:"+wbeQuantityPreferredName.getText());
		TestReporter.logStep("Preferred Name Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Default Email Domain Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideDefaultEmailDomain() {
		
		wbeOrderDefaultEmailDomain.syncVisible(10);
		TestReporter.assertEquals(wbeOrderDefaultEmailDomain.getText(), "Default Email Domain", "Default Email Domain  details validated:"+wbeOrderDefaultEmailDomain.getText());
		TestReporter.assertEquals(wbeQuantityDefaultEmailDomain.getText(), "---", "Qunatity of Default Email Domain  details validated:"+wbeQuantityDefaultEmailDomain.getText());
		TestReporter.logStep("Default Email Domain  Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Additional Items Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideAdditionalItems() {
		
		wbeOrderAdditionalItems.syncVisible(10);
		TestReporter.assertEquals(wbeOrderAdditionalItems.getText(), "Additional Items", "Additional Items details validated:"+wbeOrderAdditionalItems.getText());
		TestReporter.assertEquals(wbeQuantityAdditionalItems.getText(), "---", "Qunatity of Additional Itemsdetails validated:"+wbeQuantityAdditionalItems.getText());
		TestReporter.logStep("Additional Items Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide printer access Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuidePrinterAccess() {
		
		wbeOrderPrinterAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderPrinterAccess.getText(), "Printer", "Printer Access  details validated:"+wbeOrderPrinterAccess.getText());
		TestReporter.assertEquals(wbeQuantityPrinterAccess.getText(), "---", "Qunatity of Printer Access details validated:"+wbeQuantityPrinterAccess.getText());
		TestReporter.logStep("Printer Access Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide standard desktop Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideStandardDesktop() {
		
		wbeOrderStandardDesktop.syncVisible(10);
		TestReporter.assertEquals(wbeOrderStandardDesktop.getText(), "Standard Desktop", "Standard Desktop details validated:"+wbeOrderStandardDesktop.getText());
		TestReporter.assertEquals(wbeQuantityStandardDesktop .getText(), "---", "Qunatity of Standard Desktop  details validated:"+wbeQuantityStandardDesktop .getText());
		TestReporter.logStep("Standard Desktop  Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide standard desktop Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideStandardDesktopNAMSU() {
		
		wbeOrderStandardDesktop.syncVisible(10);
		TestReporter.assertEquals(wbeOrderStandardDesktopNAMSU.getText(), "MarketSource Standard Desktop", "Standard Desktop details validated:"+wbeOrderStandardDesktopNAMSU.getText());
		TestReporter.assertEquals(wbeQuantityStandardDesktopNAMSU .getText(), "---", "Qunatity of Standard Desktop  details validated:"+wbeQuantityStandardDesktopNAMSU .getText());
		TestReporter.logStep("Standard Desktop  Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide TEK BOA Desktop Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideTEKDesktop() {
		
		wbeOrderTEKDesktop.syncVisible(10);
		TestReporter.assertEquals(wbeOrderTEKDesktop.getText(), "TEK BOA Desktop", "Standard Desktop details validated:"+wbeOrderTEKDesktop.getText());
		TestReporter.assertEquals(wbeQuantityTEKDesktop .getText(), "---", "Qunatity of Standard Desktop  details validated:"+wbeQuantityTEKDesktop .getText());
		TestReporter.logStep("TEK Desktop  Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide standard laptop validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideStandardLaptop() {
		
		wbeOrderStandardLaptop.syncVisible(10);
		TestReporter.assertEquals(wbeOrderStandardLaptop.getText(), "Standard Laptop", "Standard Laptop details validated:"+wbeOrderStandardLaptop.getText());
		TestReporter.assertEquals(wbeQuantityStandardLaptop .getText(), "---", "Qunatity of Standard Laptop details validated:"+wbeQuantityStandardLaptop .getText());
		TestReporter.logStep("Standard Laptop  Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide standard laptop validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideStandardLaptopNAMSU() {
		
		wbeOrderStandardLaptop.syncVisible(10);
		TestReporter.assertEquals(wbeOrderStandardLaptopNAMSU.getText(), "MarketSource Standard Laptop", "Standard Laptop details validated:"+wbeOrderStandardLaptopNAMSU.getText());
		TestReporter.assertEquals(wbeQuantityStandardLaptopNAMSU .getText(), "---", "Qunatity of Standard Laptop details validated:"+wbeQuantityStandardLaptopNAMSU .getText());
		TestReporter.logStep("Standard Laptop  Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Travel laptop validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideTravelLaptop() {
		
		wbeOrderTravelLaptop.syncVisible(10);
		TestReporter.assertEquals(wbeOrderTravelLaptop.getText(), "Travel Laptop", "Travel Laptop details validated:"+wbeOrderTravelLaptop.getText());
		TestReporter.assertEquals(wbeQuantityTravelLaptop .getText(), "---", "Qunatity of Travel Laptop details validated:"+wbeQuantityTravelLaptop .getText());
		TestReporter.logStep("Travel Laptop  Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Travel laptop validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideTravelLaptopNAMSU() {
		
		wbeOrderTravelLaptop.syncVisible(10);
		TestReporter.assertEquals(wbeOrderTravelLaptopNAMSU.getText(), "MarketSource Travel Laptop", "Travel Laptop details validated:"+wbeOrderTravelLaptopNAMSU.getText());
		TestReporter.assertEquals(wbeQuantityTravelLaptopNAMSU.getText(), "---", "Qunatity of Travel Laptop details validated:"+wbeQuantityTravelLaptopNAMSU.getText());
		TestReporter.logStep("Travel Laptop  Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide non standard computer Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideNonStandardComputer() {
		
		wbeOrderNonStandardComputer.syncVisible(10);
		TestReporter.assertEquals(wbeOrderNonStandardComputer.getText(), "Non-Standard Computer", "Non-Standard Computer details validated:"+wbeOrderNonStandardComputer.getText());
		TestReporter.assertEquals(wbeQuantityNonStandardComputer.getText(), "---", "Qunatity of Non-Standard Computer  details validated:"+wbeQuantityNonStandardComputer .getText());
		TestReporter.logStep("Non-Standard Computer  Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Monitor validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideMonitor() {
		
		wbeOrderMonitor.syncVisible(10);
		TestReporter.assertEquals(wbeOrderMonitor.getText(), "External Monitor", "Monitor details validated:"+wbeOrderMonitor.getText());
		TestReporter.assertEquals(wbeQuantityMonitor.getText(), "---", "Qunatity of Monitor details validated:"+wbeQuantityMonitor .getText());
		TestReporter.logStep(" Monitor Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide New Phone validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideDeskPhone() {
		
		wbeOrderDeskPhone.syncVisible(10);
		TestReporter.assertEquals(wbeOrderDeskPhone.getText(), "Desk Phone", "Desk Phone details validated:"+wbeOrderDeskPhone.getText());
		TestReporter.assertEquals(wbeQuantityDeskPhone .getText(), "---", "Qunatity of Desk Phone details validated:"+wbeQuantityDeskPhone .getText());
		TestReporter.logStep("New Phone Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide standard Wired Headset validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideWiredHeadSet() {
		
		wbeOrderWiredHeadSet.syncVisible(10);
		TestReporter.assertEquals(wbeOrderWiredHeadSet.getText(), "Wired Headset", "Wired Headset details validated:"+wbeOrderWiredHeadSet.getText());
		TestReporter.assertEquals(wbeQuantityWiredHeadSet .getText(), "---", "Qunatity of Wired Headset details validated:"+wbeQuantityWiredHeadSet.getText());
		TestReporter.logStep("Wired Headset Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide standard Wireless Headset validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideWirelessHeadSet() {
		
		wbeOrderWirelessHeadSet.syncVisible(10);
		TestReporter.assertEquals(wbeOrderWirelessHeadSet.getText(), "Wireless Headset", "Wireless Headset details validated:"+wbeOrderWirelessHeadSet.getText());
		TestReporter.assertEquals(wbeQuantityWirelessHeadSet .getText(), "---", "Qunatity of Wireless Headset details validated:"+wbeQuantityWirelessHeadSet.getText());
		TestReporter.logStep("Wireless Headset Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide standard Wired Headset validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideUSBHeadSet() {

		wbeOrderUSBHeadSet.syncVisible(10);
		TestReporter.assertEquals(wbeOrderUSBHeadSet.getText(), "USB Headset", "USB Headset details validated:"+wbeOrderUSBHeadSet.getText());
		TestReporter.assertEquals(wbeQuantityUSBHeadSet .getText(), "---", "Qunatity of USB Headset details validated:"+wbeQuantityUSBHeadSet.getText());
		TestReporter.logStep("USB Headset Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide New Extension Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideNewExtension() {
		
		wbeOrderNewExtension.syncVisible(10);
		TestReporter.assertEquals(wbeOrderNewExtension.getText(), "New Extension", "New Extension  details validated:"+wbeOrderNewExtension.getText());
		TestReporter.assertEquals(wbeQuantityNewExtension.getText(), "---", "Qunatity of New Extension details validated:"+wbeQuantityNewExtension.getText());
		TestReporter.logStep("New Extension Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Reassign Extension Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideReassignExtension() {
		
		wbeOrderReassignExtension.syncVisible(10);
		TestReporter.assertEquals(wbeOrderReassignExtension.getText(), "Reassign Extension", "Reassign Extension  details validated:"+wbeOrderReassignExtension.getText());
		TestReporter.assertEquals(wbeQuantityReassignExtension.getText(), "---", "Qunatity of Reassign Extension details validated:"+wbeQuantityReassignExtension.getText());
		TestReporter.logStep("Reassign Extension Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide MobilePhone Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideMobilePhone() {
		
		wbeOrderMobilePhone.syncVisible(10);
		TestReporter.assertEquals(wbeOrderMobilePhone.getText(), "Mobile Phone", "Mobile Phone details validated:"+wbeOrderMobilePhone.getText());
		TestReporter.assertEquals(wbeQuantityMobilePhone.getText(), "---", "Qunatity of Mobile Phone details validated:"+wbeQuantityMobilePhone.getText());
		TestReporter.logStep("Mobile Phone Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide EchoSign access Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideEchoSignAccess() {
		
		wbeOrderEchoSignAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderEchoSignAccess.getText(), "EchoSign", "EchoSign Access details validated:"+wbeOrderEchoSignAccess.getText());
		TestReporter.assertEquals(wbeQuantityEchoSignAccess.getText(), "---", "Qunatity of EchoSign Access details validated:"+wbeQuantityEchoSignAccess.getText());
		TestReporter.logStep("EchoSign Access Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide maxHire Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideMaxHireAccess() {
		
		wbeOrderMaxHireAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderMaxHireAccess.getText(), "MaxHire", "MaxHire Access  details validated:"+wbeOrderMaxHireAccess.getText());
		TestReporter.assertEquals(wbeQuantityMaxHireAccess.getText(), "---", "Qunatity of MaxHire Access details validated:"+wbeQuantityMaxHireAccess.getText());
		TestReporter.logStep("MaxHire Access Item validated");
	}
	
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Onbase Access Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideOnBaseAccess() {
		
		wbeOrderOnBaseAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderOnBaseAccess.getText(), "OnBase", "OnBase Access  details validated:"+wbeOrderOnBaseAccess.getText());
		TestReporter.assertEquals(wbeQuantityOnBaseAccess.getText(), "---", "Qunatity of OnBase Access details validated:"+wbeQuantityOnBaseAccess.getText());
		TestReporter.logStep("OnBase Access Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide PeopleSoftFS Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuidePeopleSoftFSAccess() {
		
		wbeOrderPeopleSoftFSAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderPeopleSoftFSAccess.getText(), "PeopleSoft FS", "PeopleSoft FS Access  details validated:"+wbeOrderPeopleSoftFSAccess.getText());
		TestReporter.assertEquals(wbeQuantityPeopleSoftFSAccess.getText(), "---", "Qunatity of PeopleSoft FS Access details validated:"+wbeQuantityPeopleSoftFSAccess.getText());
		TestReporter.logStep("PeopleSoft FS Access Item validated");
	}
		
	/**
	 * verify the Onboard Employee Summary options tab- Order guide PeopleSoftHR Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuidePeopleSoftHRAccess() {
		
		wbeOrderPeopleSoftHRAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderPeopleSoftHRAccess.getText(), "PeopleSoft HR", "PeopleSoft HR Access  details validated:"+wbeOrderPeopleSoftHRAccess.getText());
		TestReporter.assertEquals(wbeQuantityPeopleSoftHRAccess.getText(), "---", "Qunatity of PeopleSoft HR Access details validated:"+wbeQuantityPeopleSoftHRAccess.getText());
		TestReporter.logStep("PeopleSoft HR Access Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide PeopleSoft nVision Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuidePeopleSoftNVAccess() {
		
		wbeOrderPeopleSoftNVAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderPeopleSoftNVAccess.getText(), "PeopleSoft nVision", "PeopleSoft nVision Access details validated:"+wbeOrderPeopleSoftNVAccess.getText());
		TestReporter.assertEquals(wbeQuantityPeopleSoftNVAccess.getText(), "---", "Qunatity of PeopleSoft nVision Access details validated:"+wbeQuantityPeopleSoftNVAccess.getText());
		TestReporter.logStep("PeopleSoft nVision Access Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide PeopleSoft Oasis Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuidePeopleSoftOasisAccess() {
		
		wbeOrderPeopleSoftOAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderPeopleSoftOAccess.getText(), "PeopleSoft Oasis", "PeopleSoft Oasis Access  details validated:"+wbeOrderPeopleSoftOAccess.getText());
		TestReporter.assertEquals(wbeQuantityPeopleSoftOAccess.getText(), "---", "Qunatity of PeopleSoft Oasis Access details validated:"+wbeQuantityPeopleSoftOAccess.getText());
		TestReporter.logStep("PeopleSoft Oasis Access Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide SmartERP Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideOnboardingAutomationAccess() {
		
		wbeOrderOnboardingAutomationAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderOnboardingAutomationAccess.getText(), "Onboarding Automation", "Onboarding Automation  Access  details validated:"+wbeOrderOnboardingAutomationAccess.getText());
		TestReporter.assertEquals(wbeQuantityOnboardingAutomationAccess.getText(), "---", "Qunatity of Onboarding Automation  Access details validated:"+wbeQuantityOnboardingAutomationAccess.getText());
		TestReporter.logStep("Onboarding Automation Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Time and Expense Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideTimeAndExpense() {
		
		wbeOrderTimeAndExpenseAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderTimeAndExpenseAccess.getText(), "Time and Expense", "Time and Expense Access  details validated:"+wbeOrderTimeAndExpenseAccess.getText());
		TestReporter.assertEquals(wbeQuantityTimeAndExpenseAccess.getText(), "---", "Qunatity of Time and Expense Access details validated:"+wbeQuantityTimeAndExpenseAccess.getText());
		TestReporter.logStep("Time and Expense Access Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Central Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideTimeCentral() {
		
		wbeOrderTimeCentralAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderTimeCentralAccess.getText(), "Time Central", "Time Central Access  details validated:"+wbeOrderTimeCentralAccess.getText());
		TestReporter.assertEquals(wbeQuantityTimeCentralAccess.getText(), "---", "Qunatity of Time Central Access details validated:"+wbeQuantityTimeCentralAccess.getText());
		TestReporter.logStep("Time Central Access Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide VDI Access Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideVDIAccess() {
		
		wbeOrderVDIAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderVDIAccess.getText(), "VDI", "VDI Access  details validated:"+wbeOrderVDIAccess.getText());
		TestReporter.assertEquals(wbeQuantityVDIAccess.getText(), "---", "Qunatity of VDI Access details validated:"+wbeQuantityVDIAccess.getText());
		TestReporter.logStep("VDI Access Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide WSSRD Access Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideWSSRDAccess() {
		
		wbeOrderWSSRDAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderWSSRDAccess.getText(), "WSSRD", "WSSRD details validated:"+wbeOrderWSSRDAccess.getText());
		TestReporter.assertEquals(wbeQuantityWSSRDAccess.getText(), "---", "Qunatity of WSSRD details validated:"+wbeQuantityWSSRDAccess.getText());
		TestReporter.logStep("WSSRD Item validated");
	}
	

	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide S Drive Access Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideSDriveAccess() {
		
		wbeOrderSDriveAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderSDriveAccess.getText(), "S Drive", "SDrive Access  details validated:"+wbeOrderSDriveAccess.getText());
		TestReporter.assertEquals(wbeQuantitySDriveAccess.getText(), "---", "Qunatity of SDrive Access details validated:"+wbeQuantitySDriveAccess.getText());
		TestReporter.logStep("SDrive Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Salesforce access Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideSalesForceAccess() {
		
		wbeOrderSalesforceAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderSalesforceAccess.getText(), "Salesforce", "Salesforce details validated:"+wbeOrderSalesforceAccess.getText());
		TestReporter.assertEquals(wbeQuantitySalesforceAccess.getText(), "---", "Qunatity of Salesforce details validated:"+wbeQuantitySalesforceAccess.getText());
		TestReporter.logStep("Salesforce Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Web Focus BI Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideWebFocusBI() {
		
		wbeOrderWebFocusBI.syncVisible(10);
		TestReporter.assertEquals(wbeOrderWebFocusBI.getText(), "Web Focus BI", "Web Focus BI  details validated:"+wbeOrderWebFocusBI.getText());
		TestReporter.assertEquals(wbeQuantityWebFocusBI.getText(), "---", "Qunatity of Web Focus BI details validated:"+wbeQuantityWebFocusBI.getText());
		TestReporter.logStep("Web Focus BI Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Global Delivery Portal Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideGlobalDeliveryPortal() {
		TestReporter.logStep("Global Delivery Portal Item validated");
		wbeOrderGDP.syncVisible(10);
		TestReporter.assertEquals(wbeOrderGDP.getText(), "Global Delivery Portal", "Global Delivery PortalI  details validated:"+wbeOrderGDP.getText());
		TestReporter.assertEquals(wbeQuantityGDP.getText(), "---", "Qunatity of Global Delivery Portal details validated:"+wbeQuantityGDP.getText());
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Hyperion Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideHyperionAccess() {
		
		wbeOrderHyperion.syncVisible(10);
		TestReporter.assertEquals(wbeOrderHyperion.getText(), "Hyperion", "Hyperion  details validated:"+wbeOrderHyperion.getText());
		TestReporter.assertEquals(wbeQuantityHyperion.getText(), "---", "Qunatity of Hyperion details validated:"+wbeQuantityHyperion.getText());
		TestReporter.logStep("Hyperion Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Hyperion Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideContractLogixAccess() {
		
		wbeOrderContractLogixAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderContractLogixAccess.getText(), "Contract Logix", "Contract Logix details validated:"+wbeOrderContractLogixAccess.getText());
		TestReporter.assertEquals(wbeQuantityContractLogixAccess.getText(), "---", "Qunatity of Contract Logixdetails validated:"+wbeQuantityContractLogixAccess.getText());
		TestReporter.logStep("Contract Logix Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide Candidate Tracker Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideCandidateTrackerAccess() {
		
		wbeOrderCandidateTrackerAccess.syncVisible(10);
		TestReporter.assertEquals(wbeOrderCandidateTrackerAccess.getText(), "Candidate Tracker", "Candidate Tracker details validated:"+wbeOrderCandidateTrackerAccess.getText());
		TestReporter.assertEquals(wbeQuantityCandidateTrackerAccess.getText(), "---", "Qunatity of Candidate Tracker details validated:"+wbeQuantityCandidateTrackerAccess.getText());
		TestReporter.logStep("Candidate Tracker Item validated");
	}
	
	/**
	 * verify the Onboard Employee Summary options tab- Order guide user account Validation
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderGuideSailPointUserAccount() {
		
		wbeOrderSailPointUserAccount.syncVisible(10);
		TestReporter.assertEquals(wbeOrderSailPointUserAccount.getText(), "SailPoint User Account", "SailPoint User Account  details validated:"+wbeOrderSailPointUserAccount.getText());
		TestReporter.assertEquals(wbeQuantitySailPointUserAccount.getText(), "---", "Qunatity of SailPoint User Account details validated:"+wbeQuantitySailPointUserAccount.getText());
		TestReporter.logStep("SailPoint User Account Item validated");
	}
		
	/**
	 * verify the Onboard Employee -Order now
	 * 
	 * @param None.
	 * @return None
	 */
	public void orderNow() {
		
		TestReporter.logStep("Click OrderNow");
		btnOrderNow.scrollToAndCickOnSync();	
	}
}
