package com.allegis.sailpoint;

import java.util.ResourceBundle;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.allegis.snow.base.LoginPage;

import com.allegis.snow.portal.OrderConfirmationPage;
import com.allegis.snow.portal.OrderGuideChooseOptionPage;
import com.allegis.snow.portal.OrderGuideDescribeNeedsPage;
import com.allegis.snow.portal.OrderGuideSummaryPage;
import com.allegis.snow.portal.OrderStatusPage;
import com.allegis.snow.portal.PortalService;

import com.framework.utils.Constants;
import com.framework.utils.Preamble;
import com.framework.utils.TestEnvironment;
import com.framework.utils.TestReporter;
import com.framework.utils.annotationsAllegis.Retry;
import com.framework.utils.dataProviders.ExcelDataProvider;

/**
 * Represents an NA New Hire OnBoarding Request for NO Services
 * 
 * @author Kiran
 * @version 1.0
 * @since 09-01-2018/
 */
public class NANewHireOnBoardingNoServices extends TestEnvironment {
	public static String resource = "src/main/resources/excelsheets/NewHireNA_TestData.xlsx";

	/**
	 * read the data from excel for No Services MSU
	 * 
	 * @param None.
	 * @return None
	 */
	@DataProvider(name = "TestDataMSU", parallel = true)
	public Object[][] TestDataMSU() {
		try {

			Object[][] excelData = new ExcelDataProvider("/excelsheets/NewHireNA_TestData.xlsx",
					"NewHireNANoServicesMSUtest").getTestData();
			return excelData;

		} catch (RuntimeException e) {
			TestReporter.assertTrue(false, "An error occured with accessing the data provider: " + e);
		}
		return new Object[][] { {} };
	}

	/**
	 * read the data from excel for No Services MLA
	 * 
	 * @param None.
	 * @return None
	 */
	@DataProvider(name = "TestDataMLA", parallel = true)
	public Object[][] TestDataMLA() {
		try {

			Object[][] excelData = new ExcelDataProvider("/excelsheets/NewHireNA_TestData.xlsx",
					"NewHireNANoServicesMLAtest").getTestData();
			return excelData;

		} catch (RuntimeException e) {
			TestReporter.assertTrue(false, "An error occured with accessing the data provider: " + e);
		}
		return new Object[][] { {} };
	}

	/**
	 * read the data from excel for No Services AERO
	 * 
	 * @param None.
	 * @return None
	 */
	@DataProvider(name = "TestDataAERO", parallel = true)
	public Object[][] TestDataAERO() {
		try {

			Object[][] excelData = new ExcelDataProvider("/excelsheets/NewHireNA_TestData.xlsx",
					"NewHireNANoServicesAEROtest").getTestData();
			return excelData;

		} catch (RuntimeException e) {
			TestReporter.assertTrue(false, "An error occured with accessing the data provider: " + e);
		}
		return new Object[][] { {} };
	}

	/**
	 * read the data from excel for No Services AERO
	 * 
	 * @param None.
	 * @return None
	 */
	@DataProvider(name = "TestDataTEK", parallel = true)
	public Object[][] TestDataTEK() {
		try {

			Object[][] excelData = new ExcelDataProvider("/excelsheets/NewHireNA_TestData.xlsx",
					"NewHireNANoServicesTEKtest").getTestData();
			return excelData;

		} catch (RuntimeException e) {
			TestReporter.assertTrue(false, "An error occured with accessing the data provider: " + e);
		}
		return new Object[][] { {} };
	}

	/**
	 * setup the environment and launch the application.
	 * 
	 * @param runLocation      local/remote.
	 * 
	 * @param browserUnderTest Chrome/IE/FireFox.
	 * @param browserVersion   version of the browser.
	 * @param operatingSystem  window.
	 * @param environment      test/prod.
	 * @param updateVersionOne result status true/false.
	 * @return None.
	 */
	@BeforeClass
	@Parameters({ "runLocation", "browserUnderTest", "browserVersion", "operatingSystem", "environment",
			"updateVersionOne" })
	public void setup(@Optional String runLocation, String browserUnderTest, String browserVersion,
			String operatingSystem, String environment, boolean updateVersionOne) {
		setBrowserUnderTest(browserUnderTest);
		setBrowserVersion(browserVersion);
		setOperatingSystem(operatingSystem);
		setRunLocation(runLocation);
		setTestEnvironment(environment);
		setUpdateVersionOne(updateVersionOne);
	}

