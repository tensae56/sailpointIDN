
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
import com.allegis.snow.portal.ServiceCatalogPage;
import com.allegis.snow.portal.ServiceNowPortalHomePage;
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
 * @since 11/5/2018
 */
public class APACNewHireOnBoarding  extends TestEnvironment{
	public static String resource="src/main/resources/excelsheets/NewHireAPAC_TestDataLoad.xlsx";
	
	/**
	 * read the data from excel.
	 * 
	 * @param None.
	 * @return None
	 */
	@Parameters({"environment"})
	@DataProvider(name = "TestDataLoad",parallel=true)
	public Object[][] TestDataLoad() {
		try {
			if (environment.contentEquals("training")||environment.contentEquals("temp")) {			
				Object[][] excelData = new ExcelDataProvider("/excelsheets/NewHireAPAC_TestDataLoad.xlsx", "NewHireAPACtest").getTestData();
				return excelData;
			}
			else if (environment.contentEquals("test")) {
				Object[][] excelData = new ExcelDataProvider("/excelsheets/NewHireAPAC_TestDataLoad.xlsx", "NewHireAPACtest").getTestData();
				return excelData;
			}
		} catch (RuntimeException e) {
			TestReporter.assertTrue(false, "An error occured with accessing the data provider: " + e);
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
		endTest("New Hire OnBoard for North America", testResults);
	}
	

	/**
	 * NA New Hire OnBoarding.Create a a New Hire OnBoard Request.
	 * 
	 * @param All data from excel.
	 * @return None
	 * @throws Exception 
	 */
	
	/**
	 * NA New Hire OnBoarding.Create a a New Hire OnBoard Request.
	 * 
	 * @param All data from excel.
	 * @return None
	 * @throws Exception 
	 */
	@Retry(5)
	@Test(dataProvider = "TestDataLoad", enabled = true, description = "New Hire OnBoard Requestfor APAC")
	//@Preamble(versionOneTestID = {  RT_NEWHIREREQUESTNA })
	public void newHireOnBoardAPACDataLoad (String number,String firstName,String middleName, String lastName , String prefName
			,String country,String officeLocation, String operatingCompany,String department,String program
			,String buildingAccess,String remote, String hiringManager,String jobTitle, String employeeID,String primaryEmailDomain, String needEmailAddress,
			String requestFor) throws Exception {
		int row= Integer.parseInt(number);
		setApplicationUnderTest("SERVICENOWPORTAL");
		testStart("New Hire OnBoard Requestfor APAC");
		String userRolePortal= "SERVICENOWAPAC_TEST";
		TestReporter.logStep("Login to application : New Hire OnBoard Requestfor APAC");
		TestReporter.logStep("Environment :"+environment);
		
		LoginPage loginPage= new LoginPage(getDriver());
		loginPage.loginWithCredentials(userRolePortal);
		
		ServiceNowPortalHomePage homePagePortal = new ServiceNowPortalHomePage(getDriver());
		homePagePortal.requestSomething();
		
		ServiceCatalogPage catalogPage = new ServiceCatalogPage(getDriver());
		catalogPage.onBoardingoffBoardingOnBoard();
		catalogPage.onBoardAPAC();
		
		OrderGuideDescribeNeedsPage describeNeeds =  new OrderGuideDescribeNeedsPage(getDriver());	
		describeNeeds.onBoardEmployeeSection();
		describeNeeds.employeeInformationFirstName(firstName);
		describeNeeds.employeeInformationMiddleName(middleName);
		describeNeeds.employeeInformationlastName(lastName);
		describeNeeds.employeeInformationPrefferedDisplayName(prefName);
		describeNeeds.officeInformationCountry(country);
		describeNeeds.officeInformationOfficeLocation(officeLocation);
		describeNeeds.officeInformationOperatingCompany(operatingCompany);
		describeNeeds.officeInformationDepartment(department);
		describeNeeds.officeInformationRemote(remote);
		describeNeeds.jobInformationStartDateWithoutValidation();
		describeNeeds.jobInformationHiringManager(hiringManager);
		describeNeeds.jobInformationJobTitle(jobTitle);
		describeNeeds.jobInformationEmployeeID(employeeID);
		describeNeeds.next();
		
		OrderGuideChooseOptionPage chooseOptions = new OrderGuideChooseOptionPage(getDriver());	
		chooseOptions.chooseOptionsTabValidation();
		chooseOptions.includedItemsValidationCodeAPAC();
		chooseOptions.sailPointUserAccountValidation(primaryEmailDomain, needEmailAddress);
		chooseOptions.next();
				
		OrderGuideSummaryPage  summary = new OrderGuideSummaryPage(getDriver());	
		summary.summaryOptionsTabValidation();
		summary.orderGuideDetailsAPAC();
		summary.orderNow();
		
		OrderConfirmationPage  orderConf = new OrderConfirmationPage(getDriver());	
		orderConf.orderConfirmation(userRolePortal);
		orderConf.handleWait(lastName);
		synchronized(this) {
		
		OrderStatusPage orderStatus= new OrderStatusPage(getDriver());	
		String NEWHIREREQUESTAPAC=orderStatus.checkoutAndCaptureRequest();
		
		orderStatus.writeTo(resource,"NewHireAPACtest","requestNumber",row,NEWHIREREQUESTAPAC);
		}
	}
}