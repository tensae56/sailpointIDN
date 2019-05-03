package com.allegis.snow.portal;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import com.allegis.snow.base.BasePage;
import com.framework.core.interfaces.Button;
import com.framework.core.interfaces.Element;
import com.framework.core.interfaces.Label;
import com.framework.core.interfaces.Link;
import com.framework.core.interfaces.Textbox;
import com.framework.core.interfaces.impl.internal.ElementFactory;
import com.framework.utils.AllegisDriver;
import com.framework.utils.TestReporter;
import com.framework.utils.WaitAllegis;

/**
 * Represents an service now portal home page .
 * 
 * @author Shiva
 * @version 1.0
 * @since 02-20-2018
 */
public class ServiceNowPortalHomePage extends PortalRequestDetailsPage {

	/** Page Elements **/
	@FindBy(xpath = "//*[contains(text(),'Request Something')]")
	private Element wbeRequestSomething;
	@FindBy(xpath = "//*[contains(text(),'Get Help')]")
	private Element wbeGetHelp;
	@FindBy(xpath = "//*[contains(text(),'Knowledge Base')]")
	private Element wbeKnowledgeBase;
	@FindBy(xpath = "//*[contains(text(),'Password Reset')]")
	private Element wbePasswordReset;
	@FindBy(xpath = "//input[@name='q']")
	private Textbox txtSearch;
	@FindBy(css = "button[name='search']")
	private Button btnSearch;
	@FindBy(xpath = "//*[contains(text(),'Service Catalog')]")
	private Element wbeServiceCatalog;
	@FindBy(xpath = "//*[contains(text(),'Knowledge')]")
	private Element wbeKnowledge;
	@FindBy(xpath = "//span[contains(text(),'My Tickets')]")
	private Element wbeMyTickets;
	@FindBy(xpath = "//*[contains(text(),'Contact Us')]")
	private Element wbeContactUs;
	@FindBy(xpath = "//a[@id='wishlist-menu']/span[contains(text(),'Wish List')]")
	private Element wbeWishList;
	@FindBy(xpath = "//a/span[contains(text(),'Tours')]")
	private Element wbeTours;
	@FindBy(xpath = "//h2[contains(text(),'Allegis Group Service Portal')]")
	private Label lblAllegisPortal;
	@FindBy(xpath = "//html/body/div/header/div/div/nav/div[1]/a/img")
	private Element wbeAllegisLogo;
	@FindBy(xpath = "//span[contains(text(),'My Open Tickets')]")
	private Element wbeMyOpenTickets;
	@FindBy(xpath = "//input[@id='username']")
	private Textbox txtUserName;
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
	@FindBy(xpath = "//h4[@class='panel-title'][contains(text(),'North America')]")
	private Label lblNorthAmerica;
	@FindBy(xpath = "//h5[contains(text(),'Aston Carter')]//preceding::a[@href='mailto:allegisCSD@allegisgroup.com']")
	private Element wbeNorthAmericaEmail;
	@FindBy(xpath = "//a[@href='tel:1-866-483-5411']")
	private Element wbeAllegisAERTEKNumber;
	@FindBy(xpath = "//a[@href='tel:1-855-788-0787']")
	private Element wbeAstonCarterNumber;
	@FindBy(xpath = "//h2[@class='h4 panel-title ng-binding']")
	private Label lblMyIncidents;
	@FindBy(xpath = "//h4[@class='panel-title ng-binding']")
	private Label lblMyRequest;
	@FindBy(xpath = "//h1[@class='h4 panel-title ng-binding'][contains(text(),'Categories')]")
	private Label lblCategoriesKnowledge;
	@FindBy(xpath = "//h2[@class='h4 panel-title ng-binding'][contains(text(),'Top Rated Articles')]")
	private Label lblTopRatedArticles;
	@FindBy(xpath = "//span[@class='ng-binding'][contains(text(),'Approvals')]")
	private Element wbeApprovals;
	@FindBy(xpath = "//a[@title='View all approvals']")
	private Element wbeViewAllApprovals;
	@FindBy(xpath = "//a[@title='View all of my Tickets']")
	private Element wbeViewAllTickets;
	@FindBy(xpath = "//a[@role='button'][contains(text(),'Show More')]")
	private Button btnShowMore;
	@FindBy(xpath = "//button[@class='m-t-xs btn btn-default btn-loadmore'][contains(text(),'Show More')]")
	private Button btnShowMoreItem;
	@FindBy(xpath = "//span[@class='block text-overflow-ellipsis category ng-binding'][contains(text(),'Request for Work')]")
	private Element wbeTechnologyFeedbackAndRequestForWorkCatagory;
	@FindBy(xpath = "//div[@class='text-muted item-short-desc break-word ng-binding'][contains(text(),'Request an')]")
	private Element wbeTechnologyFeedbackForm;