	/**
	 * close opened application.
	 * 
	 * @param testResults Result of the test case.
	 * @return None
	 */
	@AfterClass
	public void close(ITestContext testResults) {
		endTest("New Hire OnBoard for North America", testResults);
	}

	/**
	 * NA New Hire OnBoarding.Create a a New Hire OnBoard Request with NO services
	 * MSU workflow
	 * 
	 * @param All data from excel.
	 * @return None
	 * @throws Exception
	 */
	@Retry(5)
	@Test(enabled = false, dataProvider = "TestDataMSU", description = "New Hire OnBoard Request.")
	// @Preamble(versionOneTestID = { RT_NEWHIREREQUESTNANSMSU })
	public void newHireOnBoardNANoServicesMSU(String number, String firstName, String middleName, String lastName,
			String country, String officeCode, String opcoCode, String departmentCode, String programCode,
			String buildingAccess, String remote, String hiringManager, String jobCode, String isRehire,
			String selectComputer, String monitor, String selectPhoneSetup, String headSet, String primaryEmailDomain,
			String needEmailAddress, String isMobile, String keyBoardLanguage, String powerCable, String badge,
			String phoneModel, String phoneNumber, String displayName, String mirrorUser, String requestFor)
			throws Exception {
		int row = Integer.parseInt(number);
		setApplicationUnderTest("SERVICENOWPORTAL");
		String NEWHIREREQUEST = null;
		String userRolePortal = "SERVICENOWNEWHIRENANOSERVICES_TEST";

		testStart("New Hire OnBoard for North America- NoServices MSU WF");
		TestReporter.logStep("Login to application : New Hire OnBoard for North America- NoServices MSU WF");
		TestReporter.logStep("Environment :" + environment);

		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.loginWithCredentialServiceNow(userRolePortal);

		PortalService portal = new PortalService(getDriver());
		portal.navigateOnboardEmployeeSailPointNorthAmerica(environment);

		OrderGuideDescribeNeedsPage describeNeeds = new OrderGuideDescribeNeedsPage(getDriver());
		describeNeeds.employeeInformationFirstName(firstName);
		describeNeeds.employeeInformationMiddleName(middleName);
		describeNeeds.employeeInformationlastName(lastName);
		describeNeeds.officeInformationCountry(country);
		describeNeeds.employeeInformationDefaultEmailDomain("No");
		describeNeeds.officeInformationOfficeLocation(officeCode);
		describeNeeds.officeInformationOperatingCompany(opcoCode);
		// Commented as of now and will be uncommented later
		// describeNeeds.employeeInformationNetAccount("No");
		describeNeeds.employeeInformationPersonalEmailAddress();
		describeNeeds.officeInformationProgram(programCode);
		describeNeeds.officeInformationBuildingAccess(buildingAccess);
		describeNeeds.officeInformationRemote(remote);
		describeNeeds.jobInformationStartDateWithoutValidation();
		describeNeeds.jobInformationHiringManager(hiringManager);
		describeNeeds.jobInformationJobTitle(jobCode);
		describeNeeds.equipmentNeedsComputer(selectComputer, country);
		describeNeeds.equipmentNeedsPhoneSetup(selectPhoneSetup, country);
		describeNeeds.additionalItems("No");
		describeNeeds.next();

		OrderGuideChooseOptionPage chooseOptions = new OrderGuideChooseOptionPage(getDriver());
		chooseOptions.chooseOptionsTabValidation();
		chooseOptions.includedItemsValidationCodeNoServices(opcoCode, primaryEmailDomain, needEmailAddress);

		chooseOptions.buildingAccesValidation(badge);
		chooseOptions.next();

		OrderGuideSummaryPage summary = new OrderGuideSummaryPage(getDriver());
		summary.summaryOptionsTabValidation();
		summary.orderGuideDetailsJobNoServices(opcoCode);
		summary.orderNow();

		OrderConfirmationPage orderConf = new OrderConfirmationPage(getDriver());
		orderConf.orderConfirmation(userRolePortal);
		orderConf.handleWait(lastName);

		synchronized (this) {
			OrderStatusPage orderStatus = new OrderStatusPage(getDriver());
			NEWHIREREQUEST = orderStatus.checkoutAndCaptureRequest();
			orderStatus.writeTo(resource, "NewHireNANoServicesMSUtest", "requestNumber", row, NEWHIREREQUEST);
		}

	}

