package com.allegis.sailpoint;

import org.testng.annotations.DataProvider;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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
import com.framework.utils.Preamble;
import com.framework.utils.TestEnvironment;
import com.framework.utils.TestReporter;
import com.framework.utils.annotationsAllegis.Retry;
import com.framework.utils.dataProviders.ExcelDataProvider;

import com.framework.utils.TestEnvironment;

public class SailPointNANewHireOnBoardingMSU extends TestEnvironment {
public static String resource = "src/main/resources/excelsheets/SailPoint_TestData.xlsx";
	
	/**
	 * read the data from excel.
	 * 
	 * @param None.
	 * @return None
	 */
	@Parameters({"environment"})
	@DataProvider(name = "TestData",parallel=true)
	public Object[][] TestData() {
		try {
			Object[][] excelData = new ExcelDataProvider("/excelsheets/SailPoint_TestData.xlsx", "SailPointDataSheetMSU").getTestData();
			return excelData;
		} catch (Exception e) {
			TestReporter.assertTrue(false, "An error Occured with trying to access the data provider");
			e.printStackTrace();
		}
		return new Object[][] { {} };
	}
		
	/**
	 * setup the environment and launch the application.
	 * 
	 * @param runLocation
	 *            local/remote.
	 *            
	 * @param browserUnderTest
	 *            Chrome/IE/FireFox.
	 * @param browserVersion
	 *            version of the browser.
	 * @param operatingSystem
	 *            window.
	 * @param environment
	 *            test/prod.
	 * @param updateVersionOne
	 *            result status true/false.
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
	 * @param testResults
	 *            Result of the test case.
	 * @return None
	 */
	@AfterClass
	public void close(ITestContext testResults) {
		endTest("New Hire OnBoard for SailPoint North America", testResults);
	}

	/**
	 * NA New Hire OnBoarding SailPoint. Create a a New Hire OnBoard Request for SailPoint
	 * 
	 * @param All data from excel.
	 * @return None
	 * @throws Exception 
	 */
	@Retry(5)
	@Test(dataProvider = "TestData", enabled = true, description = "New Hire OnBoard Request for SailPoint.")
	//@Preamble(versionOneTestID = {  RT_NEWHIREREQUESTNA })
	public void newHireOnBoardSailPointNA (String number, String firstName, String middleName, String lastName
			,String country,String officeLocation, String operatingCompany,String department,String program
			,String buildingAccess,String remote, String hiringManager,String jobTitle, String isRehire
			,String selectComputer,String monitor,String selectPhoneSetup,String headSet
			, String primaryEmailDomain, String needEmailAddress,String isMobile, String keyBoardLanguage, String powerCable,String badge,String phoneModel,String phoneNumber,String displayName,String mirrorUser,String groups,String accessType,String requestFor) throws Exception {
		int row = Integer.parseInt(number);
		setApplicationUnderTest("SERVICENOWPORTAL");
		String NEWHIREREQUESTSAILPOINTNA = null;
		String userRolePortal="SERVICENOWNEWHIRENA_TEST";	
		testStart("New Hire OnBoard for Sail Point North America");
		TestReporter.logStep("Login to application : New Hire OnBoard for North America");
		TestReporter.logStep("Environment :"+environment);
		
		LoginPage loginPage= new LoginPage(getDriver());
		loginPage.loginWithCredentialServiceNow("SERVICENOWNEWHIRENA_TEST");
		
		PortalService portal = new PortalService(getDriver());
		portal.navigateOnboardEmployeeSailPointNorthAmerica(environment);;
		
		OrderGuideDescribeNeedsPage describeNeeds =  new OrderGuideDescribeNeedsPage(getDriver());	
		
		describeNeeds.employeeInformationFirstName(firstName);
		describeNeeds.employeeInformationMiddleName(middleName);
		describeNeeds.employeeInformationlastName(lastName);
		describeNeeds.officeInformationCountry(country);
		describeNeeds.employeeInformationDefaultEmailDomain("No");
		describeNeeds.officeInformationOfficeLocation(officeLocation);
		describeNeeds.officeInformationOperatingCompany(operatingCompany);
		describeNeeds.employeeInformationPersonalEmailAddress();
		describeNeeds.officeInformationProgram(program);
		describeNeeds.officeInformationBuildingAccess(buildingAccess);
		describeNeeds.officeInformationRemote(remote);
		describeNeeds.jobInformationStartDateWithoutValidation();
		describeNeeds.jobInformationHiringManager(hiringManager);
		describeNeeds.jobInformationJobTitle(jobTitle);
		describeNeeds.equipmentNeedsComputer(selectComputer, country);
		describeNeeds.equipmentNeedsMonitor(monitor);
		describeNeeds.equipmentNeedsPhoneSetup(selectPhoneSetup, country);
		describeNeeds.equipmentNeedsHeadSet(headSet);
		describeNeeds.applicationNeedsAccess();
		describeNeeds.additionalItems("No");
		describeNeeds.next();
		
		OrderGuideChooseOptionPage chooseOptions = new OrderGuideChooseOptionPage(getDriver());	
		chooseOptions.chooseOptionsTabValidation();
		chooseOptions.includedItemsSailPointValidationCode(jobTitle, primaryEmailDomain, needEmailAddress);
		chooseOptions.standardLaptopValidation("MSU");
		chooseOptions.buildingAccesValidation(badge);
		chooseOptions.deskPhoneValidation(phoneModel, phoneNumber, displayName);
		chooseOptions.peopleSoftFSAccessValidation(mirrorUser);
		chooseOptions.peopleSoftHRAccessValidation(mirrorUser);
		chooseOptions.peopleSoftNVAccessValidation(mirrorUser);
		chooseOptions.peopleSoftOasisAccessValidation(mirrorUser);
		chooseOptions.onboardingAutomationAccessValidation(mirrorUser);
		chooseOptions.wssrdAccessValidation(groups);
		chooseOptions.salesForceAccessValidation(accessType, mirrorUser);
		chooseOptions.hyperionValidation(mirrorUser);
		chooseOptions.next();
		
		OrderGuideSummaryPage  summary = new OrderGuideSummaryPage(getDriver());	
		summary.summaryOptionsTabValidation();
		summary.orderGuideDetailsJob(jobTitle);
		summary.orderNow();
		
		OrderConfirmationPage  orderConf = new OrderConfirmationPage(getDriver());	
		orderConf.orderConfirmation(userRolePortal);
		orderConf.handleWait(lastName);
		synchronized(this) {
		OrderStatusPage  orderStatusNA= new OrderStatusPage(getDriver());	
		NEWHIREREQUESTSAILPOINTNA = orderStatusNA.checkoutAndCaptureRequest();
		orderStatusNA.writeTo(resource, "SailPointDatasheetMSU", "requestNumber", row, NEWHIREREQUESTSAILPOINTNA);
		}
		
		
}
}