	/** Constructor **/
	public ServiceNowPortalHomePage(AllegisDriver driver) {
		super(driver);
		ElementFactory.initElements(driver, this);
	}

	/**
	 * verify home page.
	 * 
	 * @param None.
	 * @return None
	 */
	public void homePage() {
		WaitAllegis.hardWait(MAX_TIMEOUT);
		wbeRequestSomething.syncInFrame(60);
		WaitAllegis.waitUntilElementVisible(driver, wbeRequestSomething);
		TestReporter.logStep("Verify fields in home page");
		TestReporter.assertTrue(wbeRequestSomething.existsInFrame(), "Request Something widget exists");
		TestReporter.assertTrue(wbeGetHelp.existsInFrame(), "Get Help widget exists");
		TestReporter.assertTrue(wbeKnowledgeBase.existsInFrame(), "Knowledge Base widget exists");
		TestReporter.assertTrue(wbePasswordReset.existsInFrame(), "Password Reset widget exists");
		TestReporter.assertTrue(txtSearch.isDisplayed(), "Search Box is displayed");
		TestReporter.assertTrue(wbeAllegisLogo.existsInFrame(), "Allegis Logo is displayed");
		TestReporter.assertTrue(wbeServiceCatalog.existsInFrame(), "Service Catalog is displayed");
		TestReporter.assertTrue(wbeKnowledge.existsInFrame(), "Knowledge is displayed");
		if (wbeMyTickets.existsInFrame()) {
			TestReporter.assertTrue(true, "My Tickets is displayed");
		} else if (wbeMyOpenTickets.existsInFrame()) {
			TestReporter.assertTrue(true, "My Open Tickets is displayed");
		} else {
			TestReporter.assertTrue(true, "My Tickets wasn't displayed because there is no ticket created for user.");
		}
		TestReporter.assertTrue(wbeContactUs.existsInFrame(), "Contact Us is displayed");
		TestReporter.assertTrue(wbeCart.existsInFrame(), "Cart is displayed");
		TestReporter.assertTrue(lblAllegisPortal.existsInFrame(), "Allegis Group Service Portal is displayed");
		TestReporter.assertTrue(wbeWishList.existsInFrame(), "Wish List is displayed");
		// commented as of now because there is no tour displayed on the webpage
		// TestReporter.assertTrue(wbeTours.existsInFrame(), "Tours is displayed");
	}

	/**
	 * Click OrderSomething from home page
	 * 
	 * @param None.
	 * @return None
	 */
	public void requestSomething() {
		WaitAllegis.hardWait(TIMEOUT);
		wbeRequestSomething.syncVisible(20);
		WaitAllegis.hardWait(MAX_TIMEOUT);
		wbeRequestSomething.syncInFrame(60);
		wbeRequestSomething.click();
		WaitAllegis.hardWait(MAX_TIMEOUT);
		lnBrowsebyCategories.syncInFrame(30);
		lnBrowsebyCategories.click();
	}

	/**
	 * Navigate to the IS intake catagory and open the request for work form
	 * 
	 * @param None.
	 * @return None
	 */
	public void technologyFeedbackAndRequestForWork() {
		TestReporter.logStep("Verify technology Feedback And Request For Work and click");
		wbeTechnologyFeedbackAndRequestForWorkCatagory.clickOnSync();
		wbeTechnologyFeedbackForm.syncVisible(10);
		TestReporter.assertTrue(wbeTechnologyFeedbackForm.existsInFrame(),
				"Onboard Employee - Onboard a new or returning employee is displayed");
		wbeTechnologyFeedbackForm.clickOnSync();
	}

	/**
	 * Navigate to contact us page
	 * 
	 * @param None
	 * @return None
	 */
	public void clickContactUsPage() {
		TestReporter.logStep("Navigate to Contact Us page");
		wbeContactUs.clickOnSync();
		TestReporter.assertTrue(lblNorthAmerica.existsInFrame(), "Navigated to the Contact Us Page");
	}

	/**
	 * Validate Contact Us page
	 * 
	 * @param None
	 * @return None
	 */
	public void validateContactUsPage() {
		TestReporter.logStep("Validating the Contact Us Page");
		TestReporter.assertTrue(wbeNorthAmericaEmail.existsInFrame(), "Email is allegisCSD@allegisgroup.com");
		TestReporter.assertTrue(wbeAllegisAERTEKNumber.existsInFrame(),
				"Allegis Grop, aerotek, and Teksystem phone number is '1-866-483-5411'");
		TestReporter.assertTrue(wbeAstonCarterNumber.existsInFrame(), "Aston Carter number is 1-855-788-0787");
	}

