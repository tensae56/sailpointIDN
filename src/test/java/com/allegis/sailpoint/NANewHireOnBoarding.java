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
 * Represents an NA New Hire OnBoarding Request
 * 
 * @author Kiran
 * @version 1.0
 * @since 04-23-2018/
 */
public class NANewHireOnBoarding extends TestEnvironment {
	public static String resource = "src/main/resources/excelsheets/NewHireNA_TestData.xlsx";

	/**
	 * read the data from excel.
	 * 
	 * @param None.
	 * @return None
	 */
	@Parameters({ "environment" })
	@DataProvider(name = "TestData", parallel = true)
	public Object[][] TestData() {
		try {

			Object[][] excelData = new ExcelDataProvider("/excelsheets/NewHireNA_TestData.xlsx", "NewHireNAtest")
					.getTestData();
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
	 * NA New Hire OnBoarding.Create a a New Hire OnBoard Request.
	 * 
	 * @param All data from excel.
	 * @return None
	 * @throws Exception
	 */
	@Retry(5)
	@Test(dataProvider = "TestData", enabled = true, description = "New Hire OnBoard Request.")
	// @Preamble(versionOneTestID = { RT_NEWHIREREQUESTNA })
	public void newHireOnBoardNA(String number, String firstName, String middleName, String lastName, String country,
			String officeCode, String opcoCode, String departmentCode, String programCode, String buildingAccess,
			String remote, String hiringManager, String jobTitle, String isRehire, String selectComputer,
			String monitor, String selectPhoneSetup, String headSet, String primaryEmailDomain, String needEmailAddress,
			String isMobile, String keyBoardLanguage, String powerCable, String badge, String phoneModel,
			String phoneNumber, String displayName, String mirrorUser, String groups, String accessType,
			String requestFor) throws Exception {
		int row = Integer.parseInt(number);
		setApplicationUnderTest("SERVICENOWPORTAL");
		String NEWHIREREQUEST = null;
		// String supervisor=RestAPICalls.returnSupervisorUsMSU(environment);
		String userRolePortal = "SERVICENOWNEWHIRENATRAVELLAPTOPTHREE_TEST";
		// String
		// department=RestAPICalls.returnDepartmentProgram(environment,departmentCode);
		// String
		// officeLocation=RestAPICalls.returnOfficeLocation(environment,officeCode);
		// String opCo=RestAPICalls.returnOperatingCompany(environment,opcoCode);
		// String jobTitle=RestAPICalls.returnJobTitle(environment,jobCode);
		testStart("New Hire OnBoard for North America");
		TestReporter.logStep("Login to application : New Hire OnBoard for North America");
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
		describeNeeds.officeInformationDepartment(departmentCode);
		describeNeeds.officeInformationRemote(remote);
		describeNeeds.jobInformationStartDateWithoutValidation();
		describeNeeds.jobInformationHiringManager(hiringManager);
		describeNeeds.jobInformationJobTitle(jobTitle);
		describeNeeds.equipmentNeedsComputer(selectComputer, country);
		describeNeeds.equipmentNeedsPhoneSetup(selectPhoneSetup, country);
		describeNeeds.additionalItems("No");
		describeNeeds.next();

		OrderGuideChooseOptionPage chooseOptions = new OrderGuideChooseOptionPage(getDriver());
		chooseOptions.chooseOptionsTabValidation();
		chooseOptions.includedItemsValidationCodeNoServices(opcoCode, primaryEmailDomain, needEmailAddress);
		chooseOptions.next();

		OrderGuideSummaryPage summary = new OrderGuideSummaryPage(getDriver());
		summary.summaryOptionsTabValidation();
		summary.orderNow();

		OrderConfirmationPage orderConf = new OrderConfirmationPage(getDriver());
		orderConf.orderConfirmation(userRolePortal);
		orderConf.handleWait(lastName);
		synchronized (this) {
			OrderStatusPage orderStatus = new OrderStatusPage(getDriver());
			NEWHIREREQUEST = orderStatus.checkoutAndCaptureRequest();
			orderStatus.writeTo(resource, "NewHireNAtest", "requestNumber", row, NEWHIREREQUEST);
		}
	}
}