	/**
	 * NA New Hire Onboarding. Create a a New Hire OnBoard Request workflow MLA.
	 * 
	 * @param All data from excel.
	 * @return None
	 * @throws Exception
	 */
	@Retry(5)
	@Test(enabled = false, dataProvider = "TestDataMLA", description = "New Hire OnBoard Request workflow MLA.")
	// @Preamble(versionOneTestID = { RT_NEWHIREREQUESTNANSMLA })
	public void newHireOnBoardNANoServicesMLA(String number, String firstName, String middleName, String lastName,
			String country, String officeCode, String opcoCode, String departmentCode, String programCode,
			String buildingAccess, String remote, String hiringManager, String jobCode, String isRehire,
			String selectComputer, String toComputer, String monitor, String selectPhoneSetup, String headSet,
			String primaryEmailDomain, String needEmailAddress, String isMobile, String vdiAccess,
			String keyBoardLanguage, String powerCable, String badge, String phoneModel, String phoneNumber,
			String displayName, String macAddress, String mirrorUser, String requestFor) throws Exception {
		int row = Integer.parseInt(number);
		setApplicationUnderTest("SERVICENOWPORTAL");
		String NEWHIREREQUESTMLA = null;

		String userRolePortal = "SERVICENOWNEWHIRENANOSERVICES_TEST";

		testStart("New Hire OnBoard for North America- No Services MLA WF");
		TestReporter.logStep("Login to application : New Hire OnBoard for North America- No Services MLA WF");
		TestReporter.logStep("Environment :" + environment);

		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.loginWithCredentialServiceNow(userRolePortal);

		PortalService portal = new PortalService(getDriver());
		portal.navigateOnboardEmployeeSailPointNorthAmerica(environment);

		OrderGuideDescribeNeedsPage describeNeeds = new OrderGuideDescribeNeedsPage(getDriver());
		describeNeeds.employeeInformationFirstName(firstName);
		describeNeeds.employeeInformationMiddleName(middleName);
		describeNeeds.employeeInformationlastName(lastName);
		describeNeeds.officeInformationCountry(country);
		describeNeeds.employeeInformationDefaultEmailDomain("No");
		describeNeeds.officeInformationOfficeLocation(officeCode);
		describeNeeds.officeInformationOperatingCompany(opcoCode);
		describeNeeds.officeInformationDepartment(departmentCode);
		describeNeeds.officeInformationRemote(remote);
		describeNeeds.jobInformationStartDateWithoutValidation();
		describeNeeds.jobInformationHiringManager(hiringManager);
		describeNeeds.jobInformationJobTitle(jobCode);
		describeNeeds.equipmentReqMLA(selectComputer, monitor, headSet);
		describeNeeds.equipmentNeedsComputer(toComputer, country);
		describeNeeds.equipmentNeedsPhoneSetup(selectPhoneSetup, country);
		describeNeeds.equipmentNeedsHeadSetMLA(headSet);
		describeNeeds.additionalItems("No");
		describeNeeds.next();

		OrderGuideChooseOptionPage chooseOptions = new OrderGuideChooseOptionPage(getDriver());
		chooseOptions.chooseOptionsTabValidation();
		chooseOptions.includedItemsValidationCodeNoServices(opcoCode, primaryEmailDomain, needEmailAddress);
		chooseOptions.wirelessHeadsetValidation();
		chooseOptions.next();

		OrderGuideSummaryPage summary = new OrderGuideSummaryPage(getDriver());
		summary.summaryOptionsTabValidation();
		summary.orderGuideDetailsJobNoServices(opcoCode);
		summary.orderNow();

		OrderConfirmationPage orderConf = new OrderConfirmationPage(getDriver());
		orderConf.orderConfirmation(userRolePortal);
		orderConf.handleWait(lastName);

		synchronized (this) {
			OrderStatusPage orderStatus = new OrderStatusPage(getDriver());
			NEWHIREREQUESTMLA = orderStatus.checkoutAndCaptureRequest();
			orderStatus.writeTo(resource, "NewHireNANoServicesMLAtest", "requestNumber", row, NEWHIREREQUESTMLA);
		}

	}