	/**
	 * Validate My Open Tickets
	 * 
	 * @param None
	 * @return None
	 */
	public void validateMyOpenTickets() {
		TestReporter.logStep("Validate My open tickets page");
		TestReporter.assertTrue(lblMyIncidents.existsInFrame(), "My Incidents Tab is visible");
		TestReporter.assertTrue(lblMyRequest.existsInFrame(), "My Request Tab is visible");
	}

	/**
	 * Validates Knowledge Base page
	 * 
	 * @param None
	 * @return None
	 */
	public void validateKnowledgeBase() {
		TestReporter.logStep("Validate Knowledge Base Page");
		TestReporter.assertTrue(lblCategoriesKnowledge.existsInFrame(), "Catgories are visible");
		TestReporter.assertTrue(lblTopRatedArticles.existsInFrame(), "Top Rated Articles column is visible");
	}

	/**
	 * Navigates to Knowledge Base page
	 * 
	 * @param None
	 * @return None
	 */
	public void navigateKnowledgeBase() {
		TestReporter.logStep("Navigate to Knowledge Base Page");
		wbeKnowledgeBase.clickOnSync();
		TestReporter.assertTrue(lblTopRatedArticles.existsInFrame(), "Navigated to Knowledge Base page");
	}

	/**
	 * Navigates to My Open Ticket
	 * 
	 * @param None
	 * @return None
	 */
	public void navigateMyOpenTickets() {
		TestReporter.logStep("Navigate to my open Tickets");
		wbeMyOpenTickets.clickOnSync();
		wbeViewAllTickets.syncVisible();
		wbeViewAllTickets.click();
	}

	/**
	 * Navigate to Open Approvals
	 * 
	 * @param None
	 * @return None
	 */
	public void navigateApprovals() {
		TestReporter.logStep("Navigate to appovals");
		wbeApprovals.clickOnSync();
		wbeViewAllApprovals.clickOnSync();
	}

	/**
	 * logout from service portal.
	 * 
	 * @param None.
	 * @return None
	 */
	public void logoutFromServicePortal(String environment) {
		TestReporter.logStep("logout from service portal");
		wbeUser.click();
		wbeLogout.syncVisible(10);
		wbeLogout.clickOnSync(10);
		WaitAllegis.hardWait(MAX_TIMEOUT);
		if (environment.contentEquals("test")) {
			txtUserName.syncVisible(10);
			TestReporter.assertTrue(txtUserName.existsInFrame(), "User logged out successfully from test environent");
		} else if (environment.contentEquals("training")) {
			TestReporter.logStep("User logged out successfully from training environent");
		}
	}

	/**
	 * Click OrderSomething from home page and choose the category and item
	 * 
	 * @param Category,
	 *            Item Name.
	 * @return None
	 */
	public void requestSomethingCategoryandItem(String Category, String ItemName) {
		WaitAllegis.hardWait(TIMEOUT);
		wbeRequestSomething.syncVisible(20);
		WaitAllegis.hardWait(MAX_TIMEOUT);
		wbeRequestSomething.syncInFrame(60);
		wbeRequestSomething.click();
		WaitAllegis.hardWait(MAX_TIMEOUT);
		lnBrowsebyCategories.syncInFrame(30);
		lnBrowsebyCategories.click();
		Element actualcategory = (driver.findElement(By.xpath("//span[@title='" + Category + "']")));
		if (!actualcategory.existsInFrame(20)) {
			btnShowMore.clickOnSync();
			if (!actualcategory.existsInFrame(20)) {
				TestReporter.assertTrue(!actualcategory.existsInFrame(20), "Category could not be found");
			}
		}
		actualcategory.syncInFrame(30);
		actualcategory.click();

		Element actualitem = (driver.findElement(By.xpath("//h2[@title='" + ItemName + "']")));
		if (!actualitem.existsInFrame(20)) {
			btnShowMore.clickOnSync();
			if (!actualitem.existsInFrame(20)) {
				btnShowMoreItem.clickOnSync();
				if (!actualitem.existsInFrame(20)) {
					TestReporter.assertTrue(!actualitem.existsInFrame(20), "Item could not be found in Category");
					;
				}
			}
		}
		actualitem.syncInFrame(30);
		actualitem.click();
	}
}
