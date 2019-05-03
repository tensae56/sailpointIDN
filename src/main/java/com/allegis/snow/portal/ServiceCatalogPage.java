package com.allegis.snow.portal;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import com.allegis.snow.base.BasePage;
import com.framework.core.interfaces.Button;
import com.framework.core.interfaces.Element;
import com.framework.core.interfaces.Label;
import com.framework.core.interfaces.Link;
import com.framework.core.interfaces.impl.internal.ElementFactory;
import com.framework.utils.AllegisDriver;
import com.framework.utils.TestReporter;
import com.framework.utils.WaitAllegis;

/**
 * 
 * @author kpremkumar
 * @version 2.0
 * @since 10-19-2018
 */
public class ServiceCatalogPage extends PortalRequestDetailsPage {

	/** String Array for validating service catalog Contents for NA **/
	private static String[] clientAndMobilityOptionsNA = { "Windows 10 PowerBroker Access Request" };
	private static String[] enterPriseApplicatinsoptionsNA = { "Additional RWS Access", "Contract Logix",
			"Email Forwarding", "Hyperion", "OnBase", "Onboarding Automation", "PeopleSoft FS ", "PeopleSoft HR ",
			"PeopleSoft nVision", "PeopleSoft Oasis", "Planview", "Provision New Non-Production VDI",
			"Provision New Production VDI", "RWS New Account ", "Salesforce", "Time and Expense ", "Web Focus BI",
			"Add WSSRD Access", "Disable WSSRD Access", "New WSSRD Account", "Remove WSSRD Access",
			"WSSRD Password Reset" };
	private static String[] WSSRDoptionsNA = { "Add WSSRD Access", "Disable WSSRD Access", "New WSSRD Account",
			"Remove WSSRD Access", "WSSRD Password Reset" };
	private static String[] generalRequestOptionsNA = { "General Request" };
	private static String[] hardwareOptionsNA = { "Cisco Warranty Repair", "Return Equipment (RMA)" };
	private static String[] identityAndAccessMgmtOptionsNA = { "Manage My DLIST", "Password Reset" };
	private static String[] infoSecServicesOptionsNA = { "Privacy Incident", "Security Incident" };
	private static String[] internetAndNetworkServicesNA = { "Network Drive/Drive Mapping", "Purchase a Domain" };
	private static String[] onBoardingOffboardingOptionsNA = { "Onboard Employee", "Principal Consultant Onboarding",
			"Vanity Email" };
	private static String[] requestForWorkNA = { "Request for Work" };
	private static String[] roleDelegationOptionsNA = {};
	private static String[] softwareOptionsNA = { "Order Software", "Windows 10 Upgrade" };
	private static String[] telephonyAndConfOptionsNA = { "Call Pickup Group", "Conference Display",
			"Extension Forward", "Video Conferencing Equipment", "Video Conferencing Software (AMER)",
			"Voicemail Password Reset", "Web Conferencing" };
	private static String[] technologyFeedbackOptionsNA = { "Request for Work" };

	/** String Array for validating service catalog Contents for EMEA **/
	private static String[] clientAndMobilityOptionsEMEA = { "Windows 10 PowerBroker Access Request" };
	private static String[] employeeServicesOptionsEMEA = { "Job Status Change", "Life Change",
			"Lloyd's Banking Group Onboarding (New Hire) & Transfer IN Request" };
	private static String[] enterpriseApplicationsOptionsEMEA = { "Additional RWS Access", "OnBase", "PeopleSoft FS ",
			"PeopleSoft HR ", "PeopleSoft Oasis", "Planview", "Provision New Non-Production VDI",
			"Provision New Production VDI", "Salesforce", "Time and Expense " };
	private static String[] generalRequestOptionsEMEA = { "Desk Relocation Assistance Request",
			"EMEA General Request" };
	private static String[] hardwareOptionsEMEA = { "Cisco IP Phone", "Docking Station", "External LCD Monitor",
			"Lenovo Desktop", "MiFi", "Return Equipment (RMA) for EMEA", "Standard Mouse", "Standard Wired Keyboard",
			"Thinkpad Laptop", "Travel Laptop", "USB Headset", "USB Webcam", "Wired Headset", "Mobile Phone" };
	private static String[] identityAndAccessMgmtOptionsEMEA = { "Application Access", "Email Distribution Group",
			"Network Folder Access", "Shared Mailbox" };
	private static String[] infoSecServicesOptionsEMEA = { "Privacy Incident", "Security Incident" };
	private static String[] internetAndNetworkServicesEMEA = { "Purchase a Domain" };
	private static String[] onBoardingOffboardingOptionsEMEA = { "Onboard Employee" };
	private static String[] requestForWorkEMEA = { "Request for Work" };
	private static String[] roleDelegationOptionsEMEA = {};
	private static String[] softwareOptionsEMEA = { "Software" };
	private static String[] telephonyAndConfOptionsEMEA = { "International Data Roaming", "Mobile Phone Accessories",
			"New Extension", "OAK Reporting", "Video Conferencing", "Voicemail Password Reset", "Voicemail Setup",
			"Web Conferencing EMEA", "Mobile Phone" };
	private static String[] iTServicesTREASURY = { "Treasury Financial System Request" };
	private static String[] onBoardingOffboardingOptionsHELPDESK = { "Offboard Employee" };
	private static String[] softwareOptionsITIL = { "Windows 10 Upgrade" };