	/**
	 * NA New Hire Onboarding. Create a a New Hire OnBoard Request NO Services for
	 * AERO WF
	 * 
	 * @param All data from excel.
	 * @return None
	 * @throws Exception
	 */
	@Retry(5)
	@Test(enabled = false, dataProvider = "TestDataAERO", description = "New Hire OnBoard Request workflow TEK BOA Desktop without Approval.")
	// @Preamble(versionOneTestID = { RT_NEWHIREREQUESTNANSAERO })
	public void newHireOnBoardNANoServicesAERO(String number, String firstName, String middleName, String lastName,
			String country, String officeCode, String opcoCode, String departmentCode, String programCode,
			String buildingAccess, String remote, String hiringManager, String jobCode, String isRehire,
			String selectComputer, String toComputer, String monitor, String selectPhoneSetup, String toPhoneSetup,
			String headSet, String primaryEmailDomain, String needEmailAddress, String isMobile,
			String keyBoardLanguage, String powerCable, String badge, String phoneModel, String phoneNumber,
			String displayName, String mirrorUser, String requestFor, String groups) throws Exception {
		int row = Integer.parseInt(number);
		setApplicationUnderTest("SERVICENOWPORTAL");
		String NEWHIREREQUESTAEROTEK = null;

		String userRolePortal = "SERVICENOWNEWHIRENANOSERVICES_TEST";

		testStart("New Hire OnBoard for North America- No Services Aero WF");
		TestReporter.logStep("Login to application : New Hire OnBoard for North America- No Services Aero WF");
		TestReporter.logStep("Environment :" + environment);

		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.loginWithCredentialServiceNow(userRolePortal);

		PortalService portal = new PortalService(getDriver());
		portal.navigateOnboardEmployeeSailPointNorthAmerica(environment);

		OrderGuideDescribeNeedsPage describeNeeds = new OrderGuideDescribeNeedsPage(getDriver());
		describeNeeds.employeeInformationFirstName(firstName);
		describeNeeds.employeeInformationMiddleName(middleName);
		describeNeeds.employeeInformationlastName(lastName);
		describeNeeds.officeInformationCountry(country);
		describeNeeds.employeeInformationDefaultEmailDomain("No");
		describeNeeds.officeInformationOfficeLocation(officeCode);
		describeNeeds.officeInformationOperatingCompany(opcoCode);
		describeNeeds.officeInformationDepartment(departmentCode);
		describeNeeds.officeInformationRemote(remote);
		describeNeeds.jobInformationStartDateWithoutValidation();
		describeNeeds.jobInformationHiringManager(hiringManager);
		describeNeeds.jobInformationJobTitle(jobCode);
		describeNeeds.equipmentReqAEROTEK(selectComputer, monitor, selectPhoneSetup);
		describeNeeds.equipmentNeedsComputer(toComputer, country);
		describeNeeds.equipmentNeedsPhoneSetup(toPhoneSetup, country);
		describeNeeds.applicationNeedsAccessAEROTEK();
		describeNeeds.additionalItems("No");
		describeNeeds.next();

		OrderGuideChooseOptionPage chooseOptions = new OrderGuideChooseOptionPage(getDriver());
		chooseOptions.chooseOptionsTabValidation();
		chooseOptions.includedItemsValidationCodeNoServices(opcoCode, primaryEmailDomain, needEmailAddress);
		chooseOptions.onBaseAccessValidation();
		chooseOptions.peopleSoftFSAccessValidation(mirrorUser);
		chooseOptions.peopleSoftHRAccessValidation(mirrorUser);
		chooseOptions.peopleSoftOasisAccessValidation(mirrorUser);
		chooseOptions.timeExpenseAccessValidation();
		chooseOptions.next();

		OrderGuideSummaryPage summary = new OrderGuideSummaryPage(getDriver());
		summary.summaryOptionsTabValidation();
		summary.orderGuideDetailsJobNoServices(opcoCode);
		summary.orderNow();

		OrderConfirmationPage orderConf = new OrderConfirmationPage(getDriver());
		orderConf.orderConfirmation(userRolePortal);
		orderConf.handleWait(lastName);

		synchronized (this) {

			OrderStatusPage orderStatus = new OrderStatusPage(getDriver());
			NEWHIREREQUESTAEROTEK = orderStatus.checkoutAndCaptureRequest();

			orderStatus.writeTo(resource, "NewHireNANoServicesAEROtest", "requestNumber", row, NEWHIREREQUESTAEROTEK);
		}

	}