	/** Page Elements **/
	@FindBy(xpath = "//*[contains(text(),'Request Something')]")
	private Element wbeRequestSomething;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Employee Services')]")
	private Element wbeEmployeeServices;
	@FindBy(xpath = "//h4[contains(text(),'General Request')]")
	private Element wbeGeneralRequest;
	@FindBy(xpath = "//h4[@class='m-t-none m-b-xs ng-binding'][text()='General Request']")
	private Element wbeGeneralRequestLink;
	@FindBy(xpath = "//h1[contains(text(),'General Request')]")
	private Label lblGeneralRequest;
	@FindBy(xpath = "//h4[contains(text(),'Search results')]")
	private Element wbeSearchResult;
	@FindBy(xpath = "//h1[contains(text(),'Popular Items')]")
	private Label lblPopularItems;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'General Request')]")
	private Element wbeGeneralrequest;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Hardware')]")
	private Element wbeHardware;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Identity and Access Management')]")
	private Element wbeIdentityManagement;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Information Security Services')]")
	private Element wbeInfoServices;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Internet and Network Services')]")
	private Element wbeInternetServices;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Onboarding/Offboarding')]")
	private Element wbeOnboardingOffboarding;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Software')]")
	private Element wbeSoftware;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Telephony and Conferencing')]")
	private Element wbeTelephonyConferencing;
	@FindBy(xpath = "//span[contains(text(),'Enterprise Applications')]")
	private Element wbeEnterpriseApplications;
	@FindBy(xpath = "//div[@class='text-muted item-short-desc break-word ng-binding'][contains(text(),'Onboard a new employee')]")
	private Element wbeOnboarding;
	@FindBy(xpath = "//div[@class='text-muted item-short-desc break-word ng-binding'][contains(text(),'New Hire')]")
	private Element wbeNewHire;
	@FindBy(xpath = "//div[@class='text-muted item-short-desc break-word ng-binding'][contains(text(),'Onboard a new or returning employee')]")
	private Element wbeOnboardingEmployee;
	@FindBy(xpath = "//h2[@title='Onboard Employee (APAC)']/following-sibling::div[contains(text(),'Onboard a new or returning employee')]")
	private Element wbeOnboardingEmployeeAPAC;
	@FindBy(xpath = "//h2[contains(text(),'Offboard Employee')]")
	private Element wbeOffboardEmployee;
	@FindBy(xpath = "//div[@class='text-muted item-short-desc break-word ng-binding'][contains(text(),'De-provision employee access and return equipment')]")
	private Element wbeTerminateEmployee;
	@FindBy(xpath = "//a[@class='block text-overflow-ellipsis category ng-binding ng-scope'][contains(text(),'Product Enhancement')]")
	private Element wbeProductEnhancement;
	@FindBy(xpath = "//h1[contains(text(), 'Information Security Services')]")
	private Element wbeInformationSecurityServicesPage;
	@FindBy(xpath = "//h2[@title='Security Incident']")
	private Element wbeSecurityIncidentLink;
	@FindBy(xpath = "//h1[.='Security Incident']")
	private Element wbeSecurityIncidentPage;
	@FindBy(xpath = "//div[contains(text(), 'Report a Security Incident')]")
	private Element wbeReportASecurityIncident;
	@FindBy(xpath = "//h1[contains(text(), 'Employee Services')]")
	private Element wbeEmployeeServicesPage;
	@FindBy(xpath = "//h2[@title='Job Status Change']")
	private Element wbeJobStatusChangeLink;
	@FindBy(xpath = "//h1[.='Job Status Change']")
	private Element wbeJobStatusChangePage;
	@FindBy(xpath = "//div[contains(text(), 'Employees can request changes to their current employment program')]")
	private Element wbeEmployeeServicesChangeRequest;
	@FindBy(xpath = "//*[contains(text(),'Browse by Categories')]")
	private Link lnBrowsebyCategories;
	@FindBy(xpath = "//span[contains(text(),'Client and Mobility')]")
	private Element wbeClientAndMobility;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][@title='WSSRD']")
	private Element wbeWSSRD;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][@title='Role Delegation']")
	private Element wbeRoleDelegation;
	@FindBy(xpath = "//span[contains(text(),'Request for Work')]")
	private Element wbeTechnologyFeedback;
	@FindBy(xpath = "//div[@class='panel-footer']/a[@class='pull-left text-muted ng-scope']")
	private Element wbeViewDetails;
	@FindBy(xpath = "//button[@class='m-t-xs btn btn-default btn-loadmore']")
	private Button btnShowMore;
	@FindBy(xpath = "//i[@aria-label='expand category Enterprise Applications']")
	private Element wbeExpandcategoryEnterpriseApplications;
	@FindBy(xpath = "//span[@title='Request for Work']")
	private Element wbeRequestForWork;
	@FindBy(xpath = "//span[@title='IT Services']")
	private Element wbeITServices;

	/** Constructor **/
	public ServiceCatalogPage(AllegisDriver driver) {
		super(driver);
		ElementFactory.initElements(driver, this);
	}

	/**
	 * verify service catalog page.
	 * 
	 * @param None.
	 * @return None
	 */
	public void serviceCatalog(String environment) {
		wbeRequestSomething.click();
		WaitAllegis.hardWait(MAX_TIMEOUT);
		lnBrowsebyCategories.syncInFrame(30);
		lnBrowsebyCategories.click();
		lblPopularItems.syncVisible(10);
		TestReporter.assertTrue(lblPopularItems.existsInFrame(), "Popular Items label displayed");
		TestReporter.logStep("Verify Categories list items");
		TestReporter.assertTrue(wbeGeneralrequest.existsInFrame(), "List item: General Request is displayed");
		TestReporter.assertTrue(wbeHardware.existsInFrame(), "List item: Hardware is displayed");
		TestReporter.assertTrue(wbeIdentityManagement.existsInFrame(), "List item: Identity Management is displayed");
		TestReporter.assertTrue(wbeInfoServices.existsInFrame(),
				"List item: Information Security Services is displayed");
		TestReporter.assertTrue(wbeInternetServices.existsInFrame(),
				"List item: Internet and Network Services is displayed");
		TestReporter.assertTrue(wbeOnboardingOffboarding.existsInFrame(),
				"List item: Onboarding/Offboarding is displayed");
		TestReporter.assertTrue(wbeSoftware.existsInFrame(), "List item: Software is displayed");
		TestReporter.assertTrue(wbeTelephonyConferencing.existsInFrame(),
				"List item: Telephony and Conferencing is displayed");
		TestReporter.assertTrue(wbeEnterpriseApplications.existsInFrame(),
				"List item: Enterprise Applications is displayed");
	}

	/**
	 * click onboarding/Offboarding option and verify Categories list items.
	 * 
	 * @param None.
	 * @return None
	 */
	public void onboardingOffboarding() {
		TestReporter.logStep("Verify Onboarding/Offboarding and click");
		wbeOnboardingOffboarding.click();
		wbeNewHire.syncVisible(10);
		TestReporter.assertTrue(wbeNewHire.existsInFrame(), "New Hire Request - New Hire option is displayed");
	}

	/**
	 * click onboarding/Offboarding option and verify Categories list item OnBoard
	 * Employee.
	 * 
	 * @param None.
	 * @return None
	 */
	public void onBoardingoffBoardingOnBoard() {
		TestReporter.logStep("Verify Onboarding/Offboarding and click");
		wbeOnboardingOffboarding.click();
		wbeOnboardingEmployee.syncVisible(10);
		TestReporter.assertTrue(wbeOnboardingEmployee.existsInFrame(),
				"Onboard Employee - Onboard a new or returning employee is displayed");
	}

	/**
	 * click onboarding/Offboarding option and verify offboard Employee description.
	 * 
	 * @param None.
	 * @return None
	 */
	public void offBoardingEmployee() {
		TestReporter.logStep("Verify offboard employee field and description");
		wbeOnboardingOffboarding.click();
		WaitAllegis.hardWait(MAX_TIMEOUT);
		wbeOffboardEmployee.syncInFrame(30);
		TestReporter.assertTrue(wbeOffboardEmployee.existsInFrame(), "Offboard Employee option is displayed");
		TestReporter.assertTrue(wbeTerminateEmployee.existsInFrame(), "Terminate an Employee description is displayed");
		wbeOffboardEmployee.clickOnSync();
	}

	/**
	 * verify the Onboard Employee Option
	 * 
	 * @param None.
	 * @return None
	 */
	public void onBoard() {

		TestReporter.logStep("Verify OnBoard Employee");
		TestReporter.assertTrue(wbeOnboardingEmployee.existsInFrame(), "OnBoard Employee option is displayed");
		wbeOnboardingEmployee.click();
	}

	/**
	 * verify the Onboard Employee Option for APAC
	 * 
	 * @param None.
	 * @return None
	 */
	public void onBoardAPAC() {

		TestReporter.logStep("Verify OnBoard Employee APAC");
		TestReporter.assertTrue(wbeOnboardingEmployeeAPAC.existsInFrame(),
				"OnBoard Employee option is displayed for APAC");
		wbeOnboardingEmployeeAPAC.click();
	}

	/**
	 * Click Information Security Services option from categories section
	 * 
	 * @param None.
	 * @return None
	 */
	public void clickInformationSecurityServices() {
		wbeInfoServices.syncInFrame();
		wbeInfoServices.clickOnSync();
		WaitAllegis.hardWait(MIN_TIMEOUT);
		wbeInformationSecurityServicesPage.syncVisible(20);
		TestReporter.assertTrue(wbeInformationSecurityServicesPage.existsInFrame(),
				"Information Security Services page was displayed");
	}

	/**
	 * Click Security Incident
	 * 
	 * @param None.
	 * @return None
	 */
	public void clickSecurityIncident() {
		wbeSecurityIncidentLink.syncVisible(2);
		wbeSecurityIncidentLink.clickOnSync();
		WaitAllegis.hardWait(MAX_TIMEOUT);
		TestReporter.assertTrue(wbeSecurityIncidentPage.existsInFrame(), "Security Incident page was displayed");
		TestReporter.assertTrue(wbeReportASecurityIncident.existsInFrame(),
				"'Report a Security Incident' description text was displayed");
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in Client and Mobility category for NA
	 */
	public void clientAndMobilityValidationNA() {
		validateTotalItems(wbeClientAndMobility, "Client and Mobility", 1);
		validateItemContent(clientAndMobilityOptionsNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in enterprise Applications category for NA
	 */
	public void enterpriseApplicationsValidationNA() {
		validateTotalItems(wbeEnterpriseApplications, "Enterprise Applications", 22);
		validateItemContent(enterPriseApplicatinsoptionsNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in WSSRD category for NA
	 */
	public void wSSRDValidationNA() {
		if (wbeExpandcategoryEnterpriseApplications.existsInFrame()) {
			wbeExpandcategoryEnterpriseApplications.click();
		}
		WaitAllegis.hardWait(MIN_TIMEOUT);
		validateTotalItems(wbeWSSRD, "WSSRD", 5);
		validateItemContent(WSSRDoptionsNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in General Request category for NA
	 */
	public void generalRequestValidationNA() {
		validateTotalItems(wbeGeneralrequest, "General Request", 1);
		validateItemContent(generalRequestOptionsNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in hardware category for NA
	 */
	public void hardwareValidationNA() {
		validateTotalItems(wbeHardware, "Hardware", 2);
		validateItemContent(hardwareOptionsNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in identity and access management category for NA
	 */
	public void identityAndAccessMgmtNA() {
		validateTotalItems(wbeIdentityManagement, "Identity and Access Management", 2);
		validateItemContent(identityAndAccessMgmtOptionsNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in information security services category for both NA and EMEA
	 */
	public void infoSecurityServicesNA() {
		validateTotalItems(wbeInfoServices, "Information Security Services", 2);
		validateItemContent(infoSecServicesOptionsNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in Internet and network services category for both NA
	 */
	public void internetAndNetworkServicesNA() {
		validateTotalItems(wbeInternetServices, "Internet and Network Services", 2);
		validateItemContent(internetAndNetworkServicesNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in Onboard/Offboard category for NA
	 */
	public void onBoardOffBoardNA() {
		validateTotalItems(wbeOnboardingOffboarding, "Onboarding/Offboarding", 3);
		validateItemContent(onBoardingOffboardingOptionsNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in Request for Work category for NA
	 */
	public void requestForWorkNA() {
		validateTotalItems(wbeRequestForWork, "Request for Work", 1);
		validateItemContent(requestForWorkNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in role delegation category for NA
	 */
	public void roleDelegationNA() {
		validateTotalItems(wbeRoleDelegation, "Role Delegation", 0);
		validateItemContent(roleDelegationOptionsNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in software category for NA
	 */
	public void softwareNA() {
		validateTotalItems(wbeSoftware, "Software", 2);
		validateItemContent(softwareOptionsNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in telephony and conferencing category for NA
	 */
	public void technologyFeedbackRequestForWorkNA() {
		validateTotalItems(wbeTechnologyFeedback, "Request for Work", 1);
		validateItemContent(technologyFeedbackOptionsNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in telephony and conferencing category for NA
	 */
	public void telephonyAndConferencingNA() {
		validateTotalItems(wbeTelephonyConferencing, "Telephony and Conferencing", 7);
		validateItemContent(telephonyAndConfOptionsNA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in Client and Mobility category for NA
	 */
	public void clientAndMobilityValidationEMEA() {
		validateTotalItems(wbeClientAndMobility, "Client and Mobility", 1);
		validateItemContent(clientAndMobilityOptionsEMEA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in employee services category for EMEA
	 **/
	public void employeeServicesValidationEMEA() {
		validateTotalItems(wbeEmployeeServices, "Employee Services", 3);
		validateItemContent(employeeServicesOptionsEMEA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in enterprise applications category for EMEA
	 **/
	public void enterpriseApplicationsValidationEMEA() {
		validateTotalItems(wbeEnterpriseApplications, "Enterprise Applications", 10);
		validateItemContent(enterpriseApplicationsOptionsEMEA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in general request category for EMEA
	 **/
	public void generalRequestValidationEMEA() {
		validateTotalItems(wbeGeneralrequest, "General Request", 2);
		validateItemContent(generalRequestOptionsEMEA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in hardware category for EMEA
	 **/
	public void hardwareValidationEMEA() {
		validateTotalItems(wbeHardware, "Hardware", 14);
		validateItemContent(hardwareOptionsEMEA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in identity and access management category for EMEA
	 **/
	public void identityAndAccessMgmtEMEA() {
		validateTotalItems(wbeIdentityManagement, "Identity and Access Management", 4);
		validateItemContent(identityAndAccessMgmtOptionsEMEA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in information security services category for EMEA
	 */
	public void infoSecurityServicesEMEA() {
		validateTotalItems(wbeInfoServices, "Information Security Services", 2);
		validateItemContent(infoSecServicesOptionsEMEA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in Internet and network services category for EMEA
	 */
	public void internetAndNetworkServicesEMEA() {
		validateTotalItems(wbeInternetServices, "Internet and Network Services", 1);
		validateItemContent(internetAndNetworkServicesEMEA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in Onboard/Offboard category for EMEA
	 **/
	public void onBoardOffBoardEMEA() {
		validateTotalItems(wbeOnboardingOffboarding, "Onboarding/Offboarding", 1);
		validateItemContent(onBoardingOffboardingOptionsEMEA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in Request for Work category for EMEA
	 */
	public void requestForWorkEMEA() {
		validateTotalItems(wbeRequestForWork, "Request for Work", 1);
		validateItemContent(requestForWorkEMEA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in role delegation category for EMEA
	 */
	public void roleDelegationEMEA() {
		validateTotalItems(wbeRoleDelegation, "Role Delegation", 0);
		validateItemContent(roleDelegationOptionsEMEA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in software category for EMEA
	 **/
	public void softwareEMEA() {
		validateTotalItems(wbeSoftware, "Software", 1);
		validateItemContent(softwareOptionsEMEA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in telephony and conferencing category for EMEA
	 **/
	public void telephonyAndConferencingEMEA() {
		validateTotalItems(wbeTelephonyConferencing, "Telephony and Conferencing", 9);
		validateItemContent(telephonyAndConfOptionsEMEA);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in IT Services category for Treasury
	 **/
	public void ITServicesTREASURY() {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		TestReporter.logStep("verify category and label for : ITServices");
		TestReporter.assertTrue(wbeITServices.existsInFrame(), "Category ITServices  is displayed");
		wbeITServices.clickOnSync(20);
		WaitAllegis.hardWait(MAX_TIMEOUT);
		validateItemContent(iTServicesTREASURY);
	}

	/**
	 * Method to validate number of items and validate those are the correct items
	 * in Onboard/Offboard category for Helpdesk user
	 */
	public void onBoardOffBoardHELPDESK() {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		TestReporter.logStep("verify category and label for : Onboarding/offboarding");
		TestReporter.assertTrue(wbeOnboardingOffboarding.existsInFrame(), "Category Onboarding/offboarding  is displayed");
		wbeOnboardingOffboarding.clickOnSync(20);
		WaitAllegis.hardWait(MAX_TIMEOUT);
		validateItemContent(onBoardingOffboardingOptionsHELPDESK);
	}
	
	/**
	 * Method to validate number of items and validate those are the correct items
	 * in software category for ITIL
	 **/
	public void softwareITIL() {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		TestReporter.logStep("verify category and label for : Software");
		TestReporter.assertTrue(wbeSoftware.existsInFrame(), "Category Software  is displayed");
		wbeSoftware.clickOnSync(20);
		WaitAllegis.hardWait(MAX_TIMEOUT);
		validateItemContent(softwareOptionsITIL);
	}

	/**
	 * validate number of items in catalog
	 * 
	 * @param mainCategory
	 *            Main Category
	 * @param itemName
	 *            used to print correct name on console
	 * @param itemSize
	 *            print correct number of sub categories
	 * 
	 */
	public void validateTotalItems(Element mainCategory, String categoryLabel, int itemSize) {
		TestReporter.logStep("verify category and label for : " + categoryLabel);
		TestReporter.assertTrue(mainCategory.existsInFrame(), "Category " + categoryLabel + "  is displayed");
		mainCategory.clickOnSync(20);
		WaitAllegis.hardWait(MAX_TIMEOUT);
		Element wbeheaderLabel = driver
				.findElement(By.xpath("//div[@class='col-xs-9']/h1[@class='h4 m-t-none break-word ng-binding']"));
		TestReporter.assertTrue(wbeheaderLabel.getText().contains(categoryLabel),
				"Category " + categoryLabel + " label is displayed");
		TestReporter.logStep("validate items count for : " + categoryLabel);
		if (!btnShowMore.existsInFrame(2)) {
			List<Element> catalogContentTitle = driver.findElements(By.xpath("//div[@class='overflow-100']/h2"));
			TestReporter.assertEquals(itemSize, catalogContentTitle.size(),
					"Item " + categoryLabel + " size: " + catalogContentTitle.size() + " matches as expected.");
		} else {
			TestReporter.assertTrue(btnShowMore.existsInFrame(), "Show more button is displayed.");
			do {
				btnShowMore.scrollIntoView();
				btnShowMore.clickOnSync(20);
				WaitAllegis.hardWait(MAX_TIMEOUT);
			} while (btnShowMore.existsInFrame(5));
			List<Element> catalogContentTitle = driver.findElements(By.xpath("//div[@class='overflow-100']/h2"));
			TestReporter.assertEquals(itemSize, catalogContentTitle.size(),
					"Item " + categoryLabel + " size: " + catalogContentTitle.size() + " matches as expected.");
		}
	}

	/**
	 * Validate the item content
	 * 
	 * @param optionContentsTitle
	 *            array used for validation
	 * @param categories
	 *            main catalog categories
	 * 
	 */

	public void validateItemContent(String[] optionContentsTitle) {
		TestReporter.logStep("Validate item content");
		try {
			for (int i = 0; i < optionContentsTitle.length; i++) {
				Element headerText = driver.findElement(By.xpath("//div[@class='overflow-100']/h2[@title=\"" + optionContentsTitle[i] + "\"]"));
				String itemtext = headerText.getAttribute("title");
				if (itemtext.trim().contentEquals(optionContentsTitle[i].trim())) {
					TestReporter.assertTrue(true,
							"Expected: " + optionContentsTitle[i] + ", Actual: " + itemtext + " - Matched");
				} else {
					TestReporter.assertTrue(false,
							"Expected: " + optionContentsTitle[i] + ", Actual: " + itemtext + " - Not Matched");
				}
				TestReporter.assertTrue(wbeViewDetails.existsInFrame(), "View Details link was Displayed for the item");
			}

		} catch (NoSuchElementException e) {
			TestReporter.logStep("Error message: " + e);
		}
	}
}