	/**
	 * NA New Hire Onboarding. Create a a New Hire OnBoard Request NO Services TEK
	 * WF.
	 * 
	 * @param All data from excel.
	 * @return None
	 * @throws Exception
	 */
	@Retry(5)
	@Test(enabled = true, dataProvider = "TestDataTEK", description = "New Hire OnBoard Request workflow TEK BOA Desktop without Approval.")
	// @Preamble(versionOneTestID = { RT_NEWHIREREQUESTNANSTEK })
	public void newHireOnBoardNANoServicesTEK(String number, String firstName, String middleName, String lastName,
			String country, String officeCode, String opcoCode, String departmentCode, String programCode,
			String buildingAccess, String remote, String hiringManager, String jobCode, String isRehire,
			String selectComputer, String toComputer, String monitor, String selectPhoneSetup, String toPhoneSetup,
			String headSet, String primaryEmailDomain, String needEmailAddress, String isMobile,
			String keyBoardLanguage, String powerCable, String badge, String phoneModel, String phoneNumber,
			String displayName, String mirrorUser, String requestFor, String groups, String permission, String drive1,
			String drive2, String drive3, String drive4) throws Exception {
		int row = Integer.parseInt(number);
		setApplicationUnderTest("SERVICENOWPORTAL");
		String NEWHIREREQUESTTEK = null;

		String userRolePortal = "SERVICENOWNEWHIRENATRAVELLAPTOPTHREE_TEST";

		testStart("New Hire OnBoard for North America- No Services TEK WF");
		TestReporter.logStep("Login to application : New Hire OnBoard for North America- No Services TEK WF");
		TestReporter.logStep("Environment :" + environment);

		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.loginWithCredentialServiceNow(userRolePortal);

		PortalService portal = new PortalService(getDriver());
		portal.navigateOnboardEmployeeSailPointNorthAmerica(environment);

		OrderGuideDescribeNeedsPage describeNeeds = new OrderGuideDescribeNeedsPage(getDriver());
		describeNeeds.employeeInformationFirstName(firstName);
		describeNeeds.employeeInformationMiddleName(middleName);
		describeNeeds.employeeInformationlastName(lastName);
		describeNeeds.officeInformationCountry(country);
		describeNeeds.employeeInformationDefaultEmailDomain("No");
		describeNeeds.officeInformationOfficeLocation(officeCode);
		describeNeeds.officeInformationOperatingCompany(opcoCode);
		describeNeeds.officeInformationDepartment(departmentCode);
		describeNeeds.officeInformationRemote(remote);
		describeNeeds.jobInformationStartDateWithoutValidation();
		describeNeeds.jobInformationHiringManager(hiringManager);
		describeNeeds.jobInformationJobTitle(jobCode);
		describeNeeds.equipmentReqTEK(selectComputer, monitor, selectPhoneSetup);
		describeNeeds.equipmentNeedsComputerTEK(toComputer, country);
		describeNeeds.equipmentNeedsPhoneSetup(toPhoneSetup, country);
		describeNeeds.applicationNeedsAccessTEK();
		describeNeeds.additionalItems("No");
		describeNeeds.next();

		OrderGuideChooseOptionPage chooseOptions = new OrderGuideChooseOptionPage(getDriver());
		chooseOptions.chooseOptionsTabValidation();
		chooseOptions.includedItemsValidationCodeNoServices(opcoCode, primaryEmailDomain, needEmailAddress);
		chooseOptions.onBaseAccessValidation();
		chooseOptions.peopleSoftFSAccessValidation(mirrorUser);
		chooseOptions.peopleSoftOasisAccessValidation(mirrorUser);
		chooseOptions.timeExpenseAccessValidation();
		chooseOptions.sDriveAccessValidation(permission, drive1, drive2, drive3, drive4);
		chooseOptions.next();

		OrderGuideSummaryPage summary = new OrderGuideSummaryPage(getDriver());
		summary.summaryOptionsTabValidation();
		summary.orderGuideDetailsJobNoServices(opcoCode);
		summary.orderNow();

		OrderConfirmationPage orderConf = new OrderConfirmationPage(getDriver());
		orderConf.orderConfirmation(userRolePortal);
		orderConf.handleWait(lastName);

		synchronized (this) {
			OrderStatusPage orderStatus = new OrderStatusPage(getDriver());
			NEWHIREREQUESTTEK = orderStatus.checkoutAndCaptureRequest();

			orderStatus.writeTo(resource, "NewHireNANoServicesTEKtest", "requestNumber", row, NEWHIREREQUESTTEK);
		}

	}
